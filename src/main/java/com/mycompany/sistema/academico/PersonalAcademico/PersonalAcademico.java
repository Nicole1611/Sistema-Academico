
package com.mycompany.sistema.academico.PersonalAcademico;
import com.mycompany.sistema.academico.Empleado.Empleado;
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
