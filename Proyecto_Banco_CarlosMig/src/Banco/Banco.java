package Banco;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carcas
 * @version 1.0
 * @param 
 */
public class Banco {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int seleccionar;
        Cuentas prueba = new Cuentas();
        
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("································");
            System.out.println("======= BANCO UNIVERSAL ========");
            System.out.println("1. Alta de cuentas");
            System.out.println("2. Consulta de una cuenta");
            System.out.println("3. Modificar cuentas");
            System.out.println("4. Anular cuentas");
            System.out.println("5. Listado de cuentas");
            System.out.println("0. Salir");
            System.out.println("································");
            System.out.print("Selecciona una opción:");
            seleccionar = tcl.nextInt();
            System.out.println("································");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            
            switch (seleccionar) {
                case 1:
                    System.out.println("--------------------------------\nDar de alta cuentas\n--------------------------------");
                    prueba.NuevaCuenta();
                    break;
                case 2:
                    System.out.println("--------------------------------\nConsultar cuentas existentes\n--------------------------------");
                    prueba.ConsultarCuenta();
                    break;
                case 3:
                    System.out.println("--------------------------------\nModificar cuentas existentes\n--------------------------------");
                    prueba.ModificarCuenta();
                    break;
                case 4:
                    System.out.println("--------------------------------\nAnular cuentas\n--------------------------------");
                    prueba.AnularCuenta();
                    break;
                case 5:
                    System.out.println("--------------------------------\nListado de cuentas\n--------------------------------");
                    prueba.VisualizarCuentas();
                    break;
            }
        } while (seleccionar != 0);
        System.out.println("Has cerrado el programa");
    }
}
