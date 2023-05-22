/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BIBLIOTECA;

/**
 *
 * @author carcas
 */
public class libro extends publicacion implements Prestable{
    private boolean prestado;
    public libro (int codigo, String titulo, int anoPub) {
        super(codigo, titulo, anoPub);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
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
        return super.toString()+"Libro {" + " prestado = "+ prestado + "}";
    }
    
    @Override
    public void prestar(){
        
    }
    @Override
    public void devolver(){
        
    }
    @Override
    public boolean prestado(){
        return true;
    }
}
