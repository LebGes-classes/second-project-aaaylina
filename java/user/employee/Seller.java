package user.employee;

import product.Location;
import product.Product;
import storage.sellpoint.SellPoint;

public class Seller extends Employee {
    private SellPoint sellPoint;


    public Seller(String name, String phone, String email, Location location, double salary, String position, int sumHours, SellPoint sellPoint) {
        super(name, phone, email, location, salary, position, sumHours, sellPoint);
        sellPoint.addEmployee(this);
    }

    public void sell(Product product){
        sellPoint.sellProduct(product);
    }
}
