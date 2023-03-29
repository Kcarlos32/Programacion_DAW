/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HERENCIA;

/**
 *
 * @author carcas
 */
public class MULTIMEDIA {
    
    
    protected String titulo, autor, duracion;
    protected format formato;
    
    public MULTIMEDIA(String titulo, String autor, format formato, String duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public format getFormato() {
        return formato;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "MULTIMEDIA{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", formato=" + formato + '}';
    }
    
    public boolean equals(MULTIMEDIA m){
        boolean igual = false;
        
        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && m.getAutor().equalsIgnoreCase(this.getAutor())){
            igual = true;
        } else{
            igual = false;
        }
        return igual;
    }
}
