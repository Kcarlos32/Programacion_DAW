/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author carcas
 */
public class Main {
    public static void main (String[] args){

        ArrayList lista = new ArrayList();
        lista.add(new Usuario("Paquirrin", 19));
        lista.add(new Usuario("Jefra", 21));
        lista.add(new Usuario("Anton io", 23));
        lista.add(new Usuario("Jeferio", 84));
        System.out.println(lista);
        
        System.out.println("\n Listado ordenado por nombre");
        Collections.sort(lista, new NombreComparator());
        System.out.println(lista);
        System.out.println("\n Listado ordenado por edad");
        Collections.sort(lista, new EdadComparator());
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);

    }
    
}
