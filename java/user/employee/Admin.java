package user.employee;

import product.Location;
import storage.sellpoint.SellPoint;

public class Admin extends Employee{


    public Admin(String name, String phone, String email, Location location, double salary, String position, int sumHours, SellPoint sellPoint) {
        super(name, phone, email, location, salary, position, sumHours, sellPoint);
    }

    public void controleWork(){
        System.out.println("Админиситратор " + getName() + " контролирует работу.");
    }


}
