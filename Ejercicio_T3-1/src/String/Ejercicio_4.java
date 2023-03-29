/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

//import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio_4 {
     public static String cambioEs (String cadena ){
        cadena = cadena.replaceAll("es","no por");

        return cadena;
    }
      public static String cambioDigi (String cadena ){
        cadena = cadena.replaceAll( "\\d+","*");

        return cadena;
    }
    public static void main(String[] args) {
        //Scanner tcl = new Scanner(System.in);
        String cadena = "esto1234es5678bueno900";
       // System.out.println("Introduce una palabra.");
        //cadena = tcl.nextLine();
        
        System.out.println(cambioEs(cadena));
        System.out.println(cambioDigi(cadena));
    }
}

