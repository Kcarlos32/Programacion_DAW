/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BIBLIOTECA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class appBiblioteca {

    public static int cuentaPrestados(ArrayList<publicacion> listaPub) {
        int contador = 0;
        for (int i = 0; i < listaPub.size(); i++) {
            if (listaPub.get(i) instanceof libro) {
                contador++;
            }
        }
        return contador;
    }

    public static int publicacionesAnterioresA(ArrayList<publicacion> listaPub, int ano) {
        int contador = 0;
        for (int i = 0; i < listaPub.size(); i++) {
            if (listaPub.get(i).getAnoPub() < ano) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        ArrayList<publicacion> lista = new ArrayList();
        int ano = 2000;
//         int codigo, String titulo, int anoPub        
        libro l1 = new libro(6171, "Los Rumanos: historia de un país", 1896);
        libro l2 = new libro(1223, "Ximo Bayo & friends", 1996);

//        int numero, int codigo, String titulo, int anoPublicacion
        revista r1 = new revista(73, 1243, "Prensa Rosa", 2023);
        revista r2 = new revista(1, 5672, "Panoramas de más allá", 2002);

        lista.add(l1);
        lista.add(l2);
        lista.add(r1);
        lista.add(r2);

        l2.prestado();
        l1.prestado();

        System.out.println("El numero de libros prestados es: "+cuentaPrestados(lista));
        /* System.out.println("Introduce un año para ver si hay publicaciones anteriores: ");
        ano = tcl.nextInt();*/
        System.out.println("El numero de publicaciones anteriores a "+ano+" es: "+publicacionesAnterioresA(lista, ano));
        System.out.println(lista.toString());
    }
}
