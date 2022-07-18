/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {
    
    private double promedioMatriculas;
    private MatriculaCampamento campamento;
    private MatriculaColegio colegio;
    private ArrayList<Matricula> matriculas;
    // private MatriculaEscuela escuela;
    // private MatriculaJardin jardin;
    // private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;

    public void establecerMatriculas(ArrayList<Matricula> n) {
        matriculas = n;
    }
    
    public ArrayList<Matricula> obtenerMatriculas() {
        
        return matriculas;
    }
    
    public void establecerPromedioTarifas() {
        
        double s = 0;
        for (int i = 0; i < matriculas.size(); i++) {
            s = s + matriculas.get(i).obtenerTarifa();
            
        }
        promedioMatriculas = s / matriculas.size();
        
    }
    
    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    
    @Override
    public String toString() {
        String cadena = "\n";
        for (int i = 0; i < matriculas.size(); i++) {
            System.out.println(matriculas.get(i));
        }
        cadena = String.format("El promedio de tarifas es: %.2f",
                obtenerPromedioTarifas());
        
        return cadena;
    }
}
