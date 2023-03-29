/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author carcas
 */
public class Profesor extends Persona{
    private String asignatura;
    
    public Profesor(String nombre, String direccion, String asignatura){
        super(nombre, direccion);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Profesor {" + "nombre: " + nombre + ", direccion: " + direccion + ", asignatura: " + asignatura + "}\n";
    }
    
}
