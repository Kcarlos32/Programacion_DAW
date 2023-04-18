/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_ej;

/**
 *
 * @author carcas
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros_Ej3 {

    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner(System.in);
        
        BufferedReader br1 = null;
        BufferedWriter bw = null;

        String le = "seqFichEj3.txt";

        System.out.println("Inserta nombre del fichero de salida: ");
        String esc = tcl.nextLine() + ".txt";

        System.out.println("Introduce el tamaño minimo de las lineas: ");
        int cant = tcl.nextInt();

        try {
            br1 = new BufferedReader(new FileReader(le));
            bw = new BufferedWriter(new FileWriter(esc, false));

            String texto1 = br1.readLine();

            while (texto1 != null) {
                if (texto1.length() >= cant) {
                    bw.write(texto1);
                    bw.newLine();
                }
                texto1 = br1.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }

    }
}

