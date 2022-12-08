package fr.efrei.views;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.factory.Demographic_infoFactory;
import fr.efrei.factory.EmployeeFactory;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.NameRepository;
import fr.efrei.repository.RaceRepository;
import java.util.Arrays;


public class Main {

    public static String male = "♂";
    public static String female = "♀";


    public static void main(String[] args) {
        Menu.loadObject();
    }
}