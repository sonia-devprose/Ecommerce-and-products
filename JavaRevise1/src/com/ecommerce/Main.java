package com.ecommerce;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
                public static void main(String[] args) {
                    //System.out.println("Hello's \"World\"");
                    // Create some products
                    // DataType[] arrayname
                    Product[] products = {

                            new Electronics("E101", "Headset", 234.45, "Sony"), new Clothing("C111", "Suit", 20.45, "M"), new Electronics("E121", "Earpods", 94.45, "Apple"), new Clothing("C001", "Shirt", 14.45, "XL")
                    };
                    // Simple for loop to display all products
                    System.out.println("=== All products ===");
                    for (int i = 0; i < products.length; i++) {
                        products[i].displayDetails();
                        System.out.println("--------------");
                    }

                    // Simple switch statement for menu
                    System.out.println("----Searching--------");
                    String searchId = "E101";
                    switch (searchId.charAt(0)) {
                        case 'E':
                            System.out.println("Searching for electronic product");
                            break;
                        case 'C':
                            System.out.println("Searching for clothing product");
                            break;

                        default:
                            System.out.println("Unknown product type");
                    }
                    // find and display the product with matching id
                    boolean found = false;
                    for (Product p : products) {
                        // For each 'Product' object 'p' in the 'products' array
                        if (p.getId().equals(searchId)) {
                            System.out.println("Product found");
                            p.displayDetails();
                            found = true;
                            break;
                        }

                    }
                    if (!found) {
                        System.out.println("Product not found");
                    }

                    // simple discount calculation based on product type
                    for (Product p : products) {
                        double discount = 0;
                        String type = "";

                        if (p instanceof Electronics) {
                            discount = p.getPrice() * 0.1;
                            type = "Electronics";
                        } else if (p instanceof Clothing) {
                            discount = p.getPrice() * 0.05;
                            type = "Clothing";
                        }
                        System.out.println("The discount for the product is: " + discount + " and the type of product is: " + type);

                    }
                }

                }

