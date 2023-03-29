/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetstettsç;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author carcas
 */
public class probarTxt {
    public static void main(String[] args) throws IOException {
        String nombreFichero ="prueba2.txt";
        FileReader fr = null;
        try{
            fr = new FileReader(nombreFichero);
            int caract = fr.read();
            while (caract!= -1){
                System.out.print((char)caract);
                caract = fr.read();
            }
        } catch(FileNotFoundException e){
            System.out.println("~~ERROR: Fichero no encontrado");
        } catch(IOException e){
            System.out.println("~~ERROR: Fallo de lectura");
            System.out.println(e.getMessage());
        } finally{
            try{
                if (fr != null){
                    fr.close();
                }
            }catch(IOException e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
