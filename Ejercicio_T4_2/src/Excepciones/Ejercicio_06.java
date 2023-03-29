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
public class Ejercicio_06 {
    
    private static void enviarMensaje(String s) throws DirCorreoIncorrectaExcepcion {
        boolean arroba = false;
        boolean punto = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                arroba = true;
            }
            if (arroba) {
                if (s.charAt(i) == '.') {
                    if (i < s.length() - 1) {
                        if (s.charAt(i - 1) != '@') {
                            punto = true;
                        }
                    }
                }
            }
        }
        if (arroba && punto) {
            System.out.println("La dirección introducida es correcta");
        } else {
            throw new DirCorreoIncorrectaExcepcion("La dirección inroducida esta mal");
        }
    }

    public static void main(String[] args) throws DirCorreoIncorrectaExcepcion {
        Scanner kb = new Scanner(System.in);
        String correo;
        System.out.print("Introduce una dirección de correo: ");

        correo = kb.nextLine();
        enviarMensaje(correo);
    }

    private static class DirCorreoIncorrectaExcepcion extends Exception {

        public DirCorreoIncorrectaExcepcion(String la_dirección_de_correo_es_INCORRECTA) {
        }
    }
}

