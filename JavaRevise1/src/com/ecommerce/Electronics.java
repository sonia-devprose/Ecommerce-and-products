package com.ecommerce;

public class Electronics extends Product{

    private String brand;
    public Electronics(String id, String name, double price, String brand){
        super(id, name, price);
        this.brand = brand;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Brand of the electronic product is:" + brand);
    }
}
