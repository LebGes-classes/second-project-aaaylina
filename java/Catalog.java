import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Product> availableProducts = new ArrayList<>();

    public void addProduct(Product product) {
        if (product != null) {
            availableProducts.add(product);
        }
    }

    public boolean removeProduct(Product product) {
        return availableProducts.remove(product);
    }

}
