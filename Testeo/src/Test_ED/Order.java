/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_ED;

import java.util.List;

/**
 *
 * @author carcas
 */
public class Order {
  
  private String customerName;
  private List<String> items;
  private double totalPrice;
  
  public Order(String customerName, List<String> items, double totalPrice) {
    this.customerName = customerName;
    this.items = items;
    this.totalPrice = totalPrice;
  }
  
  public void printOrder() {
    System.out.println("Customer: " + customerName);
    System.out.println("Items: ");
    for (String item : items) {
      System.out.println("- " + item);
    }
    System.out.println("Total Price: " + totalPrice);
  }
  
  public double calculateTax() {
    double taxRate = 0.1;
    double tax = totalPrice * taxRate;
    return tax;
  }
  
}

