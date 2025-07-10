/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistema.academico.Profesor;

/**
 *
 * @author anaaw
 */
public interface IProfesores {
    public boolean agregaProfesores(EnumeracionEscalafon Escalafon, double sueldo, String correoInstitucional, int idProfesores, String nombreProfesor, String correoPersonal, String cedulaProfesor); 
    public Profesor[] obtenerProfesor() ;
    public int getTotalProfesor();
    public void datoanuladoProfesor();
}
