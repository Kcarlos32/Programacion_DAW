/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Intervalos;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class ProgEx {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limSup, limInf,numInt;
        int contFuera = 0;
        int contSum = 0;
        boolean igual=  false ;
        
        System.out.println("Para parar el programa escribe 0");
        
        System.out.println("Introduce un numero como limite superior: ");
        limSup = tcl.nextInt();
        System.out.println("Introduce un numero como limite inferior: ");
        limInf = tcl.nextInt();
        
        if (limSup < limInf){
            System.out.println("El limite inferior es mayor al limite superior, vuelve a introducir los limites: ");
                System.out.println("Introduce otra vez el limite superior: ");
                limSup = tcl.nextInt();
                System.out.println("Introduce otra vez el limite inferior: ");
                limInf = tcl.nextInt();
        }
            while (limSup !=0 || limInf !=0){
                System.out.println("Introduce un numero entre los limites: ");
                numInt = tcl.nextInt(); 
                 if (numInt == 0){
                    break;
                }
                if (numInt == limSup || numInt == limInf){
                    igual = true;
                }
                if (numInt > limSup || numInt < limInf){
                    contFuera++;
                } else {
                   contSum = numInt + contSum; 
                }
        }
        System.out.println(contFuera+" numeros eran de fuera del intervalo");
        System.out.println("La suma de los numero es: "+contSum);
        if (igual)
            System.out.println("Se ha introducido un numero igual a uno de los limites");
    }
}
