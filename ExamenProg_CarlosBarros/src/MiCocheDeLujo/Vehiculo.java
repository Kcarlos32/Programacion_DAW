/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiCocheDeLujo;

/**
 *
 * @author carcas
 */
public class Vehiculo {
    private String tipoVe;
    private String numBas;
    private int numVeTipo;
    private int numVeAlq;
    
    public Vehiculo(){
    this.tipoVe=null;
    this.numBas=null;
    this.numVeTipo=0;
    this.numVeAlq=0;
}
    
    public Vehiculo (String tipoVe, String numBas, int numVeTipo, int numVeAlq){
    this.tipoVe="Mercedes Clase A";
    this.numBas="2323 KLH";
    this.numVeTipo=6;
    this.numVeAlq=5;
}

    public String getTipoVe() {
        return tipoVe;
    }

    public String getNumBas() {
        return numBas;
    }

    public int getNumVeTipo() {
        return numVeTipo;
    }

    public int getNumVeAlq() {
        return numVeAlq;
    }

    public void setTipoVe(String tipoVe) {
        this.tipoVe = tipoVe;
    }

    public void setNumBas(String numBas) {
        this.numBas = numBas;
    }

    public void setNumVeTipo(int numVeTipo) {
        this.numVeTipo = numVeTipo;
    }

    public void setNumVeAlq(int numVeAlq) {
        this.numVeAlq = numVeAlq;
    }
    
    public boolean alquilar(){
        if (this.numVeTipo == 0){
            return false;
        }else{
            numVeAlq++;
            numVeTipo--;
            return true;
        }
    }
    
    public boolean devolver(){
        if (this.numVeAlq == 0){
            return false;
        }else{
            numVeAlq--;
            numVeTipo++;
            return true;
        }
    }
    
    public void setVehiculo(String tipoVe, String numBas,int numVeAlq, int numVeTipo) {
        this.tipoVe = tipoVe;
        this.numBas = numBas;
        this.numVeAlq = numVeAlq;
        this.numVeTipo = numVeTipo;
    }
    
    public String toString(){
    return  "Del vehiculo "+tipoVe+" con numero de bastidor "+numBas+" quedan "+numVeTipo+". Hay "+numVeAlq+" vehiculos alquilados.";
}
}
