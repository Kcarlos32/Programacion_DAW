/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio_2 {
    public static String cambioLetra (String cadena ){
        cadena = cadena.replace("e","a");
        cadena = cadena.replace("i","a");
        cadena = cadena.replace("o","a");
        cadena = cadena.replace("u","a");
        
        return cadena;
    }
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce una palabra.");
        cadena = tcl.nextLine();
        
        System.out.println(cambioLetra(cadena));
    }
}
