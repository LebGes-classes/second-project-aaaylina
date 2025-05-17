package storage;

import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cell implements Storage {
    private final int capacity = 10;
    private int id;
    private List<Product> products = new ArrayList<>(capacity);

    public Cell(int id){
        this.id = id;
    }

    @Override
    public boolean removeProduct(Product product){
        return products.remove(product);
    }


    public boolean hasSpace(){
        return products.size()<capacity;
    }

    public boolean isEmpty(){
        return products.isEmpty();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean addProduct(Product product){
        return products.add(product);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
