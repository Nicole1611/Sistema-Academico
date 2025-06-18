
package com.mycompany.sistema.academico.PersonaInstitucional;

import com.mycompany.sistema.academico.Persona.Persona;
public class PersonaInstitucional extends Persona{
    //Atributo
    private String correoInstitucional;
    //Constructor
    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
   
    //metodos
    
    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString()+ "correoInstitucional=" + correoInstitucional + '}';
   }
}

