
package com.mycompany.sistema.academico.Trabajador;

public class Trabajadores implements ITrabajadores{
        private Trabajador[]trabajadores;
    private int totalTrabajadores;
    
    public Trabajadores(int dimension){
        trabajadores = new Trabajador[dimension];
        totalTrabajadores = 0;
    }
    
    public boolean agregaTrabajador(Trabajador trabajador){
        if (totalTrabajadores == trabajadores.length) {
            return false;
        }else{
            trabajadores[totalTrabajadores] = trabajador;
            totalTrabajadores = totalTrabajadores +1;
                    return true;
        }
    }
    
     public void imprimirTrabajador(){
     for (int i = 0; i < totalTrabajadores; i++) {
         System.out.println("");
         System.out.println("TRABAJADOR");
         System.out.println("ID: " + trabajadores[i].getId());
         System.out.println("Nombre: " + trabajadores[i].getNombre());
         System.out.println("Cedula: " + trabajadores[i].getCedula());
         System.out.println("Correo personal: " + trabajadores[i].getCorreoPersonal());
         System.out.println("Correo institucional: " + trabajadores[i].getCorreoInstitucional());
         System.out.println("Sueldo: " + trabajadores[i].getSueldo());
         System.out.println("Gremio: " + trabajadores[i].getGremio());
         System.out.println("");
     }
   }
    
    public boolean actualizarTrabajador(int i, Trabajador trabajador){
        trabajadores[i] = trabajador; 
        return true;
    }
    
    public boolean datoanuladoTrabajador(int i, Trabajador trabajador){
        trabajadores[i] = trabajador;
        return true;
    } 
        public boolean buscarTrabajador(int id){
    for (int i = 0; i < totalTrabajadores; i++) {
        if (trabajadores[i].getId() == id) {
            System.out.println("Trabajador encontrado:");
            System.out.println(trabajadores[i]); 
            return true;
        }
    }
    System.out.println("No se encontró un Trabajador con ID " + id);
    return false;
} 
}


