/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_MULTIDIMENSIONALES;

/**
 *
 * @author carcas
 */
public class Testing2 {
    public static void main(String[] args) {
        int test1[][] = new int[10][6];
        int test2[][] = new int[6][6];
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
  
        test1 = PruebaMetodos2.rellenarMatrizSecuencia2D(test1);
        for (int i = 0; i < test1.length; i++) {
            System.out.println("");
            for (int j = 0; j < test1[i].length; j++) {
                System.out.print(test1[i][j] + " ");
            }
        }
        
        System.out.println("");     
        System.out.println("\n·············································");
        
        PruebaMetodos2.mostrarMatrizID(test1);
        
        System.out.println("");
        System.out.println("\n·············································");
        System.out.println("");
        
        System.out.println(PruebaMetodos2.matrizIntComoString(test1));
        
        System.out.println("\n·············································");
        
        PruebaMetodos2.mostrarMatrizStr(PruebaMetodos2.rellenarMatrizAsteriscos(5));
        
        System.out.println("");
        System.out.println("\n·············································");

        System.out.println("\n" + PruebaMetodos2.obtenerSumaElementosMatriz(test1));
        
        System.out.println("\n·············································");
        
        test2 = PruebaMetodos2.rellenarMatrizSecuencia2D(test2);
        PruebaMetodos2.mostrarMatrizID(PruebaMetodos2.obtenerDiagonales(test2));
        
        System.out.println("");
        System.out.println("\n·············································");
        PruebaMetodos2.mostrarMatrizID(PruebaMetodos2.obtenerLaterales(test1));
        
        
        System.out.println("");
        System.out.println("\n·············································");
        PruebaMetodos2.mostrarMatrizStr(PruebaMetodos2.matrizEscalonada(5));
        
        System.out.println("");
        
        System.out.println("\n·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}

