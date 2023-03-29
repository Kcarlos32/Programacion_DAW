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
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce los valores del array: ");
            num[i] = tcl.nextInt();
        }
        for (int dato : num) {
            System.out.print(dato + " ");
        }
    }
}
