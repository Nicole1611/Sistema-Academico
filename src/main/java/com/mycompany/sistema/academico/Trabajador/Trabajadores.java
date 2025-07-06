
package com.mycompany.sistema.academico.Trabajador;

public class Trabajadores implements ITrabajadores{
        private Trabajador[]trabajadores;
    private int totalTrabajadores;
    
    public Trabajadores(int dimension){
        trabajadores = new Trabajador[dimension];
        totalTrabajadores = 0;
    }
    
    public Trabajadores() {
        trabajadores = new Trabajador[100];
        totalTrabajadores = 0;
    }
    
    
    public boolean agregarTrabajador(String gremioTrabajador, double sueldoTrabajador, String correoInstitucional, int idTrabajador, String nombreTrabajador, String correoPersonal, String cedulaTrabajador){
        if (totalTrabajadores == trabajadores.length) {
            return false;}
        for (int i = 0; i < totalTrabajadores; i++) {
        if (trabajadores[i].getId() == idTrabajador) {
            return false; 
        } }        
            Trabajador trabajador = new Trabajador( gremioTrabajador,  sueldoTrabajador,  correoInstitucional,  idTrabajador,  nombreTrabajador,  correoPersonal,  cedulaTrabajador);
            trabajadores[totalTrabajadores] = trabajador;
            totalTrabajadores = totalTrabajadores +1;
                    return true;
        }
    
    public Trabajador[] obtenerTrabajador() {
    return trabajadores;
    }
    public int getTotalTrabajador() {
        return totalTrabajadores;
    }
    
    public void datoanuladoTrabajador(){
        totalTrabajadores--;
} 
}


