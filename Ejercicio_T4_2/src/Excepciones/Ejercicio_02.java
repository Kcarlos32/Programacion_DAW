/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author carcas
 */
public class Ejercicio_02 {

    public static int devuelveEntero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception e) {
            return 2;
            //} finally {
            //return 3;
        }
    }

    public static int devuelveEntero2(int num) {
        if (num % 2 == 0) {
            num = 2;
        } else {
            num = 1;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("-----");
        for (int i = 0; i < 10; i++) {
            System.out.println(devuelveEntero(i));
        }
        System.out.println("-----");
        for (int i = 0; i < 10; i++) {
            System.out.println(devuelveEntero2(i));
        }
        System.out.println("-----");
    }
}
