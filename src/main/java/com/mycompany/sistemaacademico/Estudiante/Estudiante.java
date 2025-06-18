/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Estudiante;

import com.mycompany.sistemaacademico.PersonaInstitucional.PersonaInstitucional;
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

