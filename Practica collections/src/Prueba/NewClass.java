/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author carcas
 */
import java.util.ArrayList;
  
class GFG {
    public static void main(String[] args)
    {
  
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
  
        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
  
        // use contains() to check if the element
        // 2 exits or not
        boolean ans = arr.contains(2);
  
        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");
  
        // use contains() to check if the element
        // 5 exits or not
        ans = arr.contains(5);
  
        if (ans)
            System.out.println("The list contains 5");
        else
            System.out.println("The list does not contains 5");
    }
}
