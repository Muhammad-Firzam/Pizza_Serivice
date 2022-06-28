package oop_oel_practice;
import java.util.*;

public class OOP_OEL_PRACTICE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pizza p1 = new Pizza();
        Topping t1 = new Topping("Cheese",50.0, 200.0);
        Topping t2 = new Topping("Sausages",100, 80);
        Topping t3 = new Topping("Olives",200, 150);
        
        double total=0.0;
        
        System.out.println("\n\t\t-----WELCOME TO SASTA PIZZA SHOP-----");
        System.out.println("Select the size of Pizza: \n 1 for Small \n 2 for Medium \n 3 for Large");
        byte ans = input.nextByte();
        
        switch(ans){
            case 1:
                  p1.setSize("Small");
                  System.out.println("Toppings List: ");
                  t1.setPrice(90);
                  System.out.println(t1.showDetails());
                  t2.setPrice(50);
                  System.out.println(t2.showDetails());
                  t3.setPrice(100);
                  System.out.println(t3.showDetails());   
                  
                  System.out.println("\nSelect which topping u want on your pizza: "
                          + "\n Option 1 \n Option 2 \n Option 3");
                  byte a = input.nextByte();
                  if(a == 1){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t1.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t1.setQuatity(t1.getQuatity()-q);
                          total = q*t1.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t1.toString());
                  }
                  else if(a == 2){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t2.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t2.setQuatity(t2.getQuatity()-q);
                          total = q*t2.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t2.toString());
                  }
                  else if(a == 3){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t3.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t3.setQuatity(t3.getQuatity()-q);
                          total = q*t3.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t3.toString());
                  }
                  else {
                      System.out.println("INVLID ENTRY !!!");
                  }
                  t1.toString();
                  System.out.println("\n THE TOTAL PRICE IS: "+total);
                  break;
                  
            case 2:
                p1.setSize("Medium");
                  System.out.println("Toppings List: ");
                  t1.setPrice(130);
                  System.out.println(t1.showDetails());
                  t2.setPrice(70);
                  System.out.println(t2.showDetails());
                  t3.setPrice(130);
                  System.out.println(t3.showDetails());   
                  
                  System.out.println("\nSelect which topping u want on your pizza: "
                          + "\n Option 1 \n Option 2 \n Option 3");
                  byte an = input.nextByte();
                  if(an == 1){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t1.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t1.setQuatity(t1.getQuatity()-q);
                          total = q*t1.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t1.toString());
                  }
                  else if(an == 2){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t2.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t2.setQuatity(t2.getQuatity()-q);
                          total = q*t2.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t2.toString());
                  }
                  else if(an == 3){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t3.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t3.setQuatity(t3.getQuatity()-q);
                          total = q*t3.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t3.toString());
                  }
                  else {
                      System.out.println("INVLID ENTRY !!!");
                  }
                  System.out.println("\n THE TOTAL PRICE IS: "+total);
                  break;
                  
            case 3:
                p1.setSize("Large");
                  System.out.println("Toppings List: ");
                  System.out.println(t1.showDetails());
                  System.out.println(t2.showDetails());
                  System.out.println(t3.showDetails());   
                  
                  System.out.println("\nSelect which topping u want on your pizza: "
                          + "\n Option 1 \n Option 2 \n Option 3");
                  byte b = input.nextByte();
                  if(b == 1){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t1.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t1.setQuatity(t1.getQuatity()-q);
                          total = q*t1.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t1.toString());
                  }
                  else if(b == 2){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t2.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t2.setQuatity(t2.getQuatity()-q);
                          total = q*t2.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t2.toString());
                  }
                  else if(b == 3){
                      System.out.println("Enter the Quantity: ");
                      int q = input.nextInt();
                      if(q > t3.getQuatity()){
                          System.out.println("QUATITY IS GREATER");
                      }
                      else{
                          t3.setQuatity(t3.getQuatity()-q);
                          total = q*t3.getPrice();
                      }
                      System.out.println("\nSize: "+p1.getSize());
                      System.out.println(t3.toString());
                  }
                  else {
                      System.out.println("INVLID ENTRY !!!");
                  }
                  System.out.println("\n THE TOTAL PRICE IS: "+total);
                  break;
            default:
                break;
        }
        
        System.out.println("_________________________________________________");
        
        
    }
    
}
