/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

import java.io.Serializable;

/**
 *
 * @author carcas
 */
public abstract class producto implements Serializable{
    protected double precioNormal;
    
    public producto (double precioNormal){
        this.precioNormal = precioNormal;
    }
    public producto (){
    }
    
    public abstract double CalcularPrecioVenta();

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        return "Producto { " + "Precio normal = " + precioNormal + " } ";
    }
    
}
