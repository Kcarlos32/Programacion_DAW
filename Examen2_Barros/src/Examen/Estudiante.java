/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author carcas
 */
public class Estudiante extends Persona{
    protected String escuela;
    protected double grado;
    
    public Estudiante(String nombre, String direccion, String escuela, double grado){
        super (nombre, direccion);
        this.escuela = escuela;
        this.grado= grado;
    }

    public String getEscuela() {
        return escuela;
    }

    public double getGrado() {
        return grado;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Estudiante {" + "nombre: " + nombre + ", direccion: " + direccion + ", escuela: " + escuela + ", grado: " + grado + "}\n";
    }
    
}
