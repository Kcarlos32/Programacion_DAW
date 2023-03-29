/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_09 {

    public static void main(String[] args) {
        int[] num = new int[20];
        int maximo = num[0];
        int posicion = 0;
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

        for (int j = 0; j < num.length; j++) {
            if (maximo < num[j]) {
                maximo = num[j];
                posicion = j;
            }
        }
        System.out.println("·············································");
        System.out.println("La máximo de la lista es " + maximo + " en la posición " + posicion);
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
