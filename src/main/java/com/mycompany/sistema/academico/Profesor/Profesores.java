/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Profesor;


public class Profesores implements IProfesores {
  private Profesor [] profesores;
    private int totalProfesores;
    
    public Profesores(int dimension) {
        profesores= new Profesor[dimension];
        totalProfesores=0;
    }
    public Profesores() {
        profesores = new Profesor[100];
        totalProfesores = 0;
    }

     public boolean agregaProfesores(EnumeracionEscalafon Escalafon, double sueldo, String correoInstitucional, int idProfesores, String nombreProfesor, String correoPersonal, String cedulaProfesor){
        if (totalProfesores == profesores.length) {
            return false;}
        for (int i = 0; i < totalProfesores; i++) {
        if (profesores[i].getId() == idProfesores ) {
            return false; 
        } }        
            Profesor profesor = new Profesor(Escalafon, sueldo, correoInstitucional, idProfesores, nombreProfesor, correoPersonal, cedulaProfesor);
            profesores[totalProfesores] = profesor;
            totalProfesores = totalProfesores +1;
                    return true;
        }
    public Profesor[] obtenerProfesor() {
    return profesores;
    }
    public int getTotalProfesor() {
        return totalProfesores;
    }
    
    public void datoanuladoProfesor(){
        totalProfesores--;
    }

 
    
}
