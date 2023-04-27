/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacientes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author carcas
 */
public class gestionPacientes {
    public static void main(String[] args) {
    archivador a = new archivador();
        
         ObjectInputStream ist;
        try {
            ist = new ObjectInputStream(new BufferedInputStream(new FileInputStream("archi.dat")));
            a = (archivador) ist.readObject();
            ist.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }     
        
        ficha f = new ficha("Antonio", "Fernandez", 42);

        a.guardar(f);
        a.guardar(new ficha("Josefa", "Pepita", 23));
        a.guardar(new ficha("Miguel", "Bose", 74));
        a.listar();
        a.eliminar(f);
        a.listar();
        a.eliminar("Josefa");
        a.listar();
        
        ObjectOutputStream ost;
        try {
            ost = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("multi.dat")));
            ost.writeObject(a);
            ost.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

