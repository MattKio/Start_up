package fr.efrei.factory;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.util.Helper;

public class EmployeeFactory {
    public static Employee createEmployee(Name name) {
        String empNumberId = Helper.generateID();

        if (Helper.isNullOrEmptyName(name))
        {
            return null;
        }

        return new Employee.Builder().setEmpNumber(empNumberId).setName(name).build();
    }

    public static Employee createEmployee(Name name, Demographic_info demographicInfo){
        String empNumberId = Helper.generateID();

        if (Helper.isNullOrEmptyName(name) && Helper.isNullOrEmptyDemo(demographicInfo))
        {
            return null;
        }

        return new Employee.Builder().setEmpNumber(empNumberId).setName(name).setDemographicInfo(demographicInfo).build();
    }
}
