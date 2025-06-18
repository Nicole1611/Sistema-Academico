
package com.mycompany.sistemaacademico.PersonaInstitucional;

import com.mycompany.sistemaacademico.Persona.Persona;
public class PersonaInstitucional extends Persona{
    //Atributo
    private String correoInstitucional;
    //Constructor
    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }
   
    //metodos
    
    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString()+ "correoInstitucional=" + correoInstitucional + '}';
   }
}

