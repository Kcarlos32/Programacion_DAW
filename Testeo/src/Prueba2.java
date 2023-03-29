
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class Prueba2 {
        public static void main(String[] args) {
            Scanner tcl = new Scanner(System.in);
            int coorX, coorY;
            Prueba punto1;
            punto1=new Prueba();
            System.out.println("Ingresa la coordenada x: ");
            coorX=tcl.nextInt();
            System.out.println("Ingresa la coordenada y:");
            coorY=tcl.nextInt();
            punto1.setCoordenadas(coorX,coorY);
            
            System.out.println("Hablamos del punto ( "+punto1.getCoordenadasX()+" , "+punto1.getCoordenadasY()+" )");
            punto1.imprimirCuadrante();
    }
}
