/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLI;

/**
 *
 * @author carcas
 */
public class COCHE extends poliCOCHECAMION {
    private String matricula;
    protected double velocidad;
    protected int numPuertas;

    public COCHE(int numPuertas, String matricula) {
        super(matricula);
        this.numPuertas = numPuertas;
    }

    public String getMatricula() {
        return matricula;
    }


    public int getVelocidad() {
        return (int) velocidad;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void devolverPuertas(COCHE COCHE) {
        System.out.println("El coche tiene un total de " + COCHE.getNumPuertas() + " puertas.");
    }

}
