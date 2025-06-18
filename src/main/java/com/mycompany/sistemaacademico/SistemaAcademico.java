

package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.Estudiante.Estudiante;
import com.mycompany.sistemaacademico.Trabajador.Trabajador;
public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println("DATOS DEL OBJETO ESTUDIANTE");
        Estudiante estudiante = new Estudiante(344, "vicente@esp.ecu.ec", 5, "Vicente", "vicente@gmail.com", "454548946-1");
        System.out.println(""+estudiante.toString());
        //Personal Servicios
        System.out.println("DATOS DEL OBJETO PERSONAL SERVICIOS");
        Trabajador trabajador = new Trabajador("Tecnico", 200, "blanca@esp.edu.ec", 7, "Blanca", "blanca@gmail.com", "864524233-7");
        System.out.println(""+trabajador.toString());
    }
}
