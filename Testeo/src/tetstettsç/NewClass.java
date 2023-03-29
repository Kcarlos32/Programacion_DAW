/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetstettsç;

/**
 *
 * @author carcas
 * @version 1.0
 * @param 
 */
public class NewClass {
    public static void main(String[] args) {
        int cont = 0;
        int cont2 = 0;
        int cont3 = 1;
        
        for(int i= 0; i < 10; i++){
            cont = cont2 + cont3;
            cont2 = cont;
            cont3 = cont2 + cont3;
            System.out.println(cont);
        }
    }
}
