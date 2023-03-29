/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
//Escribe un programa que lance y capture una excepción de la clase
//Exception
public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        boolean erroneo = false;
        do{
        System.out.println("Introduce un numero mayor que cero: ");
        num = tcl.nextInt();
        erroneo = false;
        try {
            if(num < 0){
                erroneo = true;
                throw new Exception("Numero introducido menor que cero");
            }
        } catch (Exception e) {
            System.out.println("El error es: "+e.getMessage());
        }
        } while (erroneo);
    }
}
