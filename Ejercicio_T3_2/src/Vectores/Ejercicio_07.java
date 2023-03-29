/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_07 {

    public static void main(String[] args) {
        int[] num = new int[50];
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 50);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores generada: \n");
        for (int dato : num) {
            System.out.print(dato + " ");
        }
        System.out.println("");
        System.out.println("·············································");
        for (int j = 0; j < num.length; j++) {
            if (num[j] == 0) {
                cont++;
            }
            if (cont == 1) {
                System.out.println("El primer 0 esta en la posiciòn " + j);
                break;
            }
        }
        if (cont == 0) {
            System.out.println("No hay ceros en esta secuencia");
        }

        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
