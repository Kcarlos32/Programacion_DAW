/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class miAgendaRe2 {

    public static void main(String[] args) throws IOException {

        File f = new File("archivo.dat");
        String otro;
        String nombre, email, direccion;

        Scanner tcl = new Scanner(System.in);
        FileOutputStream ficha;
        ObjectOutputStream d;
        try {

            if (f.exists()) {
                ficha = new FileOutputStream(f, true);

                d = new miObjOutStr(ficha);
            } else {
                ficha = new FileOutputStream(f);
                d = new ObjectOutputStream(ficha);
            }

            do {
                ArrayList lista = new ArrayList();
                System.out.print("Introduce tu nombre: ");
                nombre = tcl.nextLine();
                System.out.print("Introduce tu direccion: ");
                direccion = tcl.nextLine();

                System.out.print("Introduce tu email: ");
                email = tcl.nextLine();

                do {
                    System.out.print("Introduce tu telefono:  ");
                    String fono = tcl.nextLine();
                    lista.add(fono);
                    System.out.print("Quieres añadir otro telefono (s/n): ");
                    otro = tcl.nextLine().charAt(0) + "";
                } while (otro.equals("s") || otro.equals("S"));
                d.writeObject(new miAgenda(nombre, direccion, lista, email));
                System.out.print("Quieres otro registro s/n: ");
                otro = tcl.nextLine();
            } while (otro.equals("s") || otro.equals("S"));
            d.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
