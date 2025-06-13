package com.ecommerce;

public class Clothing extends Product{
    private String size;

    public Clothing (String id, String name, double price, String size){
        // calling the constructor of the super class
        super(id, name, price);
        this.size = size;
    }

    @Override
    public void displayDetails(){
        // calling the same method of the superclass
       super.displayDetails();
        System.out.println("The size of the clothing is:" + size);
    }
}
