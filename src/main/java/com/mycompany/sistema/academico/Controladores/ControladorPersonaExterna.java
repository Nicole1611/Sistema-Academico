/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Controladores;

import com.mycompany.sistema.academico.PersonaExterna.PersonaExterna;
import com.mycompany.sistema.academico.PersonaExterna.PersonasExternas;
import com.mycompany.sistema.academico.Vistas.NotificadorMensajes;
import com.mycompany.sistema.academico.Vistas.VPersonaExterna;
import javax.swing.table.DefaultTableModel;


public class ControladorPersonaExterna {
    private VPersonaExterna vistaPersonaExterna;
private NotificadorMensajes notificadorMensajes;
private PersonasExternas iPersonasExternas;

    public ControladorPersonaExterna(VPersonaExterna vistaPersonaExterna) {
        this.vistaPersonaExterna = vistaPersonaExterna;
        this.notificadorMensajes = new NotificadorMensajes();
        this.iPersonasExternas = new PersonasExternas();
    }
    
    public void procesoControladorPersonaExterna(){
        try{
            int idPersonaExterna = Integer.parseInt(vistaPersonaExterna.getIDPersonaExterna());
            String cedulaPersonaExterna = vistaPersonaExterna.getCedulaPersonaExterna();
            String nombrePersonaExterna = vistaPersonaExterna.getNombre();
            String correoPersonal = vistaPersonaExterna.getCorreoPersonalPersonaExterna();
            String descripcion = vistaPersonaExterna.getDescripcion();
            boolean respuesta = iPersonasExternas.agregaPersonaExterna(descripcion, idPersonaExterna, nombrePersonaExterna, correoPersonal, cedulaPersonaExterna);
            if (respuesta) {
    System.out.println("Persona Externa agregada correctamente.");
    actualizarTabla();
    vistaPersonaExterna.limpiarCampos();
} else {
    notificadorMensajes.mostrarMensaje("No se pudo agregar: ID duplicado");
}
        }catch(Exception e){
            notificadorMensajes.mostrarMensaje("Error");
        }
    }

private void actualizarTabla() {
    DefaultTableModel modelo = vistaPersonaExterna.getModeloTabla();
    modelo.setRowCount(0); // limpiar filas

    for (int i = 0; i < iPersonasExternas.getTotalPersonaExterna (); i++) {
        PersonaExterna pe = iPersonasExternas.obtenerPersonaExterna()[i];
        if (pe != null) {
            modelo.addRow(new Object[] {
                pe.getId(),
                pe.getNombre(),
                pe.getCedula(),
                pe.getCorreoPersonal(),
                pe.getDescripcion()
            });
        }
    }
}
public void actualizarPersonaExternaSeleccionado() {
    try {
        int fila = vistaPersonaExterna.getTabla().getSelectedRow();
        if (fila == -1) {
            notificadorMensajes.mostrarMensaje("Selecciona una fila para actualizar.");
            return;
        }
            int idPersonaExterna = Integer.parseInt(vistaPersonaExterna.getIDPersonaExterna());
            String cedulaPersonaExterna = vistaPersonaExterna.getCedulaPersonaExterna();
            String nombrePersonaExterna = vistaPersonaExterna.getNombre();
            String correoPersonal = vistaPersonaExterna.getCorreoPersonalPersonaExterna();
            String descripcion = vistaPersonaExterna.getDescripcion();

        PersonaExterna personaExternaActualizado = new PersonaExterna(descripcion, idPersonaExterna, nombrePersonaExterna, correoPersonal, cedulaPersonaExterna);
        iPersonasExternas.obtenerPersonaExterna()[fila] = personaExternaActualizado;

        actualizarTabla();
        vistaPersonaExterna.limpiarCampos();
        System.out.println("Persona Externa actualizado correctamente.");
    } catch (Exception e) {
        notificadorMensajes.mostrarMensaje("Error al actualizar Persona Externa.");
    }
}
public void eliminarPersonaExternaSeleccionado() {
    int fila = vistaPersonaExterna.getTabla().getSelectedRow();
    if (fila == -1) {
        notificadorMensajes.mostrarMensaje("Selecciona una fila para eliminar.");
        return;
    }

    // Eliminar desplazando los elementos del arreglo
    for (int i = fila; i < iPersonasExternas.getTotalPersonaExterna() - 1; i++) {
        iPersonasExternas.obtenerPersonaExterna()[i] = iPersonasExternas.obtenerPersonaExterna()[i + 1];
    }
    iPersonasExternas.datoanuladoPersonaExterna();

    actualizarTabla();
    vistaPersonaExterna.limpiarCampos();
    notificadorMensajes.mostrarMensaje("Persona Externa eliminado correctamente.");
}
public void buscarPersonaExternaPorId() {
    try {
        int idBuscado = Integer.parseInt(vistaPersonaExterna.getIdBusqueda());
        PersonaExterna[] arreglo = iPersonasExternas.obtenerPersonaExterna();

        for (int i = 0; i < iPersonasExternas.getTotalPersonaExterna(); i++) {
            if (arreglo[i] != null && arreglo[i].getId() == idBuscado) {
                vistaPersonaExterna.setCamposPersonaExterna(arreglo[i]);
                notificadorMensajes.mostrarMensaje("Estudiante encontrado.");
                return;
            }
        }

        notificadorMensajes.mostrarMensaje("Persona Externa no encontrado.");
    } catch (NumberFormatException e) {
        notificadorMensajes.mostrarMensaje("ID inválido.");
    }
}

}

