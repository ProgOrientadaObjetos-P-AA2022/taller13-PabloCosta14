/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matricula {
  
    
        
    @Override
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo libros + costo paseos
        tarifa = 50.2 + 140.2 + 40;
    }
        
    @Override
    public String toString() {

        String cadena = String.format("---------Matricula Jardin--------\n"
                + "Tarifa: %.2f\n", obtenerTarifa());

        return cadena;
    }
}
