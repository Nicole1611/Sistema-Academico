
package com.mycompany.sistema.academico.Decano;

public class Decanos implements IDecanos{
    //atributo 
    private Decano [] decanos;
    private int totalDecanos;
    
    public Decanos(int dimension) {
        decanos= new Decano[dimension];
        totalDecanos=0;

    }
    
    
    public boolean agregarDecano(Decano decano){
        if (totalDecanos==decanos.length){
            return false;
        } else {
             decanos[totalDecanos]= decano;
             totalDecanos=totalDecanos +1;
             return true;
            
        }
        
    }
public void imprimirDecanos(){
        for (int i = 0; i <totalDecanos; i++) {
            System.out.println("nivel jerargico"+decanos[i].getNivelJerarquico());
            System.out.println("Nombre"+decanos[i].getNombre());
            System.out.println("sueldo"+decanos[i].getSueldo());
          
           
            
        }
        
    }
    public boolean actualizarDecano(int i,Decano decano){
        decanos[i]=decano;
        return false;
        
    }
    public boolean eliminarDecano(int i,Decano decano){
        decanos[i]=decano;
        return false;
    
    }
    public boolean buscarDecano(int id) {
    for (int i = 0; i < totalDecanos; i++) {
        if (decanos[i].getId() == id) {
            System.out.println("Decano encontrado:");
            System.out.println(decanos[i]); // usa toString()
            return true;
        }
    }
    System.out.println("No se encontró un decano con ID " + id);
    return false;
} 
    }

