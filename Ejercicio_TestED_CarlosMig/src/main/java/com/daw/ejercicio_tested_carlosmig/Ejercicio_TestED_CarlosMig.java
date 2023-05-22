/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.daw.ejercicio_tested_carlosmig;

/**
 *
 * @author carcas
 */
public class Ejercicio_TestED_CarlosMig {

    public static float[] notas = new float[10];
    public static String[] alumnos = new String[10];
    public static String[] resultado = new String[10];

    public static void main(String[] args) {
        String[] nombres = {"Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry",
            "Bartolo", "Bartolomé", "Baruc", "Baruj", "Candelaria", "Puina", "Canela", "Caridad", "Carina",
            "Lerio", "Louje", "Carlota", "Pedro", "Caruoli", "Ploiter", "Eriopli"};

        boolean erroneo = true;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("·············································");
        System.out.println("INTRODUCCION DE NOTAS");
        System.out.println("·············································");
        for (int i = 0; i < notas.length; i++) {
            do {
                notas[i] = (int) (Math.random() * 10);
                if (notas[i] > 10 || notas[i] < 0) {
                    erroneo = true;
                    System.out.println("Numero incorrecto, vuelve a introducir");
                } else {
                    erroneo = false;
                }
            } while (erroneo);
        }
        System.out.println("·············································");
        System.out.println("INTRODUCCION DE NOMBRES");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1))))] + "";
        }
        System.out.println("·············································");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < resultado.length; i++) {
            if (notas[i] < 5) {
                resultado[i] = "SUSPENSO";
            } else if (notas[i] < 7 && notas[i] >= 5) {
                resultado[i] = "BIEN";
            } else if (notas[i] < 9 && notas[i] >= 7) {
                resultado[i] = "NOTABLE";
            } else if (notas[i] <= 10 && notas[i] >= 9) {
                resultado[i] = "SOBRESALIENTE";
            }
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("El alumno: " + alumnos[i] + ", tiene un:  " + notas[i] + " " + resultado[i]);
        }
    }

}
