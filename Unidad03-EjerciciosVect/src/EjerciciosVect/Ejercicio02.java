/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosVect;

import java.util.Scanner;

/**
 *
 * @author Kcarl
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int[] num = new int[10];
        int i;
        for (i = 0; i < num.length; i++) {
            System.out.println("Introduce los valores del array: ");
            num[i] = tcl.nextInt();
        }
        System.out.println("Valores en posiciones pares");
        for (int j = 0; j < num.length; j = j + 2) {
            System.out.print(num[j] + " ");
        }
        System.out.println("");
        System.out.println("Valores en posiciones impares");
        for (int j = 1; j < num.length; j = j + 2) {
            System.out.print(num[j] + " ");
        }
    }
}
