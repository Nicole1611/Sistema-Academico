
package com.mycompany.sistema.academico;

import com.mycompany.sistema.academico.Decano.Decano;
import com.mycompany.sistema.academico.Decano.Decanos;
import com.mycompany.sistema.academico.Decano.IDecanos;


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
    }
}

