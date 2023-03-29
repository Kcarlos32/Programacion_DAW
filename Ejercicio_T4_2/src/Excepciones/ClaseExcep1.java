/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author carcas
 */
public class ClaseExcep1 {

    public static int dividirEntreArray(int num, int[] arr) {
        int resultado = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num / arr[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int num = 2;
        int[] arr = {-2, -1, 0, 1, 2};
        try {
            for (int i = 0; i < arr.length; i++) {
                dividirEntreArray(num,arr);
                System.out.print(arr[i]+" ");
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
