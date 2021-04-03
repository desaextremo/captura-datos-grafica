/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desaextremo.test;

import com.desaextremo.lecturadatos.CapturaDatosGrafica;

/**
 *
 * @author desaextremo
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero=0;
        String resultado="";
        
        numero = CapturaDatosGrafica.leeInt("Ingrese un numero", "Tablas de multiplicar", 1);
        
        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero*i) + "\n";
        }
        
        CapturaDatosGrafica.muestraMensaje(resultado, "Tabla del " + numero);
        System.exit(0);
    }
}
