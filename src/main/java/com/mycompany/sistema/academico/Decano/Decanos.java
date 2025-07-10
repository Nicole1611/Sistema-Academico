
package com.mycompany.sistema.academico.Decano;

public class Decanos implements IDecanos{
    //atributo 
    private Decano [] decanos;
    private int totalDecanos;
    // constructor//
    public Decanos(int dimension) {
        decanos= new Decano[dimension];
        totalDecanos=0;
    }
    //arreglo//
    public Decanos() {
       decanos = new Decano[100];
        totalDecanos = 0;
    }
    //metodos//
     public boolean agregaDecanos(String nivelJerarquico, double sueldo, String correoInstitucional, int idDecanos, String nombreDecanos, String correoPersonal, String cedulaDecano){
        if (totalDecanos == decanos.length) {
            return false;}
        for (int i = 0; i < totalDecanos; i++) {
        if (decanos[i].getId() == idDecanos ){
            return false; 
        } }        
            Decano decano = new Decano(nivelJerarquico, sueldo, correoInstitucional, idDecanos, nombreDecanos, correoPersonal, cedulaDecano);
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos +1;
                    return true;
        }
    public Decano[] obtenerDecanos() {
    return decanos;
    }
    public int getTotalDecanos() {
        return totalDecanos;
    }
    
    public void datoanulado(){
        totalDecanos--;
    } 
    }

