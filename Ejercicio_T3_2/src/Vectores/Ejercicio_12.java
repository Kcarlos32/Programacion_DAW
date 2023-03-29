/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import java.util.Arrays;

/**
 *
 * @author carcas
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        int[] num = new int[10];
        int[] inv = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 20);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores generada: \n");

        for (int dato : num) {
            System.out.print(dato + " ");
        }
        System.out.println("");

        for (int i = 0, j = num.length - 1; i < num.length; i++, j--) {
            inv[j] = num[i];
        }
        num = inv;

        System.out.println("Vectores invertidos: \n");
        System.out.println(Arrays.toString(num));
        System.out.println("");
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
