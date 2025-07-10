/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Controladores;
import com.mycompany.sistema.academico.Decano.Decano;
import com.mycompany.sistema.academico.Decano.Decanos;
import com.mycompany.sistema.academico.Vistas.NotificadorMensajes;
import com.mycompany.sistema.academico.Vistas.VDecano;
import javax.swing.table.DefaultTableModel;
public class ControladorDecano {
private VDecano vistaDecano;
private NotificadorMensajes notificadorMensajes;
private Decanos iDecanos;
 public ControladorDecano(VDecano vistaDecano) {
        this.vistaDecano = vistaDecano;
        this.notificadorMensajes = new NotificadorMensajes();
        this.iDecanos = new Decanos();
    }
 
    public void procesoControladorDecano(){
        try{
            int idDecanos = Integer.parseInt(vistaDecano.getIDDecano());
            String nombreDecano = vistaDecano.getNombreDecano();
            String cedulaDecano = vistaDecano.getCedulaDecano();
            String correoPersonal = vistaDecano.getCorreoPersonalDecano();
            String correoInstitucional = vistaDecano.getCorreoInstitucionalDecano();
            String nivelJerarquico =vistaDecano.getNivelJerarquico();
            double sueldo = Double.parseDouble(vistaDecano.getSueldo());
            boolean respuesta = iDecanos.agregaDecanos(nivelJerarquico, sueldo, correoInstitucional, idDecanos, nombreDecano, correoPersonal, cedulaDecano);
            if (respuesta) {
    System.out.println("Decano agregado correctamente.");
    actualizarTabla();
    vistaDecano.limpiarCampos();
} else {
    notificadorMensajes.mostrarMensaje("No se pudo agregar: ID ");
}
        }catch(Exception e){
            notificadorMensajes.mostrarMensaje("Error");
        }
    }

private void actualizarTabla() {
    DefaultTableModel modelo = vistaDecano.getModeloTabla();
    modelo.setRowCount(0); // limpiar filas

    for (int i = 0; i < iDecanos.getTotalDecanos(); i++) {
        Decano e = iDecanos.obtenerDecanos()[i];
        if (e != null) {
            modelo.addRow(new Object[] {
                e.getId(),
                e.getNombre(),
                e.getCedula(),
                e.getCorreoInstitucional(),
                e.getCorreoPersonal(),
                e.getNivelJerarquico(),
                e.getSueldo(),
                
            });
        }
    }
}
public void actualizarDecanoSeleccionado() {
    try {
        int fila = vistaDecano.getTabla().getSelectedRow();
        if (fila == -1) {
            notificadorMensajes.mostrarMensaje("Selecciona una fila para actualizar.");
            return;
        }

        int idDecanos = Integer.parseInt(vistaDecano.getIDDecano());
            String nombreDecano = vistaDecano.getNombreDecano();
            String cedulaDecano = vistaDecano.getCedulaDecano();
            String correoPersonal = vistaDecano.getCorreoPersonalDecano();
            String correoInstitucional = vistaDecano.getCorreoInstitucionalDecano();
            String nivelJerarquico =vistaDecano.getNivelJerarquico();
            double sueldo = Double.parseDouble(vistaDecano.getSueldo());

        Decano decanoActualizado = new Decano(nivelJerarquico, sueldo, correoInstitucional, idDecanos, nombreDecano, correoPersonal, cedulaDecano);
        iDecanos.obtenerDecanos()[fila] = decanoActualizado;

        actualizarTabla();
        vistaDecano.limpiarCampos();
        System.out.println("Decano actualizado correctamente.");
    } catch (Exception e) {
        notificadorMensajes.mostrarMensaje("Error al actualizar estudiante.");
    }
}
public void eliminarDecanoSeleccionado() {
    int fila = vistaDecano.getTabla().getSelectedRow();
    if (fila == -1) {
        notificadorMensajes.mostrarMensaje("Selecciona una fila para eliminar.");
        return;
    }

    // Eliminar desplazando los elementos del arreglo
    for (int i = fila; i < iDecanos.getTotalDecanos()- 1; i++) {
        iDecanos.obtenerDecanos()[i] = iDecanos.obtenerDecanos()[i + 1];
    }
    iDecanos.datoanulado();

    actualizarTabla();
    vistaDecano.limpiarCampos();
    notificadorMensajes.mostrarMensaje("Decano eliminado correctamente.");
}
public void buscarDecanoPorId() {
    try {
        int idBuscado = Integer.parseInt(vistaDecano.getIdBusqueda());
        Decano[] arreglo = iDecanos.obtenerDecanos();

        for (int i = 0; i < iDecanos.getTotalDecanos(); i++) {
            if (arreglo[i] != null && arreglo[i].getId() == idBuscado) {
                vistaDecano.setCamposDecanos(arreglo[i]);
                notificadorMensajes.mostrarMensaje("Decano encontrado.");
                return;
            }
        }

        notificadorMensajes.mostrarMensaje("Decano no encontrado.");
    } catch (NumberFormatException e) {
        notificadorMensajes.mostrarMensaje("ID inválido.");
    }
}
}