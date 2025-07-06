package com.mycompany.sistema.academico.Controladores;
import com.mycompany.sistema.academico.Estudiante.Estudiante;
import com.mycompany.sistema.academico.Estudiante.Estudiantes;
import com.mycompany.sistema.academico.Vistas.NotificadorMensajes;
import com.mycompany.sistema.academico.Vistas.VEstudiantes;
import javax.swing.table.DefaultTableModel;
public class ControladorEstudiante {
private VEstudiantes vistaEstudiantes;
private NotificadorMensajes notificadorMensajes;
private Estudiantes iEstudiantes;
    public ControladorEstudiante(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMensajes = new NotificadorMensajes();
        this.iEstudiantes = new Estudiantes();
    }
    
    public void procesoControladorEstudiante(){
        try{
            int idEstudiantes = Integer.parseInt(vistaEstudiantes.getIDEstudiante());
            String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            String correoPersonal = vistaEstudiantes.getCorreoPersonalEstudiante();
            String correoInstitucional = vistaEstudiantes.getCorreoInstitucionalEstudiante();
            boolean respuesta = iEstudiantes.agregaEstudiante(codigoEstudiante, correoInstitucional, idEstudiantes, nombreEstudiante, correoPersonal, cedulaEstudiante);
            if (respuesta) {
    System.out.println("Estudiante agregado correctamente.");
    actualizarTabla();
    vistaEstudiantes.limpiarCampos();
} else {
    notificadorMensajes.mostrarMensaje("No se pudo agregar: ID o Código duplicado.");
}
        }catch(Exception e){
            notificadorMensajes.mostrarMensaje("Error");
        }
    }

private void actualizarTabla() {
    DefaultTableModel modelo = vistaEstudiantes.getModeloTabla();
    modelo.setRowCount(0); // limpiar filas

    for (int i = 0; i < iEstudiantes.getTotalEstudiantes(); i++) {
        Estudiante e = iEstudiantes.obtenerEstudiantes()[i];
        if (e != null) {
            modelo.addRow(new Object[] {
                e.getId(),
                e.getNombre(),
                e.getCedula(),
                e.getCorreoInstitucional(),
                e.getCorreoPersonal(),
                e.getCodigo()
            });
        }
    }
}
public void actualizarEstudianteSeleccionado() {
    try {
        int fila = vistaEstudiantes.getTabla().getSelectedRow();
        if (fila == -1) {
            notificadorMensajes.mostrarMensaje("Selecciona una fila para actualizar.");
            return;
        }

        int idEstudiantes = Integer.parseInt(vistaEstudiantes.getIDEstudiante());
        String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
        int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
        String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
        String correoPersonal = vistaEstudiantes.getCorreoPersonalEstudiante();
        String correoInstitucional = vistaEstudiantes.getCorreoInstitucionalEstudiante();

        Estudiante estudianteActualizado = new Estudiante(codigoEstudiante, correoInstitucional, idEstudiantes, nombreEstudiante, correoPersonal, cedulaEstudiante);
        iEstudiantes.obtenerEstudiantes()[fila] = estudianteActualizado;

        actualizarTabla();
        vistaEstudiantes.limpiarCampos();
        System.out.println("Estudiante actualizado correctamente.");
    } catch (Exception e) {
        notificadorMensajes.mostrarMensaje("Error al actualizar estudiante.");
    }
}
public void eliminarEstudianteSeleccionado() {
    int fila = vistaEstudiantes.getTabla().getSelectedRow();
    if (fila == -1) {
        notificadorMensajes.mostrarMensaje("Selecciona una fila para eliminar.");
        return;
    }

    // Eliminar desplazando los elementos del arreglo
    for (int i = fila; i < iEstudiantes.getTotalEstudiantes() - 1; i++) {
        iEstudiantes.obtenerEstudiantes()[i] = iEstudiantes.obtenerEstudiantes()[i + 1];
    }
    iEstudiantes.datoanuladoEstudiante();

    actualizarTabla();
    vistaEstudiantes.limpiarCampos();
    notificadorMensajes.mostrarMensaje("Estudiante eliminado correctamente.");
}
public void buscarEstudiantePorId() {
    try {
        int idBuscado = Integer.parseInt(vistaEstudiantes.getIdBusqueda());
        Estudiante[] arreglo = iEstudiantes.obtenerEstudiantes();

        for (int i = 0; i < iEstudiantes.getTotalEstudiantes(); i++) {
            if (arreglo[i] != null && arreglo[i].getId() == idBuscado) {
                vistaEstudiantes.setCamposEstudiante(arreglo[i]);
                notificadorMensajes.mostrarMensaje("Estudiante encontrado.");
                return;
            }
        }

        notificadorMensajes.mostrarMensaje("Estudiante no encontrado.");
    } catch (NumberFormatException e) {
        notificadorMensajes.mostrarMensaje("ID inválido.");
    }
}

}
