/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        int[] vecP = new int[50];
        int[] vecV = new int[50];
        int cont = 0;
        
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
        System.out.println("·············································");
        System.out.println("Vectores generados pares: \n");
        
        for (int i = 0; i < vecP.length; i++) {
            if (vecP[i] % 2 == 0){
                vecV[i] = vecP[i];
                cont ++;
                System.out.print(vecV[i]+" ");
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < vecP.length; i++) {
            if (vecP[i] % 2 != 0 && cont == 0){
                System.out.println("No hay numeros pares ");
                break;
            } 
        }
        
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
