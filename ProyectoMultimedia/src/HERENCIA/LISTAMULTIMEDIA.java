/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author carcas
 */
public class LISTAMULTIMEDIA {
    private MULTIMEDIA[] lista;
    private int total = 0;
    
    public LISTAMULTIMEDIA(int x){
        lista = new MULTIMEDIA[x];
    }
    
    public int size(){
        return total;
    }
    
    public boolean add (MULTIMEDIA x){
        if (total < lista.length){
            lista[total] = x;
            total++;
            return true;
        } else {
            return false;
        }
    }
    
    public MULTIMEDIA get (int posicion){
        return lista[posicion];
    }
    
    public int indexOf (MULTIMEDIA m){
        for (int i =0 ;i < total; i++){
            if (lista[i].equals(m)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString(){
        String resultado="";
        
        for(int i=0 ;i <this.size(); i++){
            resultado = resultado +"\nMultimedia ["+1+"]: \n"+this.get(i).toString()+"\n";
        }
        return resultado;
    }    
}
