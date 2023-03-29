/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author carcas
 */
public class EstudianteInternacional extends Estudiante {

    private String pais;

    public EstudianteInternacional(String nombre, String direccion, String escuela, double grado, String pais) {
        super(nombre, direccion, escuela, grado);
        this.pais = pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "EstudianteInternacional {" + "nombre: " + nombre + ", direccion: " + direccion + ", escuela: " + escuela + ", grado: " + grado + ", pais: " + pais + "}\n";
    }

}
