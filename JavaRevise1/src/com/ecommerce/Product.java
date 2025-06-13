package com.ecommerce;

public class Product implements ProductOperations{

    // Private fields
    private String id;
    private String name;
    private double price;

    // Constructor - this will be called when its object is intialized
    public Product(String id, String name, double price){
        this.id = id;
        this.name=name;
        this.price=price;
    }

    // Getters - methods to retrieve values
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
    @Override
     public void displayDetails(){
                System.out.println("ID of the product is:" + id);
        System.out.println("Name of the product is:" + name);
        System.out.println("Price of the product is:" + price);
     }

}
