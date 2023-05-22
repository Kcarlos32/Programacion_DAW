/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTienda;

import java.util.Comparator;

/**
 *
 * @author carcas
 */
public class EditorMayComparator implements Comparator{

    @Override
    public int compare(Object t1, Object t2) {
        libro l1 = (libro) t1;
        libro l2 = (libro) t2;
        return l1.getEditor().compareToIgnoreCase(l2.getEditor());
    }
    @Override
    public boolean equals(Object o){
        return this == o;
    }
}
