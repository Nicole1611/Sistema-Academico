
package com.mycompany.sistemaacademico.Persona;

public class Persona {
  //Atributos
    private int id;
    private String nombre;
    private String correoPersonal;
    private String cedula;

//Constructor
    public Persona(int id, String nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }
    
    
//Metodos
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", correoPersonal=" + correoPersonal + ", cedula=" + cedula + '}';
    }

    
}
  

