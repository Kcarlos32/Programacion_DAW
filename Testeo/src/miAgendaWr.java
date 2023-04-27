/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class miAgendaWr {

    public static void main(String[] args) throws IOException {
        File f = new File("agenda.dat");
        Scanner tcl = new Scanner(System.in);
        f.createNewFile();
        FileOutputStream ficha = new FileOutputStream(f);
        try ( ObjectOutputStream d = new ObjectOutputStream(ficha)) {
            String fo, otro;
            String nombre, direcion, email;
            do {
                ArrayList lista = new ArrayList();
                System.out.print("Introduce tu nombre: ");
                nombre = tcl.nextLine();
                System.out.print("Introduce tu direcion: ");
                direcion = tcl.nextLine();
                System.out.print("Introduce tu email: ");
                email = tcl.nextLine();
                do {
                    System.out.print("Introduce tu teléfono: ");
                    fo = tcl.nextLine();
                    lista.add(fo);
                    System.out.print("Otro Fono (si/no): ");
                    otro = tcl.nextLine().charAt(0) + "";

                }  while (otro.equals("s") || otro.equals("S"));
                //d.writeObject(new miAgenda(nombre, direcion, lista, email));
                System.out.print("Otro contacto? ");
                otro = tcl.nextLine().charAt(0) + "";

            }  while (otro.equals("s") || otro.equals("S"));
            d.close();
        }
    }
}
