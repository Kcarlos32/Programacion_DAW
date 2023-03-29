/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author carcas
 */
public class Entrenamiento {

    public static void main(String[] args) {
        Corredor c1 = new Corredor(50);
        for (int i = 0; i < 3; i++) {
            try {
                for (int j = 0; j <= (c1.getEnergia() / 10) + 1; j++) {
                    c1.correr();
                }
            } catch (AgotadoException e) {
                if (i == 1) {
                    c1.recargarEnergia(30);
                } 
                else if (i == 2) {
                    c1.recargarEnergia(10);
                }
            }
        }
    }
}