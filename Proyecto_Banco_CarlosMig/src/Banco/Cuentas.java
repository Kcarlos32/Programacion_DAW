/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carcas
 */
public class Cuentas {

    private ArrayList<Cuenta> cuentasTotales = new ArrayList();
    private int total;

        
    public Cuenta posCuentaNombre(String nombre) {
        Cuenta devolver = null;
        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getNombre().equals(nombre)) {
                devolver = cuentasTotales.get(i);
            }
        }
        return devolver;
    }

    public Cuenta posCuenta(String numcta) {
        Cuenta devolver = null;
        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getCuenta().equals(numcta)) {
                devolver = cuentasTotales.get(i);
            }
        }
        return devolver;
    }

    public Cuenta buscarCuenta() {
        Scanner tcl = new Scanner(System.in);
        String guardar;
        Cuenta devolver = null;
        
        System.out.println("Quieres buscar por nombre de cuenta (1) o numero de cuenta (2)");
        byte selector = tcl.nextByte();
        tcl.nextLine();
        
        switch (selector) {
            case 1:
                System.out.println("Introduce el nombre de la cuenta que quieres buscar: ");
                guardar = tcl.nextLine();
                devolver = posCuentaNombre(guardar);
                break;
            case 2:
                System.out.println("Introduce el numero de cuenta de la cuenta que quieres buscar: ");
                guardar = tcl.nextLine();
                devolver = posCuenta(guardar);
                break;
        }
        return devolver;
    }

    public int NuevaCuenta() {
        Scanner tcl = new Scanner(System.in);
        Cuenta nueva = new Cuenta();
        int posicion = 0;
        String nom;
        String nomCu;
        double saldo;
        double intereses;
        boolean erroneo = false;

        do {
            System.out.println("Introduce tu nombre:  ");
            nom = tcl.nextLine();
            erroneo = true;
            try {
                nueva.setNombre(nom);
                erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (erroneo);

        do {
            System.out.println("Introduce tu numero cuenta:  ");
            nomCu = tcl.nextLine();
            erroneo = true;
            try {
                nueva.setCuenta(nomCu);
                for (int i = 0; i < cuentasTotales.size(); i++) {
                    if (cuentasTotales.get(i).getCuenta().equals(nomCu)) {
                        throw new Exception("Esta cuenta ya existe");
                    }
                }
                erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (erroneo);

        do {
            System.out.println("Introduce tu saldo:  ");
            saldo = tcl.nextDouble();
            erroneo = true;
            try {
                nueva.setSaldo(saldo);
                erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (erroneo);

        do {
            System.out.println("Introduce tus intereses:  ");
            intereses = tcl.nextDouble();
            erroneo = true;
            try {
                nueva.setTipoDeInteres(intereses);
                erroneo = false;
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
            }
        } while (erroneo);

        cuentasTotales.add(nueva);

        return posicion;
    }

    public void ModificarCuenta() {
        int posicion = cuentasTotales.indexOf(buscarCuenta());
        Scanner kb = new Scanner(System.in);

        System.out.print("\nIntroduce el nombre de la nueva cuenta: ");
        String nombre = kb.nextLine();
        try {
            cuentasTotales.get(posicion).setNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         System.out.print("Introduce el número de cuenta de la nueva cuenta: ");
        String nCuenta = kb.nextLine();
        try {
            cuentasTotales.get(posicion).setCuenta(nCuenta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nIntroduce el saldo de la nueva cuenta: ");
        double saldo = kb.nextDouble();

        try {
            cuentasTotales.get(posicion).setSaldo(saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\nIntroduce el interes de la nueva cuenta: ");
        double tipoDeInteres = kb.nextDouble();
        try {
            cuentasTotales.get(posicion).setTipoDeInteres(tipoDeInteres);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void AnularCuenta() {
        Scanner tcl = new Scanner (System.in);
        Cuenta aux = new Cuenta();
        boolean bobo =true ;
        aux = buscarCuenta();
        do{
        System.out.println("Estas seguro de que quieres continuar? \n(1) SI (2) NO");
        Byte eleccion = tcl.nextByte();
        if (eleccion == 1){
        if (aux != null){
             cuentasTotales.remove(aux);
             bobo = false;
             System.out.println("Operación completada");
        }
        } else if (eleccion == 2){
            System.out.println("Operación cancelada");
            bobo = false;
        } else{
            System.out.println("El numero introducido es incorrecto");
        }
        }while(bobo);
    }

    
    public void ConsultarCuenta() {
        Cuenta c = new Cuenta();
         c = buscarCuenta();
        if (c != null) {
            System.out.println("\nEl nombre del usuario de la cuenta  es " +c.getNombre());
            System.out.println("El número de la cuenta es " + c.getCuenta());
            System.out.println("El saldo actual de la cuenta es " +c.getSaldo());
            System.out.println("El interés actual de la cuenta es " + c.getTipoDeInteres());
    }
        else{
                System.out.println("Cuenta no encontrada");
                }
    }

    public void verCuenta(Cuenta c1) {
        System.out.println("El nombre del usuario de la cuenta es " + c1.getNombre());
        System.out.println("El número de la cuenta es " + c1.getCuenta());
        System.out.println("El saldo actual de la cuenta es " + c1.getSaldo());
        System.out.println("El interés actual de la cuenta es " + c1.getTipoDeInteres());
    }

    public void VisualizarCuentas() {
        for (int i = 0; i < cuentasTotales.size(); i++) {
            System.out.println("La cuenta en la posición " + i + " tiene la siguiente información");
            System.out.println("El nombre del usuario de la cuenta es " + cuentasTotales.get(i).getNombre());
            System.out.println("El número de la cuenta es " + cuentasTotales.get(i).getCuenta());
            System.out.println("El saldo actual de la cuenta es " + cuentasTotales.get(i).getSaldo());
            System.out.println("El interés actual de la cuenta es " + cuentasTotales.get(i).getTipoDeInteres());
            System.out.println("");
        }
    }

}
