/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String nom;
        String apell1;
        String apell2;

        System.out.println("Introduce tu nombre");
        nom = tcl.nextLine();
        System.out.println("Introduce tu primer apellido");
        apell1 = tcl.nextLine();
        System.out.println("Introduce tu segundo apellido");
        apell2 = tcl.nextLine();

        String nomCom = nom.concat(apell1).concat(apell2);

        System.out.println("···················································································");
        System.out.println("Nombre completo en minusculas: " + nom.toLowerCase() + ", " + apell1.toLowerCase() + ", " + apell2.toLowerCase());
        System.out.println("Nombre completo en mayusculas: " + nom.toUpperCase() + ", " + apell1.toUpperCase() + ", " + apell2.toUpperCase());
        System.out.println("El nombre tiene " + nom.length() + " letras, el primer apellido tiene " + apell1.length() + " letras y el segundo apellido tiene " + apell2.length() + " letras.");
        System.out.println("···················································································");
        if (nom.length() > 2) {
            System.out.println("Las dos primeras letras del nombre son: " + nom.substring(0, 2));
        } else {
            System.out.println("Nombre demasiado corto 🖕🖕🖕🖕🖕");
        }
        System.out.println("···················································································");
        if (nom.length() > 2) {
            System.out.println("Las dos ultimas letras del nombre son: " + nom.charAt(nom.length() - 2) + nom.charAt(nom.length() - 1));
        } else {
            System.out.println("Nombre demasiado corto 🖕🖕🖕🖕🖕");
        }
        System.out.println("···················································································");
        char ultCar;
        int cont = 0;

        ultCar = nomCom.charAt(nomCom.length() - 1);

        for (int i = 0; i < nomCom.length(); i++) {
            int indice = nomCom.indexOf(ultCar, i);
            if (indice != -1) {
                cont++;
                i = indice;
            }
        }
        System.out.println("La letra " + ultCar + " esta escrita " + cont + " veces");
        System.out.println("···················································································");
        char priCar;
        String nomCom2 = nomCom;

        priCar = nomCom.charAt(0);
        char priMay = Character.toUpperCase(priCar);

        nomCom2 = nomCom.replace(priCar, priMay);

        System.out.println(nomCom2);
        System.out.println("···················································································");
        System.out.println("***" + nomCom + "***");
        System.out.println("···················································································");
        String nomComInv = "";
        for (int x = nomCom.length() - 1; x >= 0; x--){
            nomComInv = nomComInv + nomCom.charAt(x);
        }
        System.out.println("El nombre al revés "+nomComInv);
        System.out.println("···················································································");
    }
}
