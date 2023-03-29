/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class Prueba {
    private int x, y;
    
    public void setCoordenadas (int a, int b){
        x=a;
        y=b;
    }
    public void setCoordenadasX (int a){
        x=a;
    }
    public void setCoordenadasY (int b){
        y=b;
    }
    public int getCoordenadasX(){
        return x;
    }
    public int getCoordenadasY(){
        return y;
    }
    public void imprimirCuadrante() {
        if (x > 0 && y>0)
            System.out.println("Cuadrante 1");
         if (x > 0 && y<0)
            System.out.println("Cuadrante 4");
          if (x < 0 && y>0)
            System.out.println("Cuadrante 2");
           if (x < 0 && y<0)
            System.out.println("Cuadrante 3");
    }
}
