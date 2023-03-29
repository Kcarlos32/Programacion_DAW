/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author margar01
 */
public class LecturaEscritura {

    public static void main(String[] args) throws IOException {
        String nombreFichero1 = null;
        String nombreFichero2 = null;
        String nombreFichero3 = null;
        BufferedWriter bw1 = null;
        BufferedWriter bw2 = null;

        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame nombre de los 3 fichros");
        nombreFichero1 = tcl.nextLine();
        nombreFichero2 = tcl.nextLine();
        nombreFichero3 = tcl.nextLine();
        String texto = null;
        try {

            System.out.println("Dame lineas para el fichero: " + nombreFichero1);
            bw1 = new BufferedWriter(new FileWriter(nombreFichero1));
            texto = tcl.nextLine();
            while (!"".equals(texto)) {
                bw1.write(texto + "\n");
                texto = tcl.nextLine();
            }
            System.out.println("Dame lineas para el fichero: " + nombreFichero2);
            bw2 = new BufferedWriter(new FileWriter(nombreFichero2));
            texto = tcl.nextLine();
            while (!"".equals(texto)) {
                bw2.write(texto + "\n");
                texto = tcl.nextLine();
            }
        } catch (IOException e) {
            System.out.println("error de escritura");
        } finally {
            try {
                if (bw1 != null) {
                    bw1.close();
                }
                if (bw2 != null) {
                    bw2.close();
                }
            } catch (IOException e) {
                System.out.println("error al cerrar");
            }
        }
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw3 = null;
        String sim = null;
        String texto1 = null;
        String texto2 = null;
        try {

            System.out.println("Dame símbolo separador:");
            sim = tcl.nextLine();
            br1 = new BufferedReader(new FileReader(nombreFichero1));
            br2 = new BufferedReader(new FileReader(nombreFichero2));
            bw3 = new BufferedWriter(new FileWriter(nombreFichero3));
            texto1 = br1.readLine();
            texto2 = br2.readLine();
            while ((texto1 != null) && (texto2 != null)) {
                bw3.write(texto1);
                bw3.write(sim);
                bw3.write(texto2 + "\n");
                texto1 = br1.readLine();
                texto2 = br2.readLine();
            }
            if (texto1 != null) {
                while (texto1 != null) {
                    bw3.write(texto1 + "\n");
                    texto1 = br1.readLine();
                }
            } else {
                while (texto2 != null) {
                    bw3.write(texto2 + "\n");
                    texto2 = br2.readLine();
                }
            }

        } catch (IOException e) {
            System.out.println("error de escritura");
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
                if (bw3 != null) {
                    bw3.close();
                }
            } catch (IOException e) {
                System.out.println("error al cerrar");
            }
        }

    }
}
