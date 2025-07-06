/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Controladores;
import com.mycompany.sistema.academico.Trabajador.Trabajador;
import com.mycompany.sistema.academico.Trabajador.Trabajadores;
import com.mycompany.sistema.academico.Vistas.VTrabajadores;
import com.mycompany.sistema.academico.Vistas.NotificadorMensajes;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class ControladorTrabajador {
 private VTrabajadores vistaTrabajadores;
private NotificadorMensajes notificadorMensajes;
private Trabajadores iTrabajadores;
    public ControladorTrabajador(VTrabajadores vistaTrabajadores) {
        this.vistaTrabajadores = vistaTrabajadores;
        this.notificadorMensajes = new NotificadorMensajes();
        this.iTrabajadores = new Trabajadores();
    }
    
    public void procesoControladorTrabajador(){
        try{
            int idTrabajador = Integer.parseInt(vistaTrabajadores.getIdTrabajador());           
            String nombreTrabajador = vistaTrabajadores.getNombreTrabajador();
            String cedulaTrabajador = vistaTrabajadores.getCedulaTrabajador();          
            String gremioTrabajador = vistaTrabajadores.getGremioTrabajador();           
            String correoPersonal = vistaTrabajadores.getCorreoPersonalTrabajador();
            String correoInstitucional = vistaTrabajadores.getCorreoInstitucionalTrabajador();
            double sueldoTrabajador = Double.parseDouble(vistaTrabajadores.getSueldoTrabajador());
            boolean respuesta = iTrabajadores.agregarTrabajador(gremioTrabajador, sueldoTrabajador, correoInstitucional, idTrabajador, nombreTrabajador, correoPersonal, cedulaTrabajador);
            if (respuesta) {
    System.out.println("Trabajador agregado correctamente.");
    actualizarTabla();
    vistaTrabajadores.limpiarCampos();
} else {
    notificadorMensajes.mostrarMensaje("No se pudo agregar: ID o Código duplicado.");
}
        }catch(Exception e){
            notificadorMensajes.mostrarMensaje("Error");
        }
    }

private void actualizarTabla() {
    DefaultTableModel modelo = vistaTrabajadores.getModeloTabla();
    modelo.setRowCount(0); // limpiar filas

    for (int i = 0; i < iTrabajadores.getTotalTrabajador(); i++) {
        Trabajador t = iTrabajadores.obtenerTrabajador()[i];
        if (t != null) {
            modelo.addRow(new Object[] {
                t.getId(),
                t.getNombre(),
                t.getCedula(),
                t.getGremio(),
                t.getCorreoPersonal(),
                t.getCorreoInstitucional(),                
                t.getSueldo()
            });
        }
    }
}
public void actualizarTrabajadorSeleccionado() {
    try {
        int fila = vistaTrabajadores.getTabla().getSelectedRow();
        if (fila == -1) {
            notificadorMensajes.mostrarMensaje("Selecciona una fila para actualizar.");
            return;
        }

        int idEstudiantes = Integer.parseInt(vistaTrabajadores.getIdTrabajador());
            String cedulaTrabajador = vistaTrabajadores.getCedulaTrabajador();
            String gremioTrabajador = vistaTrabajadores.getGremioTrabajador();
            String nombreTrabajador = vistaTrabajadores.getNombreTrabajador();
            String correoPersonal = vistaTrabajadores.getCorreoPersonalTrabajador();
            String correoInstitucional = vistaTrabajadores.getCorreoInstitucionalTrabajador();
            double sueldoTrabajador = Double.parseDouble(vistaTrabajadores.getSueldoTrabajador());

        Trabajador trabajadorActualizado = new Trabajador(gremioTrabajador, sueldoTrabajador, correoInstitucional, fila, nombreTrabajador, correoPersonal, cedulaTrabajador);
        iTrabajadores.obtenerTrabajador()[fila] = trabajadorActualizado;

        actualizarTabla();
        vistaTrabajadores.limpiarCampos();
        System.out.println("Trabajador actualizado correctamente.");
    } catch (Exception e) {
        notificadorMensajes.mostrarMensaje("Error al actualizar Trabajador.");
    }
}
public void eliminarTrabajadorSeleccionado() {
    int fila = vistaTrabajadores.getTabla().getSelectedRow();
    if (fila == -1) {
        notificadorMensajes.mostrarMensaje("Selecciona una fila para eliminar.");
        return;
    }

    // Eliminar desplazando los elementos del arreglo
    for (int i = fila; i < iTrabajadores.getTotalTrabajador() - 1; i++) {
        iTrabajadores.obtenerTrabajador()[i] = iTrabajadores.obtenerTrabajador()[i + 1];
    }
    iTrabajadores.datoanuladoTrabajador();

    actualizarTabla();
    vistaTrabajadores.limpiarCampos();
    notificadorMensajes.mostrarMensaje("Trabajador eliminado correctamente.");
}
public void buscarTrabajadorPorId() {
    try {
        int idBuscado = Integer.parseInt(vistaTrabajadores.getIdBusqueda());
        Trabajador[] arreglo = iTrabajadores.obtenerTrabajador();

        for (int i = 0; i < iTrabajadores.getTotalTrabajador(); i++) {
            if (arreglo[i] != null && arreglo[i].getId() == idBuscado) {
                vistaTrabajadores.setCamposTrabajador(arreglo[i]);
                notificadorMensajes.mostrarMensaje("Trabajador encontrado.");
                return;
            }
        }

        notificadorMensajes.mostrarMensaje("Trabajador no encontrado.");
    } catch (NumberFormatException e) {
        notificadorMensajes.mostrarMensaje("ID inválido.");
    }
}

}
