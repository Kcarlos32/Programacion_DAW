/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRACTICA_FICHEROS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();
        Scanner tcl = new Scanner(System.in);
        int opcion;
        do {
             System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("============ MENU =============");
            System.out.println("1.- Introducir datos.");
            System.out.println("2.- Buscar (por nombre, visualizar todos los objetos que tengan el mismo nombre).");
            System.out.println("3.- Modificar.");
            System.out.println("4.- Borrar (Buscar por carnet y borrar).");
            System.out.println("5.- Guardar aprobados (en fichero alumnos5.dat).");
            System.out.println("6.- Visualizar aprobados.");
            System.out.println("7.- Guardar en alumnos.dat.");
            System.out.println("8.- Salir.");
            System.out.println("································");
            System.out.print("Selecciona una opción:");
            opcion = tcl.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            switch (opcion) {
                case 1:
                    Alumno.ponerDatos(lista);
                    break;
                case 2:
                    System.out.print("Introduce el nombre a buscar: ");
                    String nombre = tcl.nextLine();
                    boolean encontrado = false;
                    for (Alumno alumno : lista) {
                        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                            System.out.println(alumno.toString());
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se han encontrado alumnos con el nombre " + nombre);
                    }
                    break;
                case 3:
                    System.out.print("Introduce el carnet del alumno a modificar: ");
                    String carnet = tcl.nextLine();
                    encontrado = false;
                    for (Alumno alumno : lista) {
                        if (alumno.getCarnet().equalsIgnoreCase(carnet)) {
                            System.out.println("Introduce el nuevo nombre del alumno:");
                            String nuevoNombre = tcl.nextLine();
                            System.out.println("Introduce los nuevos apellidos del alumno:");
                            String nuevosApellidos = tcl.nextLine();
                            System.out.println("Introduce la nueva nota 1 del alumno:");
                            double nuevaNota1 = Double.parseDouble(tcl.nextLine());
                            System.out.println("Introduce la nueva nota 2 del alumno:");
                            double nuevaNota2 = Double.parseDouble(tcl.nextLine());
                            System.out.println("Introduce la nueva nota 3 del alumno:");
                            double nuevaNota3 = Double.parseDouble(tcl.nextLine());
                            alumno.setNombre(nuevoNombre);
                            alumno.setApellidos(nuevosApellidos);
                            alumno.setNota1(nuevaNota1);
                            alumno.setNota2(nuevaNota2);
                            alumno.setNota3(nuevaNota3);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se ha encontrado ningún alumno con el carnet " + carnet);
                    }
                    break;
                case 4:
                    System.out.print("Introduce el carnet del alumno a borrar: ");
                    carnet = tcl.nextLine();
                    Iterator<Alumno> iterator = lista.iterator();
                    encontrado = false;
                    while (iterator.hasNext()) {
                        Alumno alumno = iterator.next();
                        if (alumno.getCarnet().equalsIgnoreCase(carnet)) {
                            iterator.remove();
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se ha encontrado ningún alumno con el carnet " + carnet);
                    } else {
                        System.out.println("Alumno borrado correctamente.");
                    }
                    break;
                case 5:
                    Alumno.pasarFichero5(lista, "alumnos5.dat");
                    break;
                case 6:
                    Alumno.visualizarFichero5("alumnos5.dat");
                    break;
                case 7:
                    Alumno.llenarArchivo(lista, "alumnos.dat");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }
}
