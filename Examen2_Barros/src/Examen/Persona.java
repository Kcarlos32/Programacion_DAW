/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author carcas
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    
    public Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Persona(){
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

    @Override
    public String toString() {
        return "Persona {" + "nombre: " + nombre + ", direccion: " + direccion + "}\n";
    }
    
}
