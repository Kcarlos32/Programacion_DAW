/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetstettsç;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carcas
 */
public class probarTxt2 {
    public static void main(String[] args) throws IOException {
        String nombreFichero ="prueba2.txt";
        FileWriter fw = null;
        try{
            fw = new FileWriter(nombreFichero);
            for (char c = 'A'; c <= 'z'; c++) {
                fw.write(c);
            }
        } catch(FileNotFoundException e){
            System.out.println("~~ERROR: Fichero no encontrado");
        } catch(IOException e){
            System.out.println("~~ERROR: Fallo de lectura");
            System.out.println(e.getMessage());
        } finally{
            try{
                if (fw != null){
                    fw.close();
                }
            }catch(IOException e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }

}
