/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author carcas
 */
public class miAgendaRea {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try ( ObjectInputStream d = new ObjectInputStream(new FileInputStream("archivo.dat"))) {

            while (true) {
                miAgenda agenda = (miAgenda) d.readObject();
                System.out.println("Nombre: " + agenda.getNombre());
                System.out.println("Direccion: " + agenda.getDireccion());
                System.out.println("Email: " + agenda.getEmail());
                System.out.print("Telefono: ");

                for (int i = 0; i < agenda.getFono().size(); i++) {
                    System.out.print("" + agenda.getFono().get(i) + " ");
                }
                System.out.println("\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
