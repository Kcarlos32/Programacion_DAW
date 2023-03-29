/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author margar01
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String nombreFichero = "nuevo.txt";
       BufferedWriter bw = null;
       Scanner tcl = new Scanner(System.in);
       String texto;
       try{
           bw =new BufferedWriter(new FileWriter(nombreFichero));
           int c = 1;
           do{
                System.out.println("Dame linea "+ c + ":");
                texto = tcl.nextLine();
                 bw.write(texto);
                 bw.newLine();
                 c++;
           }while (c<=10);
       }catch (IOException e){
           System.out.println("error de escritura");
       }finally{
           try{
               if (bw != null)
                   bw.close();
           }catch (IOException e){
                System.out.println("error al cerrar");
       }
    }
    
}
}