/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_MULTIDIMENSIONALES;

/**
 *
 * @author carcas
 */
public class PruebaMetodos2 {

    //Ej 11
    public static int[][] rellenarMatrizSecuencia2D(int[][] mat) { 
        int num = 0;
        for (int i = 0; i < mat.length; i++) {
            num = i;
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = num;
                num += 5;
            }
        }
        
        return mat;
    }

    //Ej 12
    public static void mostrarMatrizID(int[][] mat) { 
        for (int i = 0; i < mat.length; i++) {
            System.out.println("");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void mostrarMatrizStr(String[][] mat) { 
        for (int i = 0; i < mat.length; i++) {
            System.out.println("");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    //Ej 13
    public static String matrizIntComoString(int[][] mat) { 
        String resultado = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado += mat[i][j] + " ";
            }
            resultado += "\n";
        }
        
        return resultado;
    }

    //Ej 14
    public static String[][] rellenarMatrizAsteriscos(int numFilas) { 
        String[][] matStr = new String[numFilas][numFilas * 2 - 1];
        for (int i = numFilas - 1; i >= 0; i--) {
            for (int j = 0; j < matStr[i].length; j++) {
                matStr[i][j] = " ";
            }
        }
        for (int i = numFilas - 1; i >= 0; i--) {
            for (int j = Math.abs(matStr.length - (i + 1)); j < (matStr[i].length - Math.abs(matStr.length - (i + 1))); j++) {
                matStr[i][j] = "*";
            }
        }
        
        return matStr;
    }

    //Ej 15
    public static long obtenerSumaElementosMatriz(int[][] mat) { 
        long resultado = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultado += mat[i][j];
            }
        }
        return resultado;
    }

    //Ej 16
    public static int[][] obtenerDiagonales(int[][] mat) {
        int[][] mat2 = new int[mat.length][mat[0].length];
        int cont = 0;
        for (int i = mat.length - 1; i >= 0; i--) {
            mat2[i][cont] = mat[i][cont];
            cont++;
        }
        for (int i = 0; i < mat.length; i++) {
            mat2[i][i] = mat[i][i];
        }

        return mat2;
    }
    
    //Ej 17
    public static int[][] obtenerLaterales(int[][] mat) { 
        int[][] mat2 = new int[mat.length][mat[0].length];
        mat2[0][0] = mat[0][0];
        mat2[0][mat[0].length - 1] = mat[0][mat[0].length - 1];
        mat2[mat.length - 1][0] = mat[mat.length - 1][0];
        mat2[mat.length - 1][mat[0].length - 1] = mat[mat.length - 1][mat[0].length - 1];
        return mat2;
    }
    
    //Ej 18
    public static String[][] matrizEscalonada(int numCol) { 
        String mat[][] = new String[numCol][numCol];
        int cont = 0;
        
         for (int col = 0; col < numCol; col++) {
            for (int fil = 0; fil < numCol; fil++) {
                mat[fil][col] = " ";
            }
        }
        
        for (int i = 0; i < numCol; i++) {
            cont++;
            for (int j = 0; j < numCol - i; j++) {
                mat[j][i] = cont + "";
            }
        }
        
        return mat;
    }
}
