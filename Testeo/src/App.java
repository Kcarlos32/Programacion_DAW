
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carcas
 */
public class App {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n = 0;
        Ficha f1 = new Ficha();
        Ficha f2 = new Ficha();
        
         if (f1.casillaActual() > 25) {
            n = (int) (Math.random() * 6 + 1) - n;
            int p = f1.casillaActual() - n;
            f1.avanzar(n);
        }
        if (f2.casillaActual() > 25) {
            n = (int) (Math.random() * 6 + 1) - n;
            int p = f1.casillaActual() - n;
            f2.avanzar(n);
        }

        if (f1.casillaActual() == 25) {
            System.out.println("f1 gana");
        }
        if (f2.casillaActual() == 25) {
            System.out.println("f2 gana");
        }

        do {
            System.out.println("Turno f1");
            tcl.nextLine();
            n = (int) (Math.random() * 6 + 1);
            f1.avanzar(n);
            System.out.println("Dado: " + n + " Casilla: " + f1.casillaActual());
            System.out.print("---------------- \n");

            System.out.println("Turno f2");
            tcl.nextLine();
            n = (int) (Math.random() * 6 + 1);
            f2.avanzar(n);
            System.out.println("Dado: " + n + " Casilla: " + f2.casillaActual());
            System.out.print("---------------- \n");

        } while (f1.casillaActual() < 25 || f2.casillaActual() < 25);

       
    }
}
