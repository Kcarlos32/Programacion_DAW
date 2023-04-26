/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazserializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author davher
 */
public class MiAgendaEscribe {

    public static void main(String[] args) throws IOException {
        File f = new File("agenda.dat");
        Scanner flujoEntrada = new Scanner(System.in);
        f.createNewFile();
        FileOutputStream ficha = new FileOutputStream(f);
        try (ObjectOutputStream d = new ObjectOutputStream(ficha)) {
            String fo, otro;
            String nombre, direcion, email;
            do {
                ArrayList lista = new ArrayList();
                    System.out.print("Dame tu nombre: ");
                    nombre = flujoEntrada.nextLine();
                    System.out.print("Dame tu direcion: ");
                    direcion = flujoEntrada.nextLine();
                    System.out.print("Dame tu email: ");
                    email = flujoEntrada.nextLine();
                do {
                    System.out.print("Teléfono: ");
                    fo = flujoEntrada.nextLine();
                    lista.add(fo);
                    System.out.print("Otro Fono (si/no): ");
                    otro = flujoEntrada.nextLine();
                    
                } while (otro.equals("si") || otro.equals("SI"));
                d.writeObject(new MiAgenda(nombre, direcion, lista, email));
                System.out.print("Otro contacto? ");
                otro = flujoEntrada.nextLine();
                
            } while (otro.equals("si") || otro.equals("SI"));
            d.close();
        }
    }
}
