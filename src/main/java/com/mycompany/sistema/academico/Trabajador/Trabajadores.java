
package com.mycompany.sistema.academico.Trabajador;

public class Trabajadores implements ITrabajadores{
    public void agregaTrabajador(){
    
    }
 public void imprimir(Trabajador trabajadores[]){
     for (int i = 0; i < trabajadores.length; i++) {
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
}
