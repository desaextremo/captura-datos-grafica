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
public class TestString {

    public static void main(String[] args) {
        String nombre;
        nombre = CapturaDatosGrafica.leeString("Cual es tu nombre:", "Nombre", 1);
        CapturaDatosGrafica.muestraMensaje("Hola " + nombre, "Saludar");
        System.exit(0);
    }
}
