/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_13 {
    public static void main(String[] args) {
        int[] vecP = new int[50];
        int[] vecV = new int[51];
        
        for (int i = 0; i < vecP.length; i++) {
            vecP[i] = (int) (Math.random() * 50);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores generada: \n");
        
        for (int dato : vecP) {
            System.out.print(dato + " ");
        }
        
        System.out.println("");
        System.out.println("·············································");
        System.out.println("Asignamos los valores del vector P a el vector V, pero en cada posición sumamos el vector anterior\n");
        
        for (int i = 0; i < vecP.length; i++) {
           for (int j = 0; j <= i; j++) {
               vecV[i]=vecP[j]+vecV[i];
            }
            System.out.println(" [ "+i+" ] "+vecV[i]);
        }
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}

