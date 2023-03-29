/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author carcas
 */
public class Ficha {
// Atributos

    private String nombre = null;
    private String apellidos = null;
    private int edad = 0;
// Contructores

    public Ficha(String param1, String param2, int param3) {
        nombre = param1;
        apellidos = param2;
        edad = param3;
    }
// Métodos

    public String toString() {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Eddad: " + edad;
    }
}
