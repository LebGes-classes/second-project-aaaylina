package user.employee;

import product.Location;
import storage.sellpoint.SellPoint;
import user.Person;

import java.sql.SQLOutput;
import java.util.List;


public class Employee extends Person {
    private double salary;
    private int hours;
    private int sumHours;
    private String position;
    private SellPoint sellPoint;



    public Employee(String name, String phone, String email, Location location, double  salary, String position, int sumHours, SellPoint sellPoint) {
        super(name, phone, email, location);
        this.salary = salary;
        this.position = position;
        this.sumHours = sumHours;
        this.hours = 0;
        this.sellPoint = sellPoint;
    }

    public void work(int hours){
        this.hours += hours;
        System.out.println(position + " отработал " + hours + " часов.");
    }

    public void recieveSalary(){
        if(hours >= sumHours){
            System.out.println(position + " получил зарплату: " + salary);
        } else{
            System.out.println("недостаточное количесвто отработанных часов :(");
        }
    }

    public void getSickLeave(int days){
        System.out.println(position + " получил больничный на " + days + "дней.");
    }

    
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }



}
