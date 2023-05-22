/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

/**
 *
 * @author carcas
 */
public abstract class electronica extends producto{
    protected String fabricante;

    public electronica(String fabricante, double precioNormal) {
        super(precioNormal);
        this.fabricante = fabricante;
    }

    public electronica() {
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        return "Electronica { " + "Fabricante = " + fabricante + ", Precio normal = " + precioNormal + " } ";
    }
    
    
}
