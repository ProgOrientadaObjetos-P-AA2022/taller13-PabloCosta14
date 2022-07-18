/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Operaciones {

    private ArrayList<Televisor> televisores;
    private double preciototal;
    private double televisorC;
    private String marcasVendidas;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;

    }

    public ArrayList<Televisor> obtenerTelevisores() {

        return televisores;

    }

    public void establecerTelevisorCaro(double t) {
        televisorC = t;

    }

    public double obtenerTelevisorCaro() {

        return televisorC;

    }

    public void establecertotalPrecioTvs(ArrayList<Televisor> t) {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();
            // System.out.println(s);
        }
        preciototal = s;

    }

    public void establecerPreciototal(double t) {
        preciototal = t;
    }

    public double obtenerPreciototal() {
        return preciototal;
    }

    public void establecertelevisorMasCaro(ArrayList<Televisor> t) {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > s) {
                televisorC = televisores.get(i).obtenerPrecio();
            }
            s = televisorC;
        }

    }

    public void establecerlistaMarcasVendidas(ArrayList<Televisor> t) {
        String s = "Lista de Marcas vendidas:\n";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        marcasVendidas = s;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public void establecerMarcasVendidas(String n) {
        marcasVendidas = n;
    }

    @Override
    public String toString() {
        String cadena = "---------Listado Televisores--------------\n";
        for (int i = 0; i < televisores.size(); i++) {
            cadena = String.format("%sMarca Televisor: %s\n"
                    + "PrecioTelevisor: %.2f\n",
                    cadena,
                    televisores.get(i).obtenerMarca(),
                    televisores.get(i).obtenerPrecio());
        }

        return cadena;
    }
}
