/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

/**
 *
 * @author carcas
 */
public abstract class Legislador extends Persona implements Comparable {

    protected String provinciaQueRepresenta, partidoPolitico;
    protected int numDespacho;

    public Legislador( String nombre, String apellidos, int edad,String provinciaQueRepresenta, String partidoPolitico, int numDespacho) {
        super(nombre, apellidos, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numDespacho = numDespacho;
    }

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, int numDespacho) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numDespacho = numDespacho;
    }

    public Legislador() {
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Legislador { " + " nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad + " provincia que representa = " + provinciaQueRepresenta + ", partido politico = " + partidoPolitico + ", numero de despacho = " + numDespacho + " }\n";
    }

    public abstract String getCamaraDondeTrabaja();

    @Override
    public int compareTo(Object t) {
        Legislador otroLegi = (Legislador) t;
        return nombre.compareTo(otroLegi.getApellidos());
    }
}
