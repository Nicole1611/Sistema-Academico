/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistema.academico.Decano;

/**
 *
 * @author anaaw
 */
public interface IDecanos {
public boolean agregaDecanos(String nivelJerarquico, double sueldo, String correoInstitucional, int idDecanos, String nombreDecanos, String correoPersonal, String cedulaDecano); 
public Decano[] obtenerDecanos();
    public int getTotalDecanos();
    public void datoanulado();
    
}
