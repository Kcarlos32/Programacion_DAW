/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_06 {

    public static void main(String[] args) {
        int[] num = new int[10];
        
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
        System.out.println("·············································");
        System.out.println("Numeros pares en posiciones pares");
        System.out.println("·············································");
        for (int j = 0; j < num.length; j++) {
            if (num[j] % 2 == 0 && j % 2 == 0) {
                System.out.print(num[j] + " ");
                System.out.println("La posicion es " + j);
            }
        }
        System.out.println("·············································");
        System.out.println("Numeros multiplos de tres en posiciones impares");
        System.out.println("·············································");
        for (int j = 0; j < num.length; j++) {
            if (num[j] % 3 == 0 && j % 2 != 0) {
                System.out.print(num[j] + " ");
                System.out.println("La posicion es " + j);
            }
        }
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
