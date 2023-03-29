/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiCocheDeLujo;

/**
 *
 * @author carcas
 */
public class Conductor {
    private String nombre;
    private String apellidos;
    private String vehiculoAlq;
    
    public Conductor(String nombre, String apelidos, String vehiculoAlq){
        this.nombre = "Antonio";
        this.apellidos = "Billuela Joseba";
        this.vehiculoAlq = "Audi A9";
    }
    
    public Conductor(){
        this.nombre = null;
        this.apellidos = null;
        this.vehiculoAlq = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getVehiculoAlq() {
        return vehiculoAlq;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setVehiculoAlq(String vehiculoAlq) {
        this.vehiculoAlq = vehiculoAlq;
    }
    public void setConductor(String nombre, String apellidos,String VeAlq){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.vehiculoAlq = VeAlq;
    }
    
    public String toString(){
    return  "El conductor "+nombre+" "+apellidos+" va a alquilar el coche "+vehiculoAlq;
}

} 

