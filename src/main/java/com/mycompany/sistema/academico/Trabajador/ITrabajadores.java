
package com.mycompany.sistema.academico.Trabajador;

import com.mycompany.sistema.academico.Trabajador.Trabajador;

public interface ITrabajadores {  
    public boolean agregaTrabajador(Trabajador trabajador);
 public void imprimirTrabajador();
 public boolean actualizarTrabajador(int i, Trabajador trabajador);
 public boolean datoanuladoTrabajador(int i, Trabajador trabajador);
 public boolean buscarTrabajador(int id);
}
