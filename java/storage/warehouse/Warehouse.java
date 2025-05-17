package storage.warehouse;

import product.Location;
import product.Product;
import storage.Cell;
import storage.PointManager;
import user.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Warehouse implements PointManager {
    private List<Cell> cells = new ArrayList<>();
    private Employee responsiblePerson;
    private int cellID = 1;
    Location location;
    private boolean isActive;

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void addCells(int count){
        for (int i=0; i<count; i++){
            int id = cellID + 1;
            cells.add(new Cell(id));
        }
    }

    public static void moveTo(Product product, Location location){
        product.setLocation(location);
    }

    public boolean changeResponsiblePerson(Employee  newResponsible){
        this.responsiblePerson = newResponsible;
        return true;
    }

    public boolean purchaseProducts(Product product, int quantity){
        if(product==null || quantity<=0){
            System.out.println("Некорректные данные о закупке.");
            return true;
        }

        Cell suitableCell = null;
        for(Cell cell:cells){
            if(cell.hasSpace() && (cell.isEmpty() || cell.getProducts().get(0).getSupplier() == product.getSupplier())){
                suitableCell = cell;
                break;
            }else {
                System.out.println("Нет подходящей ячейки.");
                return false;
            }
        }

        for (int i = 0; i<quantity; i++){
            suitableCell.addProduct(new Product(product));
        }
        System.out.println("Закуплено " + quantity + "единиц товара " + product.getName() + " в ячейку" + suitableCell.getId());
        return true;


    }


    @Override
    public boolean open() {
        isActive = true;
        System.out.println("Склад открыт.");
        return true;
    }

    @Override
    public boolean close() {
        isActive = false;
        System.out.println("Склад закрыт.");
        return false;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    public void warehouseInfo(){
        System.out.println("Местоположение: " + location + "\n" +
                "Ответственное лицо: " + responsiblePerson + "\n" +
                "Статус: " + isActive);
    }

    public void availableForPurchase(){
        System.out.println();
    }
}
