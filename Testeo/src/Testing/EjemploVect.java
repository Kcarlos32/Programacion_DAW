/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

/**
 *
 * @author carcas
 */
public class EjemploVect {
    public static void main(String[] args) {
        int [] num = new int [1000];
        int max = Integer.MIN_VALUE;
        
        for (int i =0 ; i < num.length; i++){
            
            num[i] =(int) (Math.random()*-1000-1);
        }
        
        for (int dato:num){
            System.out.println(" "+dato);
        }
        
        for (int i = 0; i<num.length; i++){
            if(num[i] > max)
                max = num[i];
        }
            System.out.println("El maximo es: "+max);
    }
}
