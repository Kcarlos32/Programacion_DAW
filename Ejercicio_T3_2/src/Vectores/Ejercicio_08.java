/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_08 {

    public static void main(String[] args) {
        int[] num = new int[20];
        int cont = 0;
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
        System.out.println("Numeros mayores de 10: \n");
        for (int j = 0; j < num.length; j++) {
            if (num[j] > 10) {
                System.out.print(num[j] + " ");
                cont++;
            }
        }
        System.out.println("");
        System.out.println("·············································");
        System.out.println("Hay " + cont + " elementos que sean mayores de 10");
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
