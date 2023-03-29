package COCHE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class Coche {
    private String modelo = "x";
    private String color= "azul";
    private boolean metalizado = true;
    private String matricula= "2374 - DAW";
    private String tipo =" Deportivo";
    private int añoFabricacion = 260803;
    private String seguro = "Todo riesgo";

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
    public void setCoche(String modelo, String color,  boolean metalizado, String matricula, String tipo, int añoFabricacion , String seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipo = tipo;
        this.añoFabricacion = añoFabricacion;
        this.seguro = seguro;
    }
    // Fin Setter
///////////////////////////////////////////////
    // Start Setter
    
    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
   
    public boolean esMetalizado() {
        return metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public String getSeguro() {
        return seguro;
    }
    
    public void imprimeCoche()
    {
         System.out.println("-----------------------------------------------------------------------");
        System.out.println("|Modelo: "+modelo);
         System.out.println("-----------------------------------------------------------------------");
        System.out.println("|Color: "+color);
        if (metalizado){
        System.out.println("|Es metalizado");
        } else {
            System.out.println("|No es metalizado");
        }
        System.out.println("|Matricula: "+matricula);
        System.out.println("|Tipo de coche: "+tipo);
        System.out.println("|Año de fabricación: "+añoFabricacion);
        System.out.println("|Tipo de seguro: "+seguro);
        System.out.println("-----------------------------------------------------------------------\n");
    }

    
    
}
