/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialize;

/**
 *
 * @author carcas
 */
import java.io.Serializable;
import java.util.ArrayList;

public class miAgenda implements Serializable {

    private String nombre;
    private String direccion;
    private ArrayList<String> fono;
    private String email;

    public miAgenda() {
        nombre = "Antonio Perez";
        direccion = "c/ Logroño von Laus 123";
        email = "ejemplo@email.com";
        fono = null;
     }

    public miAgenda(String nombre, String direccion, ArrayList<String> fono, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fono = fono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getFono() {
        return fono;
    }

    public void setFono(ArrayList<String> fono) {
        this.fono = fono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Mi agenda { " + "Nombre = " + nombre + ", direccion = " + direccion + ", fono = " + fono + ", email = " + email + '}';
    }
    
}
