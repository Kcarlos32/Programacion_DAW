/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;
import java.io.IOException;
/**
 *
 * @author carcas
 */
public class Ejercicio_03 {
    public static int devuelveEntero (int  num) throws Exception{
        try {
            if (num % 2 == 0){
                throw new Exception ("Lanzando excepcion rana");
            } else {
                throw new IOException("Lanzando excepciom pezespada");
            }
        } catch (IOException io){
            System.out.println(io.getMessage());
            return 2;
        }
    }
    public static void main(String[] args) {
        int a = 99;
        for (int i =0; i <10; i++){
            try{
                a = devuelveEntero(i);
            } catch (Exception e ){
                System.out.println(e.getMessage());
                a = 99;
            }
            System.out.println(a);
        }
    }
}
