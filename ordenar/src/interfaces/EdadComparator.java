/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Comparator;

/**
 *
 * @author carcas
 */
public class EdadComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Usuario u1 = (Usuario) o1;
        Usuario u2 = (Usuario) o2;
        return u1.getEdad() - u2.getEdad();
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }
}