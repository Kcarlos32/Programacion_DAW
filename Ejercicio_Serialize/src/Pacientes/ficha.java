/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacientes;

import java.io.Serializable;

/**
 *
 * @author carcas
 */
public class ficha implements Serializable {

    private String nombre = null;
    private String apellidos = null;
    private int edad = 0;

    public ficha(String param1, String param2, int param3) {
        nombre = param1;
        apellidos = param2;
        edad = param3;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
    }
}
