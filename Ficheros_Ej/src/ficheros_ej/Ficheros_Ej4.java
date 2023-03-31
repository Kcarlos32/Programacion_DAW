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

public class Ficheros_Ej4 {

    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner(System.in);
        
        BufferedReader br = null;
        BufferedWriter bw = null;

        String dni = "DNI.txt";
        String nif = "NIF.txt";

        try {
            br = new BufferedReader(new FileReader(dni));
            bw = new BufferedWriter(new FileWriter(nif, false));

            String txt1 = br.readLine();

            String letra = "TRWAGMYFPDXBNJZSQVHLCKE";

            while (txt1 != null) {
                while (txt1.length() < 8) {
                    txt1 = "0" + txt1;
                }
                int letra_nif = Integer.parseInt(txt1) % 23;
                bw.write(txt1 + letra.charAt(letra_nif));
                bw.newLine();
                txt1 = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
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

