/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.PersonalAcademico;

/**
 *
 * @author HP
 */
public class PersonalAcademico extends Empleado{
    //Constructor
    public PersonalAcademico(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
    }
    //Metodos
    
    @Override
    public String toString() {
        return "PersonalAcademico{" + super.toString()+ '}';
    }
}
