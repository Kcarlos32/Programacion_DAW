/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/**
 *
 * @author carcas
 */
public class EjecutaCongreso {
        static ArrayList<Legislador> listaLegis = new ArrayList<>();
        static ArrayList<Senador> listaSen = new ArrayList<>();
        static ArrayList<Diputado> listaDip = new ArrayList<>();
    
        public static void ordenarListaApellidos() {
        Collections.sort(listaLegis, (Legislador p1, Legislador p2) -> {
            if (p1 instanceof Legislador && p2 instanceof Legislador) {
                Legislador l1 = (Legislador) p1;
                Legislador l2 = (Legislador) p2;
                return l1.getApellidos().compareToIgnoreCase(l2.getApellidos());
            }
            return 0;
        }
        );
    }
        public static void ordenarListaEdad() {
        Collections.sort(listaLegis, (Legislador p1, Legislador p2) -> {
            if (p1 instanceof Legislador && p2 instanceof Legislador) {
                Legislador l1 = (Legislador) p1;
                Legislador l2 = (Legislador) p2;
                return l1.getEdad() - l2.getEdad();
            }
            return 0;
        }
        );
    }
        public static void ordenarListaEdadRev() {
        Collections.sort(listaLegis, (Legislador p1, Legislador p2) -> {
            if (p1 instanceof Legislador && p2 instanceof Legislador) {
                Legislador l1 = (Legislador) p1;
                Legislador l2 = (Legislador) p2;
                return l2.getEdad() - l1.getEdad();
            }
            return 0;
        }
        );
    }
    

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcion;
        
        ObjectInputStream d = null;
        File f1 = new File("Legisladores.dat");
        File f2 = new File("Diputado.dat");
        File f3 = new File("Senador.dat");
                
        try {
            d = new ObjectInputStream(new FileInputStream(f1));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            listaLegis = (ArrayList<Legislador>) d.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch (NullPointerException ex) {
            System.out.println("Archivo aun no creado\n");
        }
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("============ MENU =============");
            System.out.println("1.- Introducir datos.");
            System.out.println("2.- Visualizar lista ordenada.");
            System.out.println("3.- Guardar en fichero Diputado.dat.(Ordenado por apellidos)");
            System.out.println("4.- Guardar en fichero Senador.dat.(Ordenado por apellidos)");
            System.out.println("5.- Guardar en fichero Legisladores.dat.(Ordenado por edad de mayor a menor)");
            System.out.println("6.- Salir");
            System.out.println("································");
            System.out.print("Selecciona una acción:");
            opcion = tcl.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("································");
                        System.out.println("======== INTRODUCIR ==========");
                        System.out.println("1.- Introducir diputados.");
                        System.out.println("2.- Introducir senadores.");
                        System.out.println("3.- Volver al menú.");
                        System.out.println("································");
                        System.out.print("Selecciona una opción:");
                        opcion = tcl.nextInt();
                        System.out.println("································");
                        switch (opcion) {
                            case 1:
                                Diputado dp1 = new Diputado("Hernando", "Garmendia Gutierrez", 34, "Albacete", "PP", 32, 123);
                                listaLegis.add(dp1);
                                Diputado dp2 = new Diputado("Miguel", "Hernandez Sorolla", 46, "Valencia", "PSOE", 46, 12);
                                listaLegis.add(dp2);
                                Diputado dp3 = new Diputado("Anna", "Rimuela De Abajo", 24, "A Coruña", "PODEMOS", 243, 78);
                                listaLegis.add(dp3);
                                Diputado dp4 = new Diputado("Josefina", "Olomeda Ponzola", 51, "Madrid", "VOX", 32, 231);
                                listaLegis.add(dp4);
                                System.out.println("Diputados introducidos");
                                System.out.println("································");
                                for (Legislador legis : listaLegis) {
                                    if (legis instanceof Diputado) {
                                        listaDip.add((Diputado) legis);
                                    }
                                }
                                    break;
                        case 2:
                                Senador se1 = new Senador("Fenanda", "Barros", 40, "Alicante", "Compromis", 89, 23);
                                listaLegis.add(se1);
                                Senador se2 = new Senador("Maria de la Trinidad", "Martinez Romero", 61, "Valencia", "PP", 99, 67);
                                listaLegis.add(se2);
                                Senador se3 = new Senador("Pepe", "Viyuela Bayo", 31, "Caceres", "PACMA", 34, 98);
                                listaLegis.add(se3);
                                System.out.println("Senador introducidos");
                                System.out.println("································");
                                for (Legislador legis : listaLegis) {
                                    if (legis instanceof Senador) {
                                        listaSen.add((Senador) legis);
                                    }
                                }
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
                    do {
                        System.out.println("································");
                        System.out.println("======== VISUALIZAR ==========");
                        System.out.println("1.- Lista ordenada por apellidos de menor a mayor.");
                        System.out.println("2.- Lista ordenada por edad de menor a mayor.");
                        System.out.println("3.- Lista ordenada por edad de mayor a menor.");
                        System.out.println("4.- Volver al menú.");
                        System.out.println("································");
                        System.out.print("Selecciona una opción:");
                        opcion = tcl.nextInt();
                        System.out.println("································");
                        switch (opcion) {
                            case 1:
                                ordenarListaApellidos();
                                System.out.println(listaLegis);
                                break;
                            case 2:
                                ordenarListaEdad();
                                System.out.println(listaLegis);
                                break;
                            case 3:
                                ordenarListaEdadRev();
                                System.out.println(listaLegis);
                                break;
                            case 4:
                                break;
                            default:
                        }
                    } while (opcion != 4);
                    break;
                case 3:
                    System.out.println("Guardando en fichero Diputado.dat");
                    try ( PrintWriter pw = new PrintWriter(new FileWriter(f2))) {
                        pw.println(listaDip);
                        System.out.println("Datos guardados correctamente en " + f2);
                    } catch (IOException e) {
                        System.out.println("Error al guardar los datos en " + f2);
                    }
                    break;
                case 4:
                    try ( PrintWriter pw = new PrintWriter(new FileWriter(f3))) {
                        pw.println(listaSen);
                        System.out.println("Datos guardados correctamente en " + f3);
                    } catch (IOException e) {
                        System.out.println("Error al guardar los datos en " + f3);
                    }
                    break;
                case 5:
                    try ( PrintWriter pw = new PrintWriter(new FileWriter(f1))) {
                        pw.println(listaLegis);
                        System.out.println("Datos guardados correctamente en " + f1);
                    } catch (IOException e) {
                        System.out.println("Error al guardar los datos en " + f1);
                    }
                    break;
                case 6:
                    System.out.println("Cerrando el programa");
                    break;
                default:
            }
        
            }
            while (opcion != 6);

        }
    }
