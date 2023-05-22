/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class principal {

    public static void main(String[] args) {
        ArrayList<producto> listaProducto = new ArrayList<>();
        ArrayList<libro> listaLibro = new ArrayList<>();
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("============ MENU =============");
            System.out.println("1.- Introduce articulo.");
            System.out.println("2.- Visualiza lista");
            System.out.println("3.- Poner en listaLibro todos los libros.");
            System.out.println("4.- Guarda en Fichero. (Productos.dat)");
            System.out.println("5.- Salir.");
            System.out.println("································");
            System.out.print("Selecciona una opción:");
            opcion = tcl.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("································");
                        System.out.println("1.- TV");
                        System.out.println("2.- Libro");
                        System.out.println("3.- Salir");
                        System.out.println("································");
                        System.out.print("Selecciona una opción:");
                        opcion = tcl.nextInt();
                        System.out.println("································");
                        switch (opcion) {
                            case 1:
                                System.out.println("Introduce el tamaño de la televisión: ");
                                double tam = tcl.nextDouble();
                                System.out.println("Introduce el fabricante de la televisión: ");
                                String fab = tcl.next();
                                System.out.println("Introduce el precio base de la televisión: ");
                                double pre1 = tcl.nextDouble();
                                TV tv1 = new TV(tam, fab, pre1);
                                listaProducto.add(tv1);
                                break;
                            case 2:
                                System.out.println("Introduce el editor del libro: ");
                                String edi = tcl.next();
                                System.out.println("Introduce el año de publicacion: ");
                                int ano = tcl.nextInt();
                                System.out.println("Introduce el precio base del libro: ");
                                double pre2 = tcl.nextDouble();
                                libro li1 = new libro(edi, ano, pre2);
                                listaProducto.add(li1);
                                break;
                            case 3:
                                System.out.println("Volviendo al menu");
                                System.out.println("································");
                                break;
                            default:
                        }
                    } while (opcion != 3);
                    break;
                case 2:
                    for (producto listaProd : listaProducto) {
                        System.out.println(listaProd);
                    }
                    break;
                case 3:
                    for (producto libro : listaProducto) {
                        if (libro instanceof libro) {
                            listaLibro.add((libro) libro);
                        }
                    }
                    do {
                        System.out.println("································");
                        System.out.println("1.- Visualizar ordenado de menor a mayor por año de publicacion.");
                        System.out.println("2.- Visualizar ordenado alfabéticamente de menor a mayor por editor.");
                        System.out.println("3.- Visualizar ordenado alfabéticamente de mayor a menor por editor.");
                        System.out.println("4.- Salir");
                        System.out.println("································");
                        System.out.print("Selecciona una opción:");
                        opcion = tcl.nextInt();
                        System.out.println("································");
                        switch (opcion) {
                            case 1:
                                Collections.sort(listaLibro, new AnoPubliComparator());
                                System.out.println(listaLibro);
                                break;
                            case 2:
                                Collections.sort(listaLibro);
                                System.out.println(listaLibro);
                                break;
                            case 3:
                                Collections.sort(listaLibro, new EditorMayComparator().reversed());
                                System.out.println(listaLibro);
                                break;
                            case 4:
                                System.out.println("Volviendo al menu");
                                System.out.println("································");
                                break;
                            default:
                        }
                    } while (opcion != 4);
                    break;
                case 4:
                    String fichero = "archivo.dat";
                    try ( PrintWriter pw = new PrintWriter(new FileWriter(fichero))) {
                        for (producto lista : listaProducto) {
                            pw.println(lista);
                        }
                        System.out.println("Datos guardados correctamente en " + fichero);
                    } catch (IOException e) {
                        System.out.println("Error al guardar los datos en " + fichero);
                    }
                    break;
                case 5:
                    System.out.println("Cerrando el programa");
                    break;
                default:
            }
        } while (opcion != 5);
    }
}
