/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_ED;

/**
 *
 * @author carcas
 */
public class Calculator {
  
  public int add(int x, int y) {
    int result = x + y;
    return result;
  }
  
  public int subtract(int x, int y) {
    int result = x - y;
    return result;
  }
  
  public int multiply(int x, int y) {
    int result = x * y;
    return result;
  }
  
  public int divide(int x, int y) {
    int result = x / y;
    return result;
  }
    public static void main(String[] args) {
        int x = 6;
        int y= 8;
        int res;
        
        res = x + y;
        System.out.println(res);
    }
}
