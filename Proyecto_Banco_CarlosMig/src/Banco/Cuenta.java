/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author carcas
 */
public class Cuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) throws Exception {
        if (tipoDeInteres < 0) {
            throw new Exception("El tipo de interes no puede ser negativo");
        }
        if (nombre.equals("")) {
            throw new Exception("El campo de nombre no puede estar vacio");
        }
        if (cuenta.equals("")) {
            throw new Exception("El campo de cuenta no puede estar vacio");
        }
        if (saldo < 0) {
            throw new Exception("El saldo no puede ser negativo");
        }
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public Cuenta() {
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.equals("")) {
            throw new Exception("El campo de nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) throws Exception {
        if (cuenta.equals("")) {
            throw new Exception("El campo de cuenta no puede estar vacio");
        }
        this.cuenta = cuenta;
    }

    public void setSaldo(double saldo) throws Exception {
        if (saldo < 0) {
            throw new Exception("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public void setTipoDeInteres(double tipoDeInteres) throws Exception {
        if (tipoDeInteres < 0) {
            throw new Exception("El tipo de interes no puede ser negativo");
        }
        this.tipoDeInteres = tipoDeInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void reintegro(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("El saldo es inferior a la cantidad a reintegrar+");
        }
        saldo = saldo - cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta {" + "nombre=" + nombre + ", cuenta=" + cuenta + ", saldo=" + saldo + ", tipoDeInteres=" + tipoDeInteres + '}';
    }

}
