package MiTienda;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carcas
 */
public class AnoPubliComparator implements Comparator{

    @Override
    public int compare(Object t1, Object t2) {
        libro l1 = (libro) t1;
        libro l2 = (libro) t2;
        return l1.getAnoPubli() - l2.getAnoPubli();
    }
    
    @Override
    public boolean equals(Object o){
        return this == o;
    }
    
}
