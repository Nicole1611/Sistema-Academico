package com.mycompany.sistema.academico.Controladores;

import com.mycompany.sistema.academico.Profesor.EnumeracionEscalafon;
import com.mycompany.sistema.academico.Profesor.Profesor;
import com.mycompany.sistema.academico.Profesor.Profesores;
import com.mycompany.sistema.academico.Vistas.NotificadorMensajes;
import com.mycompany.sistema.academico.Vistas.VProfesor;
import javax.swing.table.DefaultTableModel;



public class ControladorProfesor {
private VProfesor vistaProfesor;
private NotificadorMensajes notificadorMensajes;
private Profesores iProfesor;
public ControladorProfesor(VProfesor vistaProfesor) {
        this.vistaProfesor = vistaProfesor;
        this.notificadorMensajes = new NotificadorMensajes();
        this.iProfesor = new Profesores();
        
    } 
private EnumeracionEscalafon identificarEscalafon(String escalafon) {

        EnumeracionEscalafon tipo = EnumeracionEscalafon.AGREGADO;
        if ("PRINCIPAL".equals(escalafon)) {
            tipo = EnumeracionEscalafon.PRINCIPAL;
        } else if ("AGREGADO".equals(escalafon)) {
            tipo = EnumeracionEscalafon.AGREGADO;
        }else if ("AUXILIAR".equals(escalafon)) {
        tipo = EnumeracionEscalafon.AUXILIAR;
        }
        return tipo;
    }

 public void procesoControladorProfesor(){
        try{
            int idProfesor = Integer.parseInt(vistaProfesor.getIDProfesor());
            String nombreProfesor = vistaProfesor.getNombreProfesor();
            String cedulaProfesor= vistaProfesor.getCedulaProfesor();
            String correoPersonal = vistaProfesor.getCorreoPersonalProfesor();
            String correoInstitucional = vistaProfesor.getCorreoInstitucionalProfesor();
            double sueldo = Double.parseDouble(vistaProfesor.getSueldo());
            String escalafonProfesor = vistaProfesor.getEscalafon();
            EnumeracionEscalafon tipoEscalafon = identificarEscalafon(escalafonProfesor);
   boolean respuesta = iProfesor.agregaProfesores(tipoEscalafon, sueldo, correoInstitucional, idProfesor, nombreProfesor, correoPersonal, cedulaProfesor);
            if (respuesta) {
    System.out.println("Profesor agregado correctamente.");
    actualizarTabla();
    vistaProfesor.limpiarCampos();
} else {
    notificadorMensajes.mostrarMensaje("No se pudo agregar: ID ");
}
        }catch(Exception e){
            notificadorMensajes.mostrarMensaje("Error");
        }
    }

private void actualizarTabla() {
    DefaultTableModel modelo = vistaProfesor.getModeloTabla();
    modelo.setRowCount(0); // limpiar filas

    for (int i = 0; i < iProfesor.getTotalProfesor(); i++) {
        Profesor p = iProfesor.obtenerProfesor()[i];
        if (p != null) {
            modelo.addRow(new Object[] {
                p.getId(),
                p.getNombre(),
                p.getCedula(),
                p.getCorreoInstitucional(),
                p.getCorreoPersonal(),
                p.getSueldo(),
                p.getEscalafon()
            });
        }
    }
}
public void actualizarProfesorSeleccionado() {
    try {
        int fila = vistaProfesor.getTabla().getSelectedRow();
        if (fila == -1) {
            notificadorMensajes.mostrarMensaje("Selecciona una fila para actualizar.");
            return;
        }
        int idProfesor = Integer.parseInt(vistaProfesor.getIDProfesor());
            String nombreProfesor = vistaProfesor.getNombreProfesor();
            String cedulaProfesor= vistaProfesor.getCedulaProfesor();
            String correoPersonal = vistaProfesor.getCorreoPersonalProfesor();
            String correoInstitucional = vistaProfesor.getCorreoInstitucionalProfesor();
            double sueldo = Double.parseDouble(vistaProfesor.getSueldo());
            String escalafonProfesor = vistaProfesor.getEscalafon();
            EnumeracionEscalafon tipoEscalafon = identificarEscalafon(escalafonProfesor);
            
        Profesor profesorActualizado = new Profesor(tipoEscalafon, sueldo, correoInstitucional, idProfesor, nombreProfesor, correoPersonal, cedulaProfesor);
        iProfesor.obtenerProfesor()[fila] = profesorActualizado;

        actualizarTabla();
        vistaProfesor.limpiarCampos();
        System.out.println("Profesor actualizado correctamente.");
    } catch (Exception e) {
        notificadorMensajes.mostrarMensaje("Error al actualizar Profesor.");
    }
}
public void eliminarProfesorSeleccionado() {
    int fila = vistaProfesor.getTabla().getSelectedRow();
    if (fila == -1) {
        notificadorMensajes.mostrarMensaje("Selecciona una fila para eliminar.");
        return;
    }

    // Eliminar desplazando los elementos del arreglo
    for (int i = fila; i < iProfesor.getTotalProfesor() - 1; i++) {
        iProfesor.obtenerProfesor()[i] = iProfesor.obtenerProfesor()[i + 1];
    }
    iProfesor.datoanuladoProfesor();

    actualizarTabla();
    vistaProfesor.limpiarCampos();
    notificadorMensajes.mostrarMensaje("Profesor eliminado correctamente.");
}
public void buscarProfesorPorId() {
    try {
        int idBuscado = Integer.parseInt(vistaProfesor.getIdBusqueda());
        Profesor[] arreglo = iProfesor.obtenerProfesor();

        for (int i = 0; i < iProfesor.getTotalProfesor(); i++) {
            if (arreglo[i] != null && arreglo[i].getId() == idBuscado) {
                vistaProfesor.setCamposProfesor(arreglo[i]);
                notificadorMensajes.mostrarMensaje("Profesor  encontrado.");
                return;
            }
        }

        notificadorMensajes.mostrarMensaje("Profesor no encontrado.");
    } catch (NumberFormatException e) {
        notificadorMensajes.mostrarMensaje("ID inválido.");
    }
}

}
