/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author carcas
 */
public class Practica11a {

    public static void main(String[] args) {
        Archivador a = new Archivador();
        Ficha f = new Ficha("Nombre1", "Apellidos1", 22);
        a.guardar(f);
        a.guardar(new Ficha("Nombre2", "Apellidos2", 12));
        a.guardar(new Ficha("Nombre3", "Apellidos3", 34));
        a.listar();
        a.eliminar(f);
        a.listar();
    }
}
