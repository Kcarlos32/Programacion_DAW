/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_11 {

    public static void main(String[] args) {
        int[] vecP = new int[10];
        int[] vecV = new int[10];

        for (int i = 0; i < vecP.length; i++) {
            vecP[i] = (int) (Math.random() * 20);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores generada: \n");
        for (int dato : vecP) {
            System.out.print(dato + " ");
        }
        System.out.println("");
        System.out.println("Vectores generados mayores que 10: \n");
        for (int i = 0; i < vecP.length; i++) {
            if (vecP[i] > 10){
                vecV[i] = vecP[i];
                System.out.print(vecV[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
