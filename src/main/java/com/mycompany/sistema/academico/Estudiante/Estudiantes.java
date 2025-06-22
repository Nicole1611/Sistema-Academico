
package com.mycompany.sistema.academico.Estudiante;


public class Estudiantes implements IEstudiantes{
    private Estudiante[]estudiantes;
    private int totalEstudiantes;
    
    public Estudiantes(int dimension){
        estudiantes = new Estudiante[dimension];
        totalEstudiantes = 0;
    }
    
    public boolean agregaEstudiante(Estudiante estudiante){
        if (totalEstudiantes == estudiantes.length) {
            return false;
        }else{
            estudiantes[totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
                    return true;
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("");
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
    
    public boolean actualizarestudiante(int i, Estudiante estudiante){
        estudiantes[i] = estudiante; 
        return true;
    }
    
    public boolean datoanulado(int i, Estudiante estudiante){
        estudiantes[i] = estudiante;
        return true;
    } 
    public boolean buscarEstudiante(int id){
    for (int i = 0; i < totalEstudiantes; i++) {
        if (estudiantes[i].getId() == id) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudiantes[i]); 
            return true;
        }
    }
    System.out.println("No se encontró un decano con ID " + id);
    return false;
}    
}