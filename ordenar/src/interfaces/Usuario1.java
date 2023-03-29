/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author carcas
 */
public class Usuario1 implements Comparable {

    private String nombre;
    private int edad;

    Usuario1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }

    public int EdadComparator(Object o) {
        Usuario1 otroUsuario = (Usuario1) o;
        return edad- (otroUsuario.getEdad());
        
    }
    public int NombreComparator(Object e) {
        Usuario1 otroUsuariA = (Usuario1) e;
        return nombre.compareTo(otroUsuariA.getNombre());    
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
