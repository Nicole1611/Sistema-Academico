/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.Trabajador;

import com.mycompany.sistemaacademico.Empleado.Empleado;
public class Trabajador extends Empleado{
    
    //Atributo
    private String gremio;
    
    //Constructor
    public Trabajador(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }
    //Get y Set
    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }
    //Metodos
    

    @Override
    public String toString() {
        return "PersonalServicios{"+super.toString() + "gremio=" + gremio + '}';
    }
    
}
