
package com.mycompany.sistema.academico.Estudiante;

import com.mycompany.sistema.academico.PersonaInstitucional.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional{
    
    //Atributo
    private int codigo;
    
    //Constructor
    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }   
    //Get y set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //Metodos

    @Override
    public String toString() {
        return "Estudiantes{" + super.toString()+ "codigo=" + codigo + '}';
    }
    
    
}

