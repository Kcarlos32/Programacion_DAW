/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

/**
 *
 * @author carcas
 */
public class Ficheros_Ej1 {
    public static void main(String[] args) throws IOException {
        Scanner tcl = new Scanner(System.in);
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;
        
        String leer1 = "seqFichero1.txt";
        String leer2 = "seqFichero2.txt";
        
        System.out.println("Introduce el nombre del fichero de salida: ");
        String esc1 = tcl.nextLine()+".txt";
        
        System.out.println("Introduce el caracter que se usara como separador");
        char sep = tcl.nextLine().charAt(0);
        
        try{
            br1 = new BufferedReader(new FileReader(leer1));
            br2 = new BufferedReader(new FileReader(leer2));
            bw = new BufferedWriter(new FileWriter(esc1, true));
            
            String txt1 = br1.readLine();
            String txt2 = br2.readLine();
            
            while (txt1 != null || txt2 != null ){
                bw.write(txt1 + sep + txt2);
                bw.newLine();
                
                txt1 = br1.readLine();
                txt2 = br2.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
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