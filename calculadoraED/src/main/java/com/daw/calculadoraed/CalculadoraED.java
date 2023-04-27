/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.daw.calculadoraed;

/**
 *
 * @author carcas
 */
public class CalculadoraED {

    public static void main(String[] args) {
        Resta r = new Resta();
        Suma s = new Suma();
        System.out.println(r.getResta(0, 0));
        System.out.println(r.decrementa(0, 0));
        System.out.println(s.getSuma(0, 0));
        System.out.println(s.incrementa(0, 0));
    }
}
