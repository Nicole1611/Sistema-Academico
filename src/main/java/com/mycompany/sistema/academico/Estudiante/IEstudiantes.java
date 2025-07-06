
package com.mycompany.sistema.academico.Estudiante;


public interface IEstudiantes {
 public boolean agregaEstudiante(int codigoEstudiante, String correoInstitucional, int idEstudiantes, String nombreEstudiante, String correoPersonal, String cedulaEstudiante);
 public Estudiante[] obtenerEstudiantes();
 public int getTotalEstudiantes();
  public void datoanuladoEstudiante();
}
