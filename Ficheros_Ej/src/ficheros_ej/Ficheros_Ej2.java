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

public class Ficheros_Ej2 {

    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner(System.in);

        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;

        String le1 = "seqFichero1.txt";
        String le2 = "seqFichero2.txt";

        System.out.println("Inserta nombre del fichero de salida: ");
        String esc = tcl.nextLine() + ".txt";

        System.out.println("Introduce el caracter que se usara como separador: ");
        char sep = tcl.next().charAt(0);

        try {
            br1 = new BufferedReader(new FileReader(le1));
            br2 = new BufferedReader(new FileReader(le2));
            bw = new BufferedWriter(new FileWriter(esc, false));

            String txt1 = br1.readLine();
            String txt2 = br2.readLine();

            int lin1 = 1;
            int lin2 = 1;

            while (br1.readLine() != null) {
                lin1++;
            }

            while (br2.readLine() != null) {
                lin2++;
            }

            br1 = new BufferedReader(new FileReader(le1));
            br2 = new BufferedReader(new FileReader(le2));
            for (int i = 0; i < lin1; i++) {
                txt1 = br1.readLine();
                br2 = new BufferedReader(new FileReader(le2));
                for (int j = 0; j < lin2; j++) {
                    txt2 = br2.readLine();
                    bw.write(txt1 + sep + txt2);
                    bw.newLine();
                }
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
                if (br2 != null) {
                    br2.close();
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
