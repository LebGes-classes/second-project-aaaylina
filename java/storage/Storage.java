package storage;

import product.Product;

import java.util.List;

public interface Storage {
    boolean addProduct(Product product);
    boolean removeProduct(Product product);
    List<Product> getProducts();
}
