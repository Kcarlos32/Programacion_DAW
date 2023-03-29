/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author carcas
 */
public class Usuario {

    private String nombre;
    private int edad;

    Usuario(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
