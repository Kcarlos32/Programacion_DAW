/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
class Ficha {
    private int casilla;
   
    Ficha(){
        casilla =0;
    }
    
    public void avanzar(int  n){
        casilla += n;
    }
    
    public int casillaActual(){
        return casilla;
    }
}
