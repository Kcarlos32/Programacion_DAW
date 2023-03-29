/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class Rectangulo {
    private double ancho, alto;
    
    Rectangulo (double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }
    Rectangulo(double lado){
        this(lado, lado);
    }
    Rectangulo(){
        this(1);
    }
}
