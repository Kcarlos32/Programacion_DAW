package COCHE;


import COCHE.Coche;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class Ejecuta_Coche {
    public static void main(String[] args) {
        Coche deportivo = new Coche();
        Coche todoterreno = new Coche();
        Coche mini = new Coche();
        Coche utilitario = new Coche();
        
        deportivo.setModelo("Citroen Xsara");
        deportivo.setColor("Azul");
        deportivo.setMetalizado(true);
        deportivo.setMatricula("V-7548 GV");
        deportivo.setTipo("Familiar");
        deportivo.setAñoFabricacion(1995);
        deportivo.setSeguro("Terceros");
        
        

        todoterreno.setCoche("Renault Megane", "Gris", false,  "1548-GVZ","Familiar",  2010, "A todo riesgo");
        utilitario.setCoche("BMW X7", "Negro",  true, "4875-HJM","Deportivo", 2012, "A todo riesgo");
        //Mostrar  color deportivo
        //System.out.println("Color deportivo: " + deportivo.getColor());
        //Mostrar tipo coche
        //System.out.println("Tipo coche todoterreno: " + todoterreno.getTipoCoche());
        deportivo.imprimeCoche();
        todoterreno.imprimeCoche();
        utilitario.imprimeCoche();
        mini.imprimeCoche();
    }
}
