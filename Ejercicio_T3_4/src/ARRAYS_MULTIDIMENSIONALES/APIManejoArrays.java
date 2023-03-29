/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_MULTIDIMENSIONALES;

import java.util.Arrays;

/**
 *
 * @author carcas
 */
public class APIManejoArrays {

    public static void main(String[] args) {
        int[] arrInt1 = new int[30];
        char[] arrChar = new char[6];
        int[] arrInt2 = new int[10];
        int aux = 9;

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        //Ej 19
        for (int i = 0; i < arrInt1.length; i++) {
            if (i <= 10) {
                arrInt1[i] = 0;
            }
            if (i >= 10) {
                arrInt1[i] = 1;
                
            }
            
            if (i >= 20) {
                arrInt1[i] = 0;
            }
            System.out.print("[ " + arrInt1[i] + " ]");
        }
        System.out.println("\n·············································");

        for (int i = 0; i < arrChar.length; i++) {
            if (i < 3) {
                arrChar[i] = 'a';
            }
            if (i >= 3) {
                arrChar[i] = 'b';
            }
            System.out.print("[ " + arrChar[i] + " ]");
        }
        System.out.println("\n·············································");

        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] = aux--;
            System.out.print("[ " + arrInt2[i] + " ]");
        }
        System.out.println("");
        System.out.println("\nArray ordenado de manera ascendente: \n");
        Arrays.sort(arrInt2);
        for (int dato : arrInt2) {
            System.out.print("[ " + dato + " ]");
        }
        System.out.println("\n·············································");
        System.out.println("---------------------------------------------");
        System.out.println("·············································");
        //Ej 20
        String[] arrStr = {"impresora", "peto", "mar", "orilla", "Orihuela"};
        String[] acumuladorString = new String[arrStr.length];
        //a
        for (String cadena : arrStr) {
            System.out.print("[ " + cadena + " ]");
        }
        System.out.println("\n·············································");
        //b
        Arrays.sort(arrStr);
        for (int i = 0; i < acumuladorString.length; i++) {
            acumuladorString[i] = arrStr[i];
            System.out.print("[ " + arrStr[i] + " ]");
        }
        System.out.println("\n·············································");
        //c
        for (int i = 0; i < acumuladorString.length; i++) {
            acumuladorString[i] = acumuladorString[i].toLowerCase();
            Arrays.sort(acumuladorString);
            System.out.print("[ " + acumuladorString[i] + " ]");
        }
        System.out.println("\n·············································");
        //d
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (arrStr[i].length() < arrStr[j].length()) {
                    String ayu = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = ayu;
                }
            }
        }
        for (String arrStr1 : arrStr) {
            System.out.print("[ " + arrStr1 + " ]");
        }
        System.out.println("\n·············································");
        //e
        int numVocI = 0, numVocJ = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int k = 0; k < arrStr[i].length(); k++) {
                if ((arrStr[i].charAt(k) == 'a') || (arrStr[i].charAt(k) == 'A') || (arrStr[i].charAt(k) == 'e') || (arrStr[i].charAt(k) == 'E') || (arrStr[i].charAt(k) == 'i') || (arrStr[i].charAt(k) == 'I') || (arrStr[i].charAt(k) == 'o') || (arrStr[i].charAt(k) == 'O') || (arrStr[i].charAt(k) == 'u') || (arrStr[i].charAt(k) == 'U')) {
                    numVocI++;
                }
            }
            for (int j = i + 1; j < arrStr.length; j++) {
                for (int k = 0; k < arrStr[j].length(); k++) {
                    if ((arrStr[j].charAt(k) == 'a') || (arrStr[j].charAt(k) == 'A') || (arrStr[j].charAt(k) == 'e') || (arrStr[j].charAt(k) == 'E') || (arrStr[j].charAt(k) == 'i') || (arrStr[j].charAt(k) == 'I') || (arrStr[j].charAt(k) == 'o') || (arrStr[j].charAt(k) == 'O') || (arrStr[j].charAt(k) == 'u') || (arrStr[j].charAt(k) == 'U')) {
                        numVocJ++;
                    }
                }
                if (numVocI < numVocJ) {
                    String ayu2 = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = ayu2;
                }
                numVocJ = 0;
            }
            numVocI = 0;
        }
        for (String arrStr1 : arrStr) {
            System.out.print("[ " + arrStr1 + " ]");
        }
        System.out.println("\n·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}

