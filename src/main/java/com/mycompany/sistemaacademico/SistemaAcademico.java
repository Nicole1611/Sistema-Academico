<<<<<<< HEAD:src/main/java/com/mycompany/sistemaacademico/SistemaAcademico.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;
=======
package com.mycompany.sistema.academico;
>>>>>>> dev-Carolina:src/main/java/com/mycompany/sistema/academico/SistemaAcademico.java

import com.mycompany.sistema.academico.Estudiante.Estudiante;
import com.mycompany.sistema.academico.Estudiante.Estudiantes;
import com.mycompany.sistema.academico.Estudiante.IEstudiantes;
import com.mycompany.sistema.academico.Trabajador.ITrabajadores;
import com.mycompany.sistema.academico.Trabajador.Trabajador;
import com.mycompany.sistema.academico.Trabajador.Trabajadores;

public class SistemaAcademico {

    public static void main(String[] args) {
        Estudiante estudiantes[] = new Estudiante[4];
        estudiantes[0] = new Estudiante(101, "jorge@espoch.edu.ec", 1, "Jorge", "jorge@gmail.com", "220048712-1");
        estudiantes[1] = new Estudiante(102, "karla@espoch.edu.ec", 2, "Karla", "karla@gmail.com", "220048712-2");
        estudiantes[2] = new Estudiante(103, "vicente@espoch.edu.ec", 3, "Vicente", "vicente@gmail.com", "220048712-3");
        estudiantes[3] = new Estudiante(104, "esther@espoch.edu.ec", 4, "Esther", "esther@gmail.com", "220048712-4");
        
        Trabajador trabajadores[] = new Trabajador[4];
        trabajadores[0] = new Trabajador("Tecnico", 350, "kevin@espoch.edu.ec", 1, "Kevin", "kevin@gmail.com", "220048712-5");
        trabajadores[1] = new Trabajador("Tecnica", 350, "camila@espoch.edu.ec", 2, "Camila", "camila@gmail.com", "220048712-6");
        trabajadores[2] = new Trabajador("Tecnico", 350, "jose@espoch.edu.ec", 3, "Jose", "jose@gmail.com", "220048712-7");
        trabajadores[3] = new Trabajador("Tecnica", 350, "lucia@espoch.edu.ec", 4, "Lucia", "lucia@gmail.com", "220048712-8");
        
        
        IEstudiantes estudiantes1 = new Estudiantes();
        estudiantes1.imprimir(estudiantes);
        
        ITrabajadores trabajadores1 = new Trabajadores();
        trabajadores1.imprimir(trabajadores);
    }
}

