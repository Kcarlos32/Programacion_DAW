/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author carcas
 */
public class Archivador {
// Atributos

    private ArrayList pacientes = new ArrayList();
// Métodos

    public void guardar(Ficha param) {
        pacientes.add(param);
    }

    public void eliminar(Ficha param) {
        pacientes.remove(param);
    }

    public void listar() {
        System.out.println("Número de fichas: " + pacientes.size());
        Iterator it = pacientes.iterator();
        while (it.hasNext()) {
            System.out.println((Ficha) it.next());
        }
    }
}
