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
public class Ejercicio_3 {
    
    public static String contadorDeLetras(String cad1, String cad2, char car){
        int cont1=0;
        int cont2=0;
        String mayor = "";
        
        for (int i = 0; i < cad1.length(); i++){
            if (cad1.toLowerCase().charAt(i) == car){
                cont1 ++;
            }
        }
        
        for (int i = 0; i < cad2.length(); i++){
            if (cad2.toLowerCase().charAt(i) == car){
                cont2 ++;
            }
        }
        
        if (cont1 > cont2){
            mayor = cad1;
        } else if(cont2 > cont1){
            mayor = cad2;
        }
        return mayor;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String cad1;
        String cad2;
        char car;

        System.out.println("Introduce la primera cadena: ");
        cad1 = tcl.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        cad2 = tcl.nextLine();
        System.out.println("Introduce un caracter: ");
        car = tcl.next().charAt(0);
        
        System.out.println("La letra escogida a sido: "+car);
        
        System.out.println(contadorDeLetras(cad1, cad2, car)+" tiene mas veces el caracter "+car);
    }
}
