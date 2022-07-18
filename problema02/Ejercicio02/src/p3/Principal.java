/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        MatriculaCampamento mcamp = new MatriculaCampamento();

        MatriculaColegio mcolegio = new MatriculaColegio();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();

        ArrayList<Matricula> matriculass = new ArrayList<>();
        matriculass.add(mcamp);
        matriculass.add(mcolegio);
        matriculass.add(mescuela);
        matriculass.add(mjardin);
        matriculass.add(mmaternal);
        matriculass.add(mmaternal2);

        for (int i = 0; i < matriculass.size(); i++) {
            matriculass.get(i).establecerTarifa();
        }

        tipos.establecerMatriculas(matriculass);

        tipos.establecerPromedioTarifas();

        System.out.printf("%s\n", tipos);
    }
}
