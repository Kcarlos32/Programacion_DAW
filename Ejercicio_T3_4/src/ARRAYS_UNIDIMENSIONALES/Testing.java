/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS_UNIDIMENSIONALES;

/**
 *
 * @author carcas
 */
public class Testing {

    public static void main(String[] args) {
        int[] testInt = new int[10];
        int test2 = 0;
        String[] testStr = new String[10];
        char ch = 64;
        String[] cad = {"BURGOS" , "ALBACETE" , "antonio",  "AAAAaEeeIiiooUUu"};
        String[] mostrarCad = new String[cad.length];
        String[] mostrarCad2 = new String[cad.length];

        for (int i = 0; i < testInt.length; i++) {
            testInt[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < testInt.length; i++) {
            ch += 1;
            testStr[i] = "" + ch;
        } 
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("Cadena de vectores generada: \n");
        
        for (int dato : testInt) {
            System.out.print(dato + " ");
        }
        System.out.println("");
        
        System.out.println("·············································");
        
        PruebaMetodos1.mostrarArrayPantalla2(testInt); 
        
        System.out.println("");
        
        System.out.println(PruebaMetodos1.obtenerArrayComoString(testInt));
        
         System.out.println("·············································");
         
        PruebaMetodos1.completarArray3(testInt);
        PruebaMetodos1.mostrarArrayPantalla2(testInt);
        
         System.out.println("·············································");

        System.out.println(PruebaMetodos1.obtenerSumaArray(testInt));
        
         System.out.println("·············································");

        testInt = PruebaMetodos1.arrayPotencias2(10);
        PruebaMetodos1.mostrarArrayPantalla2(testInt);
        
         System.out.println("·············································");

        System.out.println(PruebaMetodos1.concArrayCadenas(testStr));
        
        System.out.println("·············································");

        System.out.println(PruebaMetodos1.obtenerSumaLongCadArray(testStr));
        
        System.out.println("·············································");
        
        PruebaMetodos1.mostrarArrayPantalla2(PruebaMetodos1.obtenerLong(testStr));
        
        System.out.println("·············································");

        for (String mostrarCadena : PruebaMetodos1.obtenerArrCad5Vocales(cad)) {
            System.out.print(mostrarCadena + " ");
        }
        
        System.out.println("");
        System.out.println("·············································");
        
        mostrarCad2 = PruebaMetodos1.obtenerArrayOrdAlfab(cad);
        for (String string : mostrarCad2) {
            System.out.print(string + " ");
        }
        
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }
}
