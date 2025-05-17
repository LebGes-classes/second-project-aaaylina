package user;

import product.Location;
import product.Product;

import storage.sellpoint.SellPoint;

public class Client extends Person {

    public Client(String name, String phone, String email, Location location) {
        super(name, phone, email, location);
    }

    public boolean buy(Product product, SellPoint sellPoint, int quantity){
        if (!sellPoint.hasProduct(product, quantity)){
            System.out.println("Недостаточно товара на складе.");
            return false;
        }

        for(int i = 0; i<quantity; i++){
            if(!sellPoint.sellProduct(product)){
                System.out.println("Ошибка при покупке товара " + product.getName());
                return false;
            }
        }

        System.out.println("Покупка совершена: " + quantity + " x " + product.getName());
        return true;
    }

}
