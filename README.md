#	Clase CapturaDatosGrafica

 Esta clase permite la captura y conversión de datos haciendo uso de la clase **_JOptionPane_** y sus metodos para presentacion de cuadros de dialogo y mensajes.
 
 Convierte el dato ingresado al tipo de dato primitivo segun necesidad del usuario y realiza un control de excepción de tipo **_NumberFormatException_** O **_NullPointerException_** 
 que hace que se ingrese en un ciclo infinito hasta que el valor registrado en el cuadro de dialogo corresponda con el tipo de dato requerido.
 
 Cuenta con un constructor privado (su objetivo no es ser instanciable) y un conjunto de métodos estáticos que permiten leer datos y convertirlos en valores que primitivos **_java_** apoyandose en la clase **_JOptionPane_** y sus métodos **_showInputDialog_**, **_showOptionDialog_**,
 **_showMessageDialog_**.
 
 ## Listado de métodos
 
 * **_leeByte_**: Convierte el dato ingresado a un valor byte controlando excepcion de tipo **_NumberFormatException_** e ingresando en un ciclo hasta que el valor registrado en el cuadro de dialogo corresponda con un numero **_(byte)_**.

    **_Firma:_**
    ```
    static byte	leeByte(String mensaje, String titulo, int icono)
    ```

   **_Ejemplo de uso:_**
     ```
     byte datoByte;
     datoByte = CapturaDatosGrafica.leeByte("Ingrese un valor byte", "Captura dato byte", 1);
     CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoByte, "Captura valor byte");
     ```

 * **_leeShort_**: Convierte el dato ingresado a un valor short, controlando excepcion de tipo **_NumberFormatException_** e ingresando en un ciclo hasta que el valor registrado      en el cuadro de dialogo corresponda con un numero **_(short)_**.
    **_Firma:_**
    ```
    static short	leeShort(String mensaje, String titulo, int icono)
    ```

   **_Ejemplo de uso:_**
     ```
     short datoShort;
     datoShort = CapturaDatosGrafica.leeShort("Ingrese un valor short", "Captura dato short", 1);
     CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoShort, "Captura valor short");
     ```
     
 * **_leeInt_**: Convierte el dato ingresado a un valor int, controlando excepcion de tipo **_NumberFormatException_** e ingresando en un ciclo hasta que el valor registrado en      el cuadro de dialogo corresponda con un numero entero **_(int)_**.
    **_Firma:_**
    ```
    static int	leeInt(String mensaje, String titulo, int icono)
    ```

   **_Ejemplo de uso:_**
     ```
     int datoInt;
     datoInt = CapturaDatosGrafica.leeInt("Ingrese un valor int", "Captura dato int", 1);
     CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoInt, "Captura valor int");
     ```
     
 * **_leeLong_**: Convierte el dato ingresado a un valor long, controlando excepcion de tipo **_NumberFormatException_** e ingresando en un ciclo hasta que el el valor registrado en el cuadro de dialogo corresponda con un numero **_(long)_**.
    **_Firma:_**
    ```
    static long	leeLong(String mensaje, String titulo, int icono)
    ```

   **_Ejemplo de uso:_**
     ```
     long datoLong;
     datoLong = CapturaDatosGrafica.leeLong("Ingrese un valor long", "Captura dato long", 1);
     CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoLong, "Captura valor long");
     
  * **_leeFloat_**: Convierte el dato ingresado a un valor float, controlando excepcion de tipo **_NumberFormatException_** e ingresando en un ciclo hasta que el valor registrado en el cuadro de dialogo corresponda con un numero **_(float)_**.
    **_Firma:_**
    ```
    static float	leeFloat(String mensaje, String titulo, int icono)
    ```

   **_Ejemplo de uso:_**
     ```
     long datoLong;
     datoFloat = CapturaDatosGrafica.leeFloat("Ingrese un valor float", "Captura dato float", 1);
     CapturaDatosGrafica.muestraMensaje("Dato ingresado es : " + datoFloat, "Captura valor float");
