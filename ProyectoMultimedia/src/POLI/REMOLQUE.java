/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POLI;

/**
 *
 * @author carcas
 */
public class REMOLQUE {
    protected int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public REMOLQUE(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "REMOLQUE{" + "peso=" + peso + '}';
    }
}
