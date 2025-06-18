/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Empleado;

import com.mycompany.sistemaacademico.PersonaInstitucional.PersonaInstitucional;
public class Empleado extends PersonaInstitucional{
    
    //Atributos
    private double sueldo;
    
    //Constructor
    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    //Metodos
    @Override
    public String toString() {
        return "Empleado{" +super.toString() + "sueldo=" + sueldo + '}';
    }
    
    
}