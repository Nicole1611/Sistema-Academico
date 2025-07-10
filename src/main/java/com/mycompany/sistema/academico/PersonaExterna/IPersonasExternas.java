/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistema.academico.PersonaExterna;


public interface IPersonasExternas {
   public boolean agregaPersonaExterna(String descripcion, int idPersonaExterna, String nombrePersonaExterna, String correoPersonal, String cedulaPersonaExterna);
 public PersonaExterna[] obtenerPersonaExterna();
 public int getTotalPersonaExterna();
  public void datoanuladoPersonaExterna();
}
