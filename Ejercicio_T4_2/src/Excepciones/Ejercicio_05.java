/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author carcas
 */
public class Ejercicio_05 {
    private static void mostrarCadenasArray(String[] cadenas) {
        for (int i = 0; i < cadenas.length; i++) {
            if (cadenas[i] != null) {
                System.out.print(cadenas[i].charAt(0) + " ");
            } else {
                System.out.print("|Valor nulo| ");
            }
        }
    }
    
    public static void main(String[] args) {
        String[] cadenas = new String[5];
        cadenas[0] = "Pepe";
        cadenas[1] = "Juan";
        cadenas[2] = "Rigoberto";
        cadenas[3] = "Hermenegildo";
        mostrarCadenasArray(cadenas);
    }
}