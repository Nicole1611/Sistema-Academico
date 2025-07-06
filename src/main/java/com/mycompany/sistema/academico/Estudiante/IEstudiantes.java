
package com.mycompany.sistema.academico.Estudiante;


public interface IEstudiantes {
 public boolean agregaEstudiante(Estudiante estudiante);
 public void imprimir();
 public boolean actualizarestudiante(int i, Estudiante estudiante);
 public boolean datoanulado(int i, Estudiante estudiante);
 public boolean buscarEstudiante(int id);
}
