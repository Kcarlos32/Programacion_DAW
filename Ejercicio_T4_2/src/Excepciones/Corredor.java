/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author carcas
 */
class AgotadoException extends RuntimeException {

    public AgotadoException(String msg) {
        super(msg);
    }
}

public class Corredor {
    private int energia;

    public Corredor(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int energiaSumada) {
        this.energia += energiaSumada;
    }

    public int getEnergia() {
        return energia;
    }

    public void correr() throws AgotadoException {
        System.out.println("Energia inicial: " + this.energia);
        if (this.energia >= 10) {
            this.energia -= 10;
        } else {
            throw new AgotadoException("Tienes la energia por debajo de 10");
        }
        System.out.println("Tu energia actual: " + this.energia + "\n");
    }
}

