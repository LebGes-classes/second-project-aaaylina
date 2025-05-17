package user.employee;

import product.Location;
import storage.sellpoint.SellPoint;

public class Loader extends Employee{
    private SellPoint sellPoint;

    public Loader(String name, String phone, String email, Location location, double salary, String position, int sumHours, SellPoint sellPoint) {
        super(name, phone, email, location, salary, position, sumHours, sellPoint);
    }
}
