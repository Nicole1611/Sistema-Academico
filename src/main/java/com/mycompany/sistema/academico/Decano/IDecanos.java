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
 
public boolean agregarDecano (Decano decano);
public void imprimirDecanos();
public boolean actualizarDecano(int i,Decano decano);
public boolean eliminarDecano(int i, Decano decano);
public boolean buscarDecano(int id);

    
}
