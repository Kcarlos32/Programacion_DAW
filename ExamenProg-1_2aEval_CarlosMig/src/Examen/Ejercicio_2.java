/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio_2 {
    
    private static int[][] matriz = new int[4][4];
    private static boolean erroneo = true;


    //Parte 1
    public static int[][] rellenarMatriz(int [][] mat) {
        Scanner tcl = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    try {
                        System.out.println("Introduce un numero en la fila " + i);
                        matriz[i][j] = tcl.nextInt();
                        erroneo = false;
                    } catch (Exception e) {
                        System.out.println("Lo que has introducido no es un numero entero");
                        tcl.nextLine();
                    }
                } while (erroneo);
            }
        }
        return matriz;
    }

    //Parte 2
    public static int sumaFila(int[][]mat) {
        Scanner tcl = new Scanner(System.in);
        int linea = 0;
        int sumaLi = 0;
        boolean err2 = false;
        do {
            try {
                System.out.println("Introduce la linea que quieres sumar: ");
                linea = tcl.nextInt();
                tcl.nextLine();
                if (linea > 3 || linea < 0) {
                    err2 = true;
                    throw new Exception("El numero de linea introducido no existe");
                } else {
                    err2 = false;
                }
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (err2);

        for (int j = 0; j < matriz[linea].length; j++) {
            sumaLi = matriz[linea][j] + sumaLi;
        }
        return sumaLi;
    }

    //Parte 3
    public static int sumaColumna(int[][] mat) {
        Scanner tcl = new Scanner(System.in);
        int col = 0;
        int sumaCo = 0;
        boolean err3 = false;
        do {
            try {
                System.out.println("Introduce la columna que quieres sumar: ");
                col = tcl.nextInt();
                tcl.nextLine();
                if (col > 3 || col < 0) {
                    err3 = true;
                    throw new Exception("El numero de columna introducido no existe");
                } else {
                    err3 = false;
                }
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (err3);

        for (int i = 0; i < matriz.length; i++) {
            sumaCo = matriz[i][col] + sumaCo;
        }
        return sumaCo;
    }
    //Parte 4
    public static int sumaDiagonal(int[][] mat) {
        return 0;
    }
    
    //Prueba
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int seleccionar;
        int[][] mat = new int[4][4];
        
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("======= BANCO UNIVERSAL ========");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Suma de fila");
            System.out.println("3. Suma de columna");
            System.out.println("4. Suma diagonal");
            System.out.println("5. Suma diagonal inversa");
            System.out.println("6. La media de todos los valores");
            System.out.println("0. Salir");
            System.out.println("································");
            System.out.print("Selecciona una opción:");
            seleccionar = tec.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            switch (seleccionar) {
                case 1:
                    System.out.println("--------------------------------\nRellenar matriz\n--------------------------------");
                    rellenarMatriz(mat);
                    break;
                case 2:
                    System.out.println("--------------------------------\nSuma de filas\n--------------------------------");
                    if(mat == null){
                        break;
                    }else{
                    sumaFila(mat);
                    break;
                    }
                case 3:
                    System.out.println("--------------------------------\n Suma de columnas\n--------------------------------");
                    if(mat == null){
                        break;
                    } else{
                    sumaColumna(mat);
                    break;
                    }
                case 4:
                    System.out.println("--------------------------------\n Suma diagonal\n--------------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------------\n Suma diagonal inversa\n--------------------------------");
                    break;
                case 6:
                    System.out.println("--------------------------------\n Media de los valores\n--------------------------------");
                    break;
            }
        } while (seleccionar != 0);
        System.out.println("Has cerrado el programa");
    }
}