/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author carcas
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        int[] num = new int[20];
        int[] posicion = new int[20];

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
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            int contador = 0;
            int pos = 0;
            boolean noRepe = false;
            
            for (int j = 0; j < num.length; j++){
                if (num[i] == num[j]){
                    contador++;
                    posicion[pos] = j;
                    pos++;
                }
            }
            if (contador > 1){
                for (int h = 0; h < i; h++){
                    if(num[i] == num[h]){
                        noRepe = true;
                    }
                }
                if (noRepe == false){
                    System.out.println("El numero "+num[i]+" esta repetido "+contador+" veces");
                    System.out.print("Su posición es");
                    for(int k =0; k< contador; k++){
                        System.out.print(" [ "+posicion[k]+" ] ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
