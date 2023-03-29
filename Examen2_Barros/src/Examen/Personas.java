/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Personas {

    public static ArrayList<Persona> totalPersonas = new ArrayList();

    public void anadir(Persona per) {
        totalPersonas.add(per);
    }

    public void borrar(Persona per) {
        totalPersonas.remove(per);
    }

    public void borrarTodo() {
        totalPersonas.removeAll(totalPersonas);
    }

    public static Persona posNombre(String nombre) {
        Persona devolver = null;
        for (int i = 0; i < totalPersonas.size(); i++) {
            if (totalPersonas.get(i).getNombre().equals(nombre)) {
                devolver = totalPersonas.get(i);
            }
        }
        return devolver;
    }
    public static Persona buscarPer(){
        Scanner tcl = new Scanner(System.in);
        String guardar;
        Persona devolver = null;

        System.out.println("Introduce el nombre de la persona que quieres buscar: ");
        guardar = tcl.nextLine();
        devolver = posNombre(guardar);
        return null;
       
    }

    public void borrarEst() {
        Scanner tcl = new Scanner(System.in);
        Persona devolver = new Persona();
        devolver= buscarPer();
        
        boolean bobo = true;

        do {
            System.out.println("Estas seguro de que quieres continuar? \n(1) SI (2) NO");
            Byte eleccion = tcl.nextByte();
            if (eleccion == 1) {
                if (devolver != null) {
                    totalPersonas.remove(devolver);
                    bobo = false;
                    System.out.println("Operación completada");
                }
            } else if (eleccion == 2) {
                System.out.println("Operación cancelada");
                bobo = false;
            } else {
                System.out.println("El numero introducido es incorrecto");
            }
        } while (bobo);
    }

    public void ListadoPersonas() {
        System.out.println("");
        Iterator x = totalPersonas.iterator();
        while (x.hasNext()) {
            System.out.println((Persona) x.next());
        }
    }
    public void ListadoProf() {
        System.out.println("");
        Iterator x = totalPersonas.iterator();
        while (x.hasNext()) {
            System.out.println((Persona) x.next());
        }
    }
}
