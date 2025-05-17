package product;

import product.Supplier;

import java.util.ArrayList;
import java.util.HashMap;

public class Product {
    private int id;
    private String name;
    private double price;
    Location location;
    private Supplier supplier;

    public Product(){
    }

    public Product(int id, String name, double price, Location location, Supplier supplier){
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.supplier = supplier;
    }

    //конструктор копирования
    public Product(Product other) {
        this.id = other.id;
        this.name = other.name;
        this.price = other.price;
        this.location = other.location;
        this.supplier = other.supplier;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void productInfo(){
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", location=" + location +
                ", supplier=" + supplier +
                '}';
    }
}
