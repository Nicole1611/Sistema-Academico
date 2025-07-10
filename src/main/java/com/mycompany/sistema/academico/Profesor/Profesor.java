/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema.academico.Profesor;


import com.mycompany.sistema.academico.PersonalAcademico.PersonalAcademico;



/**
 *
 * @author anaaw
 */
public class Profesor extends PersonalAcademico{
    private EnumeracionEscalafon Escalafon;
    
    //constructores

    public Profesor(EnumeracionEscalafon Escalafon, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.Escalafon = Escalafon;
    }

    public EnumeracionEscalafon getEscalafon() {
        return Escalafon;
    }

    public void setEscalafon(EnumeracionEscalafon Escalafon) {
        this.Escalafon = Escalafon;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString()+"Escalafon=" + Escalafon + '}';
    }

   
    }
   
    

