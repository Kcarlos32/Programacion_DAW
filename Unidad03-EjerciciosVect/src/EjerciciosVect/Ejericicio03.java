/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosVect;

/**
 *
 * @author Kcarl
 */
public class Ejericicio03 {
    
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce los valores del array: ");
            num[i] = tcl.nextInt();
        }
        for (int j = 0; j < num.length; j = j + 4) {
            System.out.print(num[j] + " ");
        }
    }
}
