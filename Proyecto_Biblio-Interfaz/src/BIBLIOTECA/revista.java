/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BIBLIOTECA;

/**
 *
 * @author carcas
 */
public class revista extends publicacion{
    private int numero;
    
    public revista(int numero, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return super.toString()+"Revista{" + " numero = " + numero + "}";
    }
    
}
