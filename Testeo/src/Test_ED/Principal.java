/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_ED;

/**
 *
 * @author carcas
 */
class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }
    
}

// Clase Curso

class Curso {

    String nombre;
    int capacidad;
    Estudiante[] estudiantes;

    Curso(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = new Estudiante[capacidad];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    boolean agregarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < capacidad; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = estudiante;
                return true;
            }
        }
        return false;
    }

    void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: " + estudiante.getEdad() + ", Promedio: " + estudiante.getPromedio());
            }
        }
    }
}

// Clase principal
public class Principal {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Juan", 20, 8.5);
        Estudiante est2 = new Estudiante("Maria", 22, 9.2);
        Estudiante est3 = new Estudiante("Carlos", 19, 7.8);
        Curso curso = new Curso("Programación en Java", 3);
        curso.agregarEstudiante(est1);
        curso.agregarEstudiante(est2);
        curso.agregarEstudiante(est3);
        curso.mostrarEstudiantes();
    }
}
