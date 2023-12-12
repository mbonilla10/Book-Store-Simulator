/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melvinbonilla
 */
public abstract class Product implements Comparable<Product> {
    
    private String name;
    private String type;
    private double price;
    private int stock;
    
    /**
     * Constructor for Product.
     * @param name
     * @param type
     * @param price
     * @param stock 
     */
    Product(String name, String type, double price, int stock) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }
    
    /**
     * Getter method for product name.
     * @return name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Setter method for product name.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter method for product type.
     * @return type
     */
    public String getType() {
        return this.type;
    }
    
    /**
     * Setter method for product type.
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Getter method for product price.
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
    
    /**
     * Setter method for product price.
     * @param price 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Getter method for product stock.
     * @return stock
     */
    public int getStock() {
        return this.stock;
    }
    
    /**
     * Setter method for product stock.
     * @param stock 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /**
     * Compare method that compares products by price.
     * @param z
     * @return 0, 1, -1
     */
    @Override
    public int compareTo(Product z) {
        
        if(this.getPrice() > z.getPrice()) {
            System.out.println("First Product price: " + this.getPrice());
            System.out.println("Second Product price: " + z.getPrice());
            System.out.println("First Product is more expensive by: $" + (this.getPrice() - z.getPrice()));
            return 1;
        } else if(this.getPrice() < z.getPrice()) {
            System.out.println("First Product price: " + this.getPrice());
            System.out.println("Second Product price: " + z.getPrice());
            System.out.println("First Product is costs less by: $" + (z.getPrice() - this.getPrice()));
            return -1;
        }
        return 0;
    }  
    
}
