/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Decano;

import com.mycompany.sistema.academico.PersonalAcademico.PersonalAcademico;

/**
 *
 * @author anaaw
 */
public class Decano extends PersonalAcademico{
    // atributos 
    private String nivelJerarquico;
    // constructor

    public Decano(String nivelJerarquico, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivelJerarquico = nivelJerarquico;
    }

    
    
    //set y get 

    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }

   
   
}
