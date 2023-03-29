/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLI;

/**
 *
 * @author carcas
 */
public class poliCOCHECAMION {
    protected String matricula;
    protected int velocidad;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public poliCOCHECAMION() {
    }

    public poliCOCHECAMION(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    @Override
    public String toString() {
        return "polimorfismoCOCHECAMION{" + "matricula='" + matricula + '\'' + ", velocidad=" + velocidad + '}';
    }
}
