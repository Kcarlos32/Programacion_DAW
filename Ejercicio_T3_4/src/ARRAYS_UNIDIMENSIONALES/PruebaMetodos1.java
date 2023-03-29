/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_UNIDIMENSIONALES;

/**
 *
 * @author carcas
 */
public class PruebaMetodos1 {
    
    //Ej1
    public static void mostrarArrayPantalla2(int[] num) {
        String resultado = "";
        for (int i = 0; i < num.length; i++) {
            if (i != (num.length) - 1) {
                resultado = resultado + num[i] + " , ";
            } else {
                resultado = resultado + num[i];
            }
        }
        System.out.println(resultado);
    }

    //Ej2
    public static String obtenerArrayComoString(int[] num) {
        String mostrar = "";
        for (int i = 0; i < num.length; i++) {
            if (i != (num.length) - 1) {
                mostrar = mostrar + num[i] + " , ";
            } else {
                mostrar = mostrar + num[i];
            }
        }
        return mostrar;
    }
    
    //Ej3
    public static int[] completarArray3 (int[] num){
        int h = 0;
        for (int i = 0; i < num.length; i++) {
                num[i] = h;
                h = h + 2;
        }
        return num;
    }
    
    //Ej4
    public static int obtenerSumaArray (int[] num){
        int suma = 0;
        for(int i=0; i <num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }
    
     //Ej5
    public static int[] arrayPotencias2 (int num){
        int[] arrayPoten = new int[num];
        int pot = 0;
        for(int i = 0; i <num; i++){
             arrayPoten[i] = (int) Math.pow(2, pot);
             pot++;
        }
        return arrayPoten;
    }
    
    //Ej6
    public static String concArrayCadenas (String[] array){
        String concat = "";
        for (String datosArr : array){
            concat += datosArr + " "; 
        }
        return concat;
    }
    
    //Ej7
    public static int obtenerSumaLongCadArray (String[] array){
        int resultado = 0;
        for (int i=0 ; i<array.length; i++){
            resultado += array[i].length();
        }
        return resultado;
    }
    
    //Ej8
    public static int[] obtenerLong (String[] Array) {
        int[] numCad = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            numCad[i] = Array[i].length();
        }
        return numCad;
    }
    
    //Ej9
    public static String[] obtenerArrCad5Vocales(String[] Array) { 
        int cont = 0;
        String[] cad5Voc = new String[Array.length];
        for (int i = 0; i < Array.length; i++) {
            String min = Array[i].toLowerCase();
            if (min.contains("a") && min.contains("e") && min.contains("i") && min.contains("o") && min.contains("u")) {
              cad5Voc[cont++] = Array[i];
            }
        }
        String[] resultado = new String[cont];
        for (int i = 0; i < cont; i++) {
            resultado[i] = cad5Voc[i];
        }
        return resultado;
    }
    
    //Ej10
    public static String[] obtenerArrayOrdAlfab (String[] array) { 
        String[] array2 = new String[array.length];
        String ay = "";
        String ay2 = "";
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i].toLowerCase(); 
        }
        for (int i = 1; i < array2.length; i++) { 
            ay = array2[i];             
            ay2 = array[i];
            int j = i;
            while (j > 0 && array2[j - 1].compareTo(ay) > 0) {
                j--;
                array2[j + 1] = array2[j];
                array[j + 1] = array[j];
            }
            array2[j] = ay; 
            array[j] = ay2;
        }
        return array;
    }
}
