/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;



/**
 *
 * @author carcas
 */
public class Diputado extends Legislador {
    private int asientoCamaraBaja;

    public Diputado(String nombre, String apellidos, int edad, String provinciaQueRepresenta, String partidoPolitico, int numDespacho, int asientoCamaraBaja) {
        super(nombre, apellidos, edad, provinciaQueRepresenta, partidoPolitico, numDespacho);
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    public Diputado(int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    public Diputado() {
    }

    public int getAsientoCamaraBaja() {
        return asientoCamaraBaja;
    }

    public void setAsientoCamaraBaja(int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    @Override
    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    @Override
    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    @Override
    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    @Override
    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public int getNumDespacho() {
        return numDespacho;
    }

    @Override
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
        return "Diputado { " + " nombre = " + nombre + ", apellidos = " + apellidos + ", edad = " + edad + " provincia que representa = " + provinciaQueRepresenta + ", partido politico = " + partidoPolitico + ", numero de despacho = " + numDespacho + " asiento de camara baja = " + asientoCamaraBaja + " }\n";
    }

    @Override
    public String getCamaraDondeTrabaja() {
        return "Diputado";
    }
}
