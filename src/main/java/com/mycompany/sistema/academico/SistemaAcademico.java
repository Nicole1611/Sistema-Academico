
package com.mycompany.sistema.academico;

import com.mycompany.sistema.academico.Decano.Decano;
import com.mycompany.sistema.academico.Decano.Decanos;
import com.mycompany.sistema.academico.Decano.IDecanos;

import com.mycompany.sistema.academico.Estudiante.Estudiante;
import com.mycompany.sistema.academico.Estudiante.Estudiantes;
import com.mycompany.sistema.academico.Estudiante.IEstudiantes;
import com.mycompany.sistema.academico.Trabajador.*;
public class SistemaAcademico {

    public static void main(String[] args) {

        Decano decano1=new Decano("Presidente", 1," martha@gmail.com ", 1," mar "," martha@gmail.com ", "1234567");
        Decano decano2 =new Decano("Oficial", 3,"majo@", 1,"caro","car@gmali","123456");
        Decano eModificado =new Decano("Oficial", 5,"majo@", 1,"Sol","car@gmali","123456");       
        IDecanos decanos=new Decanos(2);
        decanos.agregarDecano(decano1);
        decanos.agregarDecano(decano2);
        decanos.imprimirDecanos();
        System.out.println("DATOS MODIFICASOS");
        decanos.actualizarDecano(0, eModificado);
        decanos.imprimirDecanos();
        //ESTUDIANTE
        Estudiante estudiante1 = new Estudiante(101, "jorge@espoch.edu.ec", 1, "Jorge", "jorge@gmail.com", "220048712-1");
        Estudiante estudiante2 = new Estudiante(102, "karla@espoch.edu.ec", 2, "Karla", "karla@gmail.com", "220048712-2");
        Estudiante estudiante3 = new Estudiante(103, "vicente@espoch.edu.ec", 3, "Vicente", "vicente@gmail.com", "220048712-3");       
        Estudiante eModificadoEstudiante = new Estudiante (100, "jorge@espoch.edu.ec", 1, "Jorge", "jorge@gmail.com", "220048712-1");
        Estudiante Anulado = new Estudiante(0, "", 0,"", "", "");
        IEstudiantes estudiantes = new Estudiantes(3);
        estudiantes.agregaEstudiante(estudiante1);
        estudiantes.agregaEstudiante(estudiante2);
        estudiantes.agregaEstudiante(estudiante3);
        estudiantes.imprimir();  
        System.out.println("Datos Modificados");
        estudiantes.actualizarestudiante(0, eModificadoEstudiante);
        estudiantes.imprimir();
        System.out.println("Dato anulado");
        estudiantes.datoanulado(2, Anulado);
        estudiantes.imprimir();
        System.out.println("BUSQUEDA DE Estudiante");
        estudiantes.buscarEstudiante(1);
        //TRABAJADOR
        Trabajador trabajador1 = new Trabajador("Tecnico", 430, "mateo.@espoch.edu.ec", 1, "Mateo", "mateo@gmail.com", "220048712-4");
        Trabajador trabajador2 = new Trabajador("Tecnica", 430, "maite.@espoch.edu.ec", 2, "Maite", "maite@gmail.com", "220048712-5");
        Trabajador trabajador3 = new Trabajador("Tecnico", 430, "luis.@espoch.edu.ec", 3, "Luis", "luis@gmail.com", "220048712-6");     
        Trabajador eModificadoTrabajador = new Trabajador ("Tecnico", 480, "maite.@espoch.edu.ec", 2, "Maite", "maite@gmail.com", "220048712-4");
        Trabajador AnuladoTrabajador = new Trabajador("", 0, "", 0, "", "", "");
        ITrabajadores trabajadores = new Trabajadores(3);
        trabajadores.agregaTrabajador(trabajador1);
        trabajadores.agregaTrabajador(trabajador2);
        trabajadores.agregaTrabajador(trabajador3);
        trabajadores.imprimirTrabajador();  
        System.out.println("Datos Modificados");
        trabajadores.actualizarTrabajador(1, eModificadoTrabajador);
        trabajadores.imprimirTrabajador();
        System.out.println("Dato anulado");
        trabajadores.datoanuladoTrabajador(2, AnuladoTrabajador);
        trabajadores.imprimirTrabajador();
        System.out.println("BUSQUEDA DE Trabajador");
        trabajadores.buscarTrabajador(1);
    }
}

