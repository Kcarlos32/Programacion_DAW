/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce los valores del array: ");
            num[i] = tcl.nextInt();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores de cuatro en cuatro: \n");
        for (int j = 0; j < num.length; j = j +4) {
                System.out.print(num[j] + " ");
                System.out.print(num[j]+1+" ");
                System.out.print(num[j]+2+" ");
                System.out.println(num[j]+3+" ");
        }
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
