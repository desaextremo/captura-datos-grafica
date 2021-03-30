package com.desaextremo.lecturadatos;

import javax.swing.JOptionPane;
 
/**
 * Esta clase permite la captura y conversión de datos haciendo uso de la clase
 * {@code JOptionPane} y sus metodos para presentacion de cuadros de dialogo y
 * mensajes.
 *
 * <p>
 * Convierte el dato ingresado al tipo de dato primitivo segun necesidad del
 * usuario y realiza un control de excepción de tipo {@code NumberFormatException} que hace que se ingrese en un ciclo
 * infinito hasta que el valor registrado en el cuadro de dialogo corresponda
 * con el tipo de dato requerido.
 *
 * @author desaextremo
 */
public class CapturaDatosGrafica {

     /**
     * Constructor privado para que la clase no sea instanciable
     */
    private CapturaDatosGrafica() {
    }
    
    

    /**
     * Convierte el dato ingresado a un valor {@code int}, controlando excepcion de tipo 
     * {@code NumberFormatException} e ingresando en un ciclo hasta que el valor registrado en el cuadro de
     * dialogo corresponda con un numero entero (int).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono imagen que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code int}
     */
    public static int leeInt(String mensaje, String titulo, int icono) {
        int retorno = -1;
        boolean estado = false;
        do {
            try {
                retorno = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, icono));

                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Convierte el dato ingresado a un valor {@code double}, controlando
     * excepcion de tipo {@code NumberFormatException} e ingresando en un ciclo hasta que el el valor registrado en el
     * cuadro de dialogo corresponda con un numero (double).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code double}
     */
    public static double leeDouble(String mensaje, String titulo, int icono) {
        double retorno = -1.0D;
        boolean estado = false;
        do {
            try {
                Double doubleObject = Double.valueOf(JOptionPane.showInputDialog(null, mensaje, titulo, icono));
                retorno = doubleObject.doubleValue();
                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Convierte el dato ingresado a un valor {@code long}, controlando
     * excepcion de tipo {@code NumberFormatException} e ingresando en un ciclo hasta que el el valor registrado en el
     * cuadro de dialogo corresponda con un numero (long).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code long}
     */
    public static long leeLong(String mensaje, String titulo, int icono) {
        long retorno = -1L;
        boolean estado = false;
        do {
            try {
                Long longObject = Long.valueOf(JOptionPane.showInputDialog(null, mensaje, titulo, icono));
                retorno = longObject.longValue();
                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Convierte el dato ingresado a un valor {@code short}, controlando
     * excepcion de tipo {@code NumberFormatException} e ingresando en un ciclo hasta que el valor registrado en el
     * cuadro de dialogo corresponda con un numero (short).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code short}
     */
    public static short leeShort(String mensaje, String titulo, int icono) {
        short retorno = -1;
        boolean estado = false;
        do {
            try {
                Short shortObject = Short.valueOf(JOptionPane.showInputDialog(null, mensaje, titulo, icono));
                retorno = shortObject.shortValue();
                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Convierte el dato ingresado a un valor {@code byte}, controlando
     * excepcion de tipo {@code NumberFormatException} e ingresando en un ciclo hasta que el valor registrado en el
     * cuadro de dialogo corresponda con un numero (byte).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code byte}
     */
    public static byte leeByte(String mensaje, String titulo, int icono) {
        byte retorno = -1;
        boolean estado = false;
        do {
            try {
                Byte byteObject = Byte.valueOf(JOptionPane.showInputDialog(null, mensaje, titulo, icono));
                retorno = byteObject.byteValue();
                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Convierte el dato ingresado a un valor {@code float}, controlando
     * excepcion de tipo {@code NumberFormatException} e ingresando en un ciclo hasta que el valor registrado en el
     * cuadro de dialogo corresponda con un numero (float).
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato convertido a {@code float}
     */
    public static float leeFloat(String mensaje, String titulo, int icono) {
        float retorno = -1.0F;
        boolean estado = false;
        do {
            try {
                Float floatObject = Float.valueOf(JOptionPane.showInputDialog(null, mensaje, titulo, icono));
                retorno = floatObject.floatValue();
                estado = true;
            } catch (NumberFormatException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * Devuelve el dato ingresado, controlando excepcion de tipo {@code NullPointerException} e ingresando en un
     * ciclo hasta que se ingrese informacion en el cuadro de dialogo.
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato ingresado
     */
    public static String leeString(String mensaje, String titulo, int icono) {
        String retorno = "";
        boolean estado = false;
        do {
            try {
                retorno = JOptionPane.showInputDialog(null, mensaje, titulo, icono);
                if (retorno.length() > 0) {
                    estado = true;
                }
            } catch (NullPointerException e) {
                estado = false;
            }
        } while (!estado);
        return retorno;
    }

    /**
     * <p>
     * Devuelve el dato ingresado a un valor {@code char}.Dado que
     * {@code JOptionPane.showInputDialog} permite el ingreso de una cadena de
     * caracteres y no es posible limitar la longitud sin modificar el
     * comportamiento por defecto. Se hace uso del metodo {@code charAT} de la
     * clase String para devlver el primer caracter de la cadena\ ingresada en
     * el cuadro de dialogo.
     *
     * <p>
     * Control de excepcion de tipo {@code NullPointerException} e ingreso en un ciclo hasta que se registre
     * informacion en el cuadro de dialogo.
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return dato ingresado
     */
    public static char leeChar(String mensaje, String titulo, int icono) {
        char retorno = ' ';
        String valorCadena = "";
        boolean estado = false;
        do {
            try {
                valorCadena = JOptionPane.showInputDialog(null, mensaje, titulo, icono);
                retorno = valorCadena.charAt(0);
                if (retorno != ' ') {
                    estado = true;
                }
            } catch (NullPointerException e) {
                estado = false;
            }
        } while (!estado);
        retorno = valorCadena.charAt(0);
        return retorno;
    }

    /**
     * <p>
     * Devuelve un valor {@code boolean} dependiendo de la selcccion del usuario
     * en el cuadro de dialogo
     * <p>
     * El valor por defecto es {@code false}.
     *
     * @param mensaje un texto que aprecera como mensaje al usuario
     * @param titulo titulo del cuadro de dialogo
     * @param icono icono que aparecera en el cuadro de dialogo
     * <blockquote>
     *
     *
     * <table border=1 summary="Common JOptionPane method names and their descriptions">
     * <tr>
     * <th>Tipo de mensaje</th>
     * <th>Valor</th>
     * </tr>
     * <tr>
     * <td>ERROR_MESSAGE</td>
     * <td>0</td>
     * </tr>
     * <tr>
     * <td>INFORMATION_MESSAGE</td>
     * <td>1</td>
     * </tr>
     * <tr>
     * <td>WARNING_MESSAGE</td>
     * <td>2</td>
     * </tr>
     * <tr>
     * <td>QUESTION_MESSAGE</td>
     * <td>3</td>
     * </tr>
     * </table>
     *
     * </blockquote>
     * @return valor booleano de acuerdo a la opcion seleccionada (true, false)
     */
    public static boolean leeBoolean(String mensaje, String titulo, int icono) {
        int mensajeRetorno = 0;
        boolean retorno = false;
        Object[] botones = {"True", "False"};
        mensajeRetorno = JOptionPane.showOptionDialog(null, mensaje, titulo, -1, 2, null, botones, botones[0]);
        if (mensajeRetorno == 0) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }

    /**
     * Presenta cuadro de dialogo con un menu de opciones
     * @param textoMenu Texto del menu de opcion
     * @param titulo Titulo del cuadro de dialogo
     * @param limiteInferior Limite inferior del grupo de opciones de menu
     * @param limiteSuperior Limite superior del grupo de opciones de menu
     * @return numero de la opcion selecciona
     */
    public static int presentaMenu(String textoMenu, String titulo, int limiteInferior, int limiteSuperior) {
        int opcion = 0;
        do {
            opcion = leeInt(textoMenu, titulo, 1);
            if (opcion == -1 || opcion == 0) {
                continue;
            }
            if (validaRangoOpciones(opcion, limiteInferior, limiteSuperior)) {
                continue;
            }
            opcion = -1;
        } while (opcion == -1);
        return opcion;
    }

    /**
     * Presenta un cuadro de mensaje al usuario, haciendo uso del metodo {@code JOptionPane.showMessageDialog}
     * @param mensaje Mensaje para presentar al usuario
     * @param titulo Tituo del cuadro de mensaje
     */
    public static void muestraMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
    }
    
    /**
     * Valida que el valor ingresado por el usuario en menu de ocpiones se encuentre entre el rango de valores
     * minimo y maximo permitido.
     * @param opcionSeleccionada valor registrado por el usuario
     * @param limiteInferior valor minimo permitido por el grupo de opciones de un menu
     * @param limiteSuperior valor maximo permitido por el grupo de opciones de un menu
     * @return booleano indicando true si el valor del parametro {@code opcionSeleccionada} este dentro del rango o false en caso contrario
     */
    private static boolean validaRangoOpciones(int opcionSeleccionada, int limiteInferior, int limiteSuperior) {
        boolean estadoValidacion = false;
        if (opcionSeleccionada < limiteInferior || opcionSeleccionada > limiteSuperior) {
            muestraMensaje("Debe ingresar un valor entre " + limiteInferior + " y " + limiteSuperior, "Por favor verifique...");
            estadoValidacion = false;
        } else {
            estadoValidacion = true;
        }
        return estadoValidacion;
    }
}
