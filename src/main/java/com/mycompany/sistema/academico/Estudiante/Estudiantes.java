
package com.mycompany.sistema.academico.Estudiante;


public class Estudiantes implements IEstudiantes{
    public void agregaEstudiante(){
        
    }
    
    public void imprimir(Estudiante estudiantes[]){
        for (int i = 0; i < 4; i++) {
            System.out.println("ESTUDIANTE");
            System.out.println("ID: " + estudiantes[i].getId());
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Cedula: " + estudiantes[i].getCedula());
            System.out.println("Correo electronico: " + estudiantes[i].getCorreoPersonal());
            System.out.println("Correo institucional: " + estudiantes[i].getCorreoInstitucional());
            System.out.println("Codigo: " + estudiantes[i].getCodigo());
            System.out.println("");
        }
   }
}
