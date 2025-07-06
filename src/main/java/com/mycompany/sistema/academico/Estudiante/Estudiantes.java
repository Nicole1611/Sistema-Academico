
package com.mycompany.sistema.academico.Estudiante;


public class Estudiantes implements IEstudiantes{
   private Estudiante[]estudiantes;
    private int totalEstudiantes;
    
    public Estudiantes(int dimension){
        estudiantes = new Estudiante[dimension];
        totalEstudiantes = 0;
    }

    public Estudiantes() {
        estudiantes = new Estudiante[100];
        totalEstudiantes = 0;
    }
    
    
    public boolean agregaEstudiante(int codigoEstudiante, String correoInstitucional, int idEstudiantes, String nombreEstudiante, String correoPersonal, String cedulaEstudiante){
        if (totalEstudiantes == estudiantes.length) {
            return false;}
        for (int i = 0; i < totalEstudiantes; i++) {
        if (estudiantes[i].getId() == idEstudiantes || estudiantes[i].getCodigo() == codigoEstudiante) {
            return false; 
        } }        
            Estudiante estudiante = new Estudiante(codigoEstudiante, correoInstitucional, idEstudiantes, nombreEstudiante, correoPersonal, cedulaEstudiante);
            estudiantes[totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
                    return true;
        }
    
    public Estudiante[] obtenerEstudiantes() {
    return estudiantes;
    }
    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }
    
    public void datoanuladoEstudiante(){
        totalEstudiantes--;
    } 
}