package fr.efrei.factory;

import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(String empNumber, Name name) {
        String empNumberId = Helper.generateID();

        if (Helper.isNullOrEmpty(empNumber) || Helper.isNullOrEmptyName(name))
        {
            return null;
        }

        return new Employee.Builder().setEmpNumber(empNumberId).setName(name).build();
    }
}
