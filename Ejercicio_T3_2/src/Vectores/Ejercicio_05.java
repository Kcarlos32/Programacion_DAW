/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
        int[] num = new int[50];
        int sumanum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 50 + 1);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de numeros generada");
        System.out.println("·············································");
        for (int dato : num) {
            System.out.print(dato + " ");
        }
        System.out.println("");
        for (int j = 0; j < num.length; j++) {
            if (num[j] % 2 == 0) {
                sumanum = num[j] + sumanum;
            }
        }
        System.out.println("·············································");
        System.out.println("Suma de los numeros pares");
        System.out.println("·············································");
        System.out.println(sumanum);
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
