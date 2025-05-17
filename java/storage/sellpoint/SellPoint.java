package storage.sellpoint;

import product.Location;
import product.Product;
import storage.Cell;
import storage.PointManager;
import user.employee.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellPoint implements PointManager {
    private double companyBalance;
    private Location location;
    private Map<Product, Cell> productMap = new HashMap<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Product> returnedProducts = new ArrayList<>();
    private boolean isActive;

    public SellPoint(double initialBalance, Location location){
        this.companyBalance = initialBalance;
        this.location = location;
    }

    public boolean addProduct(Product product, Cell cell){
        productMap.put(product, cell);
        return true;
    }

    public boolean sellProduct(Product product){
        if(product==null){
            return false;
        }
        Cell cell = productMap.get(product);
        cell.removeProduct(product);
        companyBalance += product.getPrice();
        productMap.remove(product);
        return true;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public boolean returnProduct(Product product, Cell cell){
        if(product==null || cell==null){
            System.out.println("Товар или ячейка не указаны");
            return false;
        }
        companyBalance -= product.getPrice();
        returnedProducts.add(product);
        return true;
    }


    @Override
    public boolean open() {
        isActive = true;
        System.out.println("Точка продаж открыта.");
        return true;
    }

    @Override
    public boolean close() {
        isActive = false;
        System.out.println("Точка продаж закрыта.");
        return true;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    public void sellPointInfo(){
        System.out.println("Местоположение: " + location + "\n" +
                "Статус: " + isActive + "\n" +
                "Количество работников: " + employees.size() + "\n" +
                "Количество товаров: " + productMap.size());
    }

    public  boolean hasProduct(Product product, int quantity){
        if(!productMap.containsKey(product)){
            return false;
        }
        Cell cell = productMap.get(product);
        return cell.getProducts().size() >= quantity;

    }


    public Location getLocation() {
        return location;
    }
}
