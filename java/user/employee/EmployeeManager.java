package user.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList = new ArrayList<>();

    public boolean addEmployee(Employee employee){
        return employeeList.add(employee);
    }

    public boolean deleteEmployee(Employee employee){
        return employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
