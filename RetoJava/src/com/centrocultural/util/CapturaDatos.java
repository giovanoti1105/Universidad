package com.centrocultural.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Programa:MenuOpciones
 * Autor :  CRHISTIAN OVALLE GAMBA
 * Escrito :Marzo de 2005
 * Curso :	Programacion I
 * Compilador  : jdk1.4.1
 * Plataforma  : Windows 98 o Linux
 * Descripción : Nos brinda la posibilidad de capturar valores para los diferentes tipos de datos
 *               existentes en Java.  
 */


public class CapturaDatos
{
    
//------------------------------------
//    Atributos
//------------------------------------

    /**
     * Provides readLine capability to System.in
     */
    private static BufferedReader keyboard;
    
    
//-------------------------------------
//    Static Initializer
//-------------------------------------
    static {
        
        keyboard = new BufferedReader( new InputStreamReader( System.in ) );
        
    }
        /**
     * Reads in a <c>double</c> using a default prompt text. Does not terminate until
     * the user enters a valid double.
     *
     * @return a <c>double</c>  ingresado por el usuario.
     */    
    static public double leeDouble()
    {
        return leeFlotante("Ingrese un dato de tipo double: ");
    }
    
    /**
     * Reads in a <c>double</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a double.
     *
     * @return a <c>double</c>  ingresado por el usuario.
     */
    static public double leeDouble(String text)
    {
        boolean done = false;
        double value = 0;
        
        Double doubleObject;

        do {
            try {
                
                prompt(text);
                
                doubleObject = Double.valueOf(getInputLine());
                value = doubleObject.doubleValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo double. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
    /**
     * Reads in a <c>long</c> using a default prompt text. Does not terminate until
     * the user enters a valid long.
     *
     * @return a <c>long</c>  ingresado por el usuario.
     */    
    static public long leeLong()
    {
        return leeLong("Ingrese un dato de tipo long: ");
    }
    
    
    /**
     * Reads in a <c>long</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a long.
     *
     * @return a <c>long</c>  ingresado por el usuario.
     */
    static public long leeLong(String text)
    {
        boolean done = false;
        long value = 0;
        
        Long longObject;

        do {
            try {
                
                prompt(text);
                
                longObject = Long.valueOf(getInputLine());
                value = longObject.longValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo long. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
    /**
     * Reads in a <c>byte</c> using a default prompt text. Does not terminate until
     * the user enters a valid byte.
     *
     * @return a <c>byte</c>  ingresado por el usuario.
     */    
    static public byte leeByte()
    {
        return leeByte("Ingrese un dato de tipo byte: ");
    }
    
    /**
     * Reads in a <c>byte</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a byte.
     *
     * @return a <c>byte</c>  ingresado por el usuario.
     */
    static public byte leeByte(String text)
    {
        boolean done = false;
        byte value = 0;
        
        Byte byteObject;

        do {
            try {
                
                prompt(text);
                
                byteObject = Byte.valueOf(getInputLine());
                value = byteObject.byteValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo byte. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
     /**
     * Reads in a <c>short</c> using a default prompt text. Does not terminate until
     * the user enters a valid byte.
     *
     * @return a <c>short</c>  ingresado por el usuario.
     */    
    static public short leeShort()
    {
        return leeShort("Ingrese un dato de tipo short: ");
    }
    
    /**
     * Reads in a <c>byte</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a byte.
     *
     * @return a <c>byte</c>  ingresado por el usuario.
     */
    static public short leeShort(String text)
    {
        boolean done = false;
        short value = 0;
        
        Short shortObject;

        do {
            try {
                
                prompt(text);
                
                shortObject = Short.valueOf(getInputLine());
                value = shortObject.byteValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo short. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
    /**
     * Reads in a <code>float</code> using a default prompt text. Does not terminate until
     * the user enters a valid float.
     *
     * @return a <code>float</code> value entered by the user.
     */
    static public float leeFlotante()
    {
        return leeFlotante("Ingrese un dato de tipo float: ");
    }

    /**
     * Reads in a <c>float</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a valid float.
     *
     * @return a <c>float</c> value entered by the user.
     */
    static public float leeFlotante(String text)
    {
        boolean done = false;
        float value  = 0f;
        
        Float floatObject;

        do {
            try {
                prompt(text);

                floatObject = Float.valueOf(getInputLine());
                value = floatObject.floatValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo float. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
    /**
     * Reads in a <code>boolean</code> using a default prompt text. Does not terminate until
     * the user enters a valid boolean.
     *
     * @return a <code>boolean</code> value entered by the user.
     */
    static public boolean leeBoolean()
    {
        return leeBoolean("Ingrese un dato de tipo boolean: ");
    }

    /**
     * Reads in a <c>boolean</c> using the second parameter as its prompt text. Does not terminate until
     * the user enters a valid boolean.
     *
     * @return a <c>boolean</c> value entered by the user.
     */
    static public boolean leeBoolean(String text)
    {
        boolean done = false;
        boolean value  = false;
        
        Boolean booleanObject;

        do {
            try {
                prompt(text);

                booleanObject = Boolean.valueOf(getInputLine());
                value = booleanObject.booleanValue();
                done = true;
            }

            catch (NumberFormatException e) {
               promptLine("El dato ingresado no es de tipo boolean. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }
    
    /**
     * Reads in an integer using a default prompt text. Does not terminate until
     * the user enters a valid integer.
     *
     * @return an <c>int</c> value entered by the user.
     */
    static public int leeEntero()
    {
        return leeEntero("Ingrese un dato de tipo int: ");
    }

    /**
     * Reads in an integer using the second parameter as its prompt text. Does not terminate until
     * the user enters a valid integer.
     *
     * @return an <c>int</c> value entered by the user.
     */
    static public int leeEntero(String text)
    {
        boolean  done = false;
        int     value = 0;

        do {
            try {
                prompt(text);
        
                value = Integer.parseInt(getInputLine());
                done = true;
            }

            catch (NumberFormatException e) {
                promptLine("El dato ingresado no es de tipo int. Intente de nuevo..");
            }
        } while (!done);

        return value;
    }

    /**
     * Reads in a <c>String</c> using a default prompt text. 
     *
     * @return a <c>String</c> value entered by the user.
     */
    static public String leeCadena()
    {
        return leeCadena("Ingrese una cadena de caracteres:");
    }

    /**
     * Reads in a <c>String</c> using the second parameter as its prompt text. 
     *
     * @return a <c>String</c> value entered by the user.
     */
    static public char leeCaracter(String text)
    {
        prompt(text);

        return (getInputLine().charAt(0));
    }  
    
    /**
     * Reads in a <c>char</c> using a default prompt text. 
     *
     * @return a <c>char</c>  ingresado por el usuario.
     */
    static public char leeCaracter()
    {
        return leeCaracter("Ingrese un caracter: ");
    }

    /**
     * Reads in a <c>String</c> using the second parameter as its prompt text. 
     *
     * @return a <c>String</c>   ingresado por el usuario.
     */
    static public String leeCadena(String text)
    {
        prompt(text);

        return (getInputLine());
    }    
  
    /**
     * Reads in a single line of text. 
     *
     * @return a <c>String</c> value entered by the user.
     */    
    static private String getInputLine( )
    {
        String result = "";
        
        try {
            result = keyboard.readLine();
        }
        catch (IOException e) {
            
        }
        
        return result;
    }  
 
    /**
     * Prompts the user with the parameter text. 
     *
     */     
    static private void prompt( String text )
    {
        System.out.print(text + " " );
        System.out.flush( );
    }
    
    /**
     * Prompts the user with the parameter text and
     * move to the new line. 
     *
     */     
    static private void promptLine( String text )
    {
        System.out.println(text + " " );
        System.out.flush( );
    }
}