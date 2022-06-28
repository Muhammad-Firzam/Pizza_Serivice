package oop_oel_practice;

public class Pizza {
    private String size;
    
    Pizza(){
        this.size="";
    }
    Pizza(String s){
        this.size=s;
    }
    
    public void setSize(String s){
        this.size=s;
    }
    public String getSize(){
        return this.size;
    }

}
