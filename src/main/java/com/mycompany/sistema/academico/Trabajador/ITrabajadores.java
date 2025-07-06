
package com.mycompany.sistema.academico.Trabajador;


public interface ITrabajadores {  
public boolean agregarTrabajador(String gremioTrabajador, double sueldoTrabajador, String correoInstitucional, int idTrabajador, String nombreTrabajador, String correoPersonal, String cedulaTrabajador);
 public Trabajador[] obtenerTrabajador();
 public int getTotalTrabajador();
  public void datoanuladoTrabajador();
}
