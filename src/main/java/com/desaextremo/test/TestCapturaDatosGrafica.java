package com.desaextremo.test;

import com.desaextremo.lecturadatos.CapturaDatosGrafica;

/**
 * <p>Esta clase muestra la forma de utilizar los metodos definidos por la clase
 * {@code CapturaDatosGrafica}.
 * 
 * <p> Cuenta con un metodo {@code main} para armar un menu de opciones y probar cada uno de los metodos definidos por la clase 
 * {@code CapturaDatosGrafica} que solicita opciones entre 1 y 10 para el ingreso y validacion de datos de tipos primitivos e imprime el valor ingreasado en un cuadro de
 * mensaje, usando el metodo {@code CapturaDatosGrafica.muestraMensaje}
 * 
 * <p>El menu de opciones se ejecuta de firma indefinida hasta que el usuario ingrese el valor de 10, que correponde a la opción terminar. En este caso la condicion del ciclo se rompe y el programa termina.
 * 
 * <blockquote>
 *
 *
 * <table border=1>
 * <tr>
 * <th>Opcion</th>
 * <th>Accion</th>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td>Convertir a byte: CapturaDatosGrafica.leeByte</td>
 * </tr>
 * <tr>
 * <td>2</td>
 * <td>Convertir a short:CapturaDatosGrafica.leeShort</td>
 * </tr>
 * <tr>
 * <td>3</td>
 * <td>Convertir a int: CapturaDatosGrafica.leeInt</td>
 * </tr>
 * <tr>
 * <td>4</td>
 * <td>Convertir a long: CapturaDatosGrafica.leeLong</td>
 * <tr>
 * <td>5</td>
 * <td>Convertir a float: CapturaDatosGrafica.leeFloat</td>
 * </tr>
 * <tr>
 * <td>6</td>
 * <td>Convertir a double: CapturaDatosGrafica.leeDouble</td>
 * </tr>
 * <tr>
 * <td>7</td>
 * <td>Convertir a boolean: CapturaDatosGrafica.leeBoolean</td>
 * </tr>
 * <tr>
 * <td>8</td>
 * <td>Convertir a char: CapturaDatosGrafica.leeChar</td>
 * </tr>
 * <tr>
 * <td>9</td>
 * <td>Convertir a String: CapturaDatosGrafica.leeString</td>
 * </tr>
 * <tr>
 * <td>10</td>
 * <td>Terminar</td>
 * </tr>
 * </table>
 *
 * </blockquote>
 * @author desaextremo
 */
public class TestCapturaDatosGrafica {
    public static void main(String[] args) {

        short datoShort;
        byte datoByte;
        int datoInt;
        long datoLong;
        float datoFloat;
        double datoDouble;
        boolean datoBoolean;
        char datoChar;
        String datoString;
        int opcion = 0;

        String menuOpciones = "1 byte \n"
                + "2 short \n"
                + "3 int \n"
                + "4 long \n"
                + "5 float \n"
                + "6 double \n"
                + "7 boolean \n"
                + "8 char \n"
                + "9 String \n"
                + "10 Terminar\n";

        do {
            //Arma menu de opciones al usuario
            opcion = CapturaDatosGrafica.presentaMenu(menuOpciones, "Menu de opciones", 1, 10);

            switch (opcion) {
                //1 captura un numero short
                case 1:
                    datoByte = CapturaDatosGrafica.leeByte("Ingrese un valor byte", "Captura dato byte", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoByte, "Captura valor byte");
                    break;
                //2 captura un numero byte
                case 2:
                    datoShort = CapturaDatosGrafica.leeShort("Ingrese un valor short", "Captura dato short", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoShort, "Captura valor short");
                    break;
                //3 captura un numero int
                case 3:
                    datoInt = CapturaDatosGrafica.leeInt("Ingrese un valor int", "Captura dato int", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoInt, "Captura valor int");
                    break;
                //4 captura un numero long
                case 4:
                    datoLong = CapturaDatosGrafica.leeLong("Ingrese un valor long", "Captura dato long", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoLong, "Captura valor long");
                    break;
                //5 captura un numero float                
                case 5:
                    datoFloat = CapturaDatosGrafica.leeFloat("Ingrese un valor float", "Captura dato float", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoFloat, "Captura valor float");
                    break;
                //6 captura un numero double
                case 6:
                    datoDouble = CapturaDatosGrafica.leeDouble("Ingrese un valor double", "Captura dato double", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoDouble, "Captura valor double");
                    break;
                //7 captura un dato boolean
                case 7:
                    datoBoolean = CapturaDatosGrafica.leeBoolean("Ingrese un valor boolean", "Captura dato boolean", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoBoolean, "Captura valor boolean");
                    break;
                //8 captura un dato char
                case 8:
                    datoChar = CapturaDatosGrafica.leeChar("Ingrese un valor char", "Captura dato char", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoChar, "Captura valor char");
                    break;
                //9 captura un dato String
                case 9:
                    datoString = CapturaDatosGrafica.leeString("Ingrese un valor String", "Captura dato String", 1);
                    CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoString, "Captura valor String");
                    break;
                //10 Terminar programa
                case 10:
                    CapturaDatosGrafica.muestraMensaje("Opción 10", "Fin del programa");
            }
        } while (opcion != 10);
        //termina y baja la maquina virtual
        System.exit(0);
    }
}
