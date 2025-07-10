/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.PersonaExterna;

import com.mycompany.sistema.academico.PersonaExterna.PersonaExterna;


public class PersonasExternas {
  private PersonaExterna[]personasExternas;
    private int totalPersonasExternas;
    
    public PersonasExternas(int dimension){
        personasExternas = new PersonaExterna[dimension];
        totalPersonasExternas = 0;
    }

    public PersonasExternas() {
        personasExternas = new PersonaExterna[100];
        totalPersonasExternas = 0;
    }
    
    
    public boolean agregaPersonaExterna(String descripcion, int idPersonaExterna, String nombrePersonaExterna, String correoPersonal, String cedulaPersonaExterna){
        if (totalPersonasExternas == personasExternas.length) {
            return false;}
        for (int i = 0; i < totalPersonasExternas; i++) {
        if (personasExternas[i].getId() == idPersonaExterna) {
            return false; 
        } }        
            PersonaExterna personaExterna = new PersonaExterna(descripcion, idPersonaExterna, descripcion, correoPersonal, descripcion);
            personasExternas[totalPersonasExternas] = personaExterna;
            totalPersonasExternas = totalPersonasExternas +1;
                    return true;
        }
    
    public PersonaExterna[] obtenerPersonaExterna() {
    return personasExternas;
    }
    public int getTotalPersonaExterna() {
        return totalPersonasExternas;
    }
    
    public void datoanuladoPersonaExterna(){
        totalPersonasExternas--;
    } 
}
