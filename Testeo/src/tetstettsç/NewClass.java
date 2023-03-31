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
    public static int Metodo (int x , int y){
        if (x <= 0 || y<=0) {
            System.out.println("No deben ser negativos");
            return -1;
        }
        if (x == 1 || y ==1){
            return 1;
        }
        while(x != y){
            if (x > y) {
                x = x -y;
            } else {
                y = y- x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        
        int x, y;
        x = 4;
        y = 8;
        System.out.println(Metodo(x,y));
    }
}
