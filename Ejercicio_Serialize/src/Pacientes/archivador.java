/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacientes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author carcas
 */
public class archivador implements Serializable {

    private ArrayList<ficha> pacientes = new ArrayList();

    public void guardar(ficha param) {
        pacientes.add(param);
    }

    public void eliminar(ficha param) {
        pacientes.remove(param);
    }

    public void eliminar(String param) {
        int i;
        for (i = 0; i < pacientes.size(); i++) {
            if (param.equalsIgnoreCase(pacientes.get(i).getNombre()));
            break;
        }
        pacientes.remove(i);
    }

    public void listar() {
        System.out.println("Número de fichas: " + pacientes.size());

        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println(pacientes.get(i));
        }
    }

}
