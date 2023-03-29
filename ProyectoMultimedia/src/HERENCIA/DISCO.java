/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author carcas
 */
public class DISCO extends MULTIMEDIA{
    protected String genero;
    
    public DISCO(String titulo, String autor, format formato, String duracion, String genero){
        
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Género: "+ genero +" \n";
    }
    
}
