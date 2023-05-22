/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BIBLIOTECA;

import java.util.ArrayList;

/**
 *
 * @author carcas
 */
public class publicacion {
    protected int codigo;
    protected String titulo;
    protected int anoPub;
    ArrayList<publicacion> listaPub;

    public publicacion(int codigo, String titulo, int anoPub){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPub = anoPub;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    @Override
    public String toString() {
        return "Publicación {" + " Codigo = " + codigo + ", titulo = " + titulo + " , año de publicación = " + anoPub +" }\n";
    }
    
    
}
