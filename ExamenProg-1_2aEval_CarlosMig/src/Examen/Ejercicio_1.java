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
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        float[] notas = new float[10];
        String[] alumnos = new String[10];
        boolean erroneo = true;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("INTRODUCIR NOTAS");
        System.out.println("·············································");
        for (int i = 0; i < notas.length; i++) {
            do{
            System.out.println("Introduce la nota de un alumno: ");
            notas[i] = tcl.nextFloat();
            if (notas[i] > 10 || notas[i] < 0){ 
                erroneo = true; 
                System.out.println("Numero incorrecto, vuelve a introducir");
            } else{
                erroneo = false;
            }
            }while (erroneo);
        }
        tcl.nextLine(); //VACIAR EL BUFFER
        System.out.println("·············································");
        System.out.println("INTRODUCIR NOMBRES");
        for (int i = 0; i < alumnos.length; i++){
            do{
            System.out.println("Introduce el nombre de un alumno: ");
            alumnos[i] = tcl.nextLine();
            if (alumnos[i].equals("")){
                erroneo = true;
                System.out.println("Nombre incorrecto, vuelve a introducir");
            } else{
                erroneo = false;
            }
            }while (erroneo);
        }
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        String[] resultado = new String[notas.length];
        for (int i = 0; i < resultado.length; i++) {
            if (notas[i] < 5){
                resultado[i] = "SUSPENSO";
            } else if (notas[i] < 7 && notas[i] >= 5){
                resultado[i] = "BIEN";
             } else if (notas[i] < 9 && notas[i] >= 7){
                resultado[i] = "NOTABLE";
             } else if (notas[i] == 10 && notas[i] >= 9){
                resultado[i] = "SOBRESALIENTE";
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El alumno: "+alumnos[i]+", tiene un:  "+notas[i]+" "+resultado[i]);
        }
    }
}
