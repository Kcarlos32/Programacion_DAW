/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

/**
 *
 * @author carcas
 */
public class TV extends electronica{
    private double tamano;

    public TV (double tamano, String fabricante, double precioNormal) {
        super(fabricante, precioNormal);
        this.tamano = tamano;
    }

    public TV (double tamano) {
        this.tamano = tamano;
    }

    @Override
    public double CalcularPrecioVenta() {
        return precioNormal * 1.08;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public double getPrecioNormal() {
        return precioNormal;
    }

    @Override
    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        return "Television { " + " Tamaño = " + tamano + ", Fabricante = " + fabricante + ", Precio normal = " + precioNormal + " }\n";
    }
    
    
}
