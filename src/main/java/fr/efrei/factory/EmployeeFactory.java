package fr.efrei.factory;

import fr.efrei.domain.*;
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

    public static Employee createEmployee(Name name, Demographic_info demographicInfo, Identity_Type identityType,
                                          Poste poste, Emploie emploie, Contact_Details contactDetails, AddressDetails addressDetails){
        String empNumberId = Helper.generateID();

        if (Helper.isNullOrEmptyName(name) &&
                Helper.isNullOrEmptyDemo(demographicInfo) &&
                Helper.isNullOrEmptyIdentityType(identityType) &&
                Helper.isNullOrEmptyPoste(poste) &&
                Helper.isNullOrEmptyEmploie(emploie) &&
                Helper.isNullOrEmptyContactDetails(contactDetails) &&
                Helper.isNullOrEmptyAddressDetails(addressDetails))
        {
            return null;
        }

        return new Employee.Builder().
                setEmpNumber(empNumberId).
                setName(name).
                setDemographicInfo(demographicInfo).
                setIdentityType(identityType).
                setContactDetails(contactDetails).
                setEmploie(emploie).
                setPoste(poste).
                setAddressDetails(addressDetails).
                build();
    }

}
