package oop_oel_practice;

public class Topping extends Pizza{
    private String name;
    private double quantity;
    private double perUnitPrice;
    
    Topping(){
        this.name="";
        this.quantity=0;
        this.perUnitPrice=0;
    }
    Topping(String n, double q, double up){
        this.name=n;
        this.quantity=q;
        this.perUnitPrice=up;
    }
    public void setQuatity(double q){
        this.quantity=q;
    }
    public double getQuatity(){
        return this.quantity;
    }
    public void setPrice(double p){
        this.perUnitPrice=p;
    }
    public double getPrice(){
        return this.perUnitPrice;
    }
    
    public String showDetails(){
        return "\nName of Topping: "+this.name+""
                + "\nQuantity: "+this.quantity+"\nPer Unit Price: "+this.perUnitPrice;
    }
    public String toString(){
        return "Name of Topping: "+this.name+""
                + "\nQuantity: "+this.quantity+"\nPer Unit Price: "+this.perUnitPrice;
    }
}
