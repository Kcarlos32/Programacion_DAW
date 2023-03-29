/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author carcas
 */
public class Ejercicio_3 {
    public static String devuelveMitad (String cadena){
        String x = "";
        
        for (int i = 0; i < (cadena.length()/2);i++){
            x = x + cadena.charAt(i);
        }
        return x;
    }
    
    public static void main(String[] args) {
        String cadena = "Hola que tal";
        String cadena2 = "Adiós";
        
        System.out.println(devuelveMitad(cadena));        
        System.out.println(devuelveMitad(cadena2));
    }
}
