package fr.efrei.repository;

import fr.efrei.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static EmployeeRepository employeeRepository = null;
    private List<Employee> employeesDB = null;

    private EmployeeRepository(){
        employeesDB = new ArrayList<>();
    }

    public static EmployeeRepository getEmployeeRepository() {
        if (employeeRepository == null)
        {
            return new EmployeeRepository();
        }

        return employeeRepository;
    }


    @Override
    public Employee create(Employee employee) {
        boolean success = employeesDB.add(employee);
        if (success)
        {
            return employee;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Employee read(String s) {
        for (Employee e : employeesDB) {
            if (e.getEmpNumber().equals(s))
            {
                return e;
            }
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {

        Employee oldEmployee = read(employee.getEmpNumber());

        if (employee != null)
        {
            employeesDB.remove(oldEmployee);
            employeesDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Employee employeeToDelete = read(s);
        if (employeeToDelete == null)
        {
            return false;
        }

        employeesDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public List<Employee> getAll() {
        return employeesDB;
    }
}
