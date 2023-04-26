/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfazserializable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author davher
 */
public class MiAgenda implements Serializable {

    private String nombre;
    private String direccion;
    private ArrayList<String> fono;
    private String email;

    public MiAgenda() {
        nombre = "Pepe";
        direccion = "Calle 1";
        email = "Emailejemplo@email.com";
        fono = null;
    }

    public MiAgenda(String nombre, String direccion, ArrayList<String> fono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fono = fono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getFono() {
        return fono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
