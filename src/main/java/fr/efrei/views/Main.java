package fr.efrei.views;

import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.factory.EmployeeFactory;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.RaceRepository;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static RaceRepository repository = RaceRepository.getRepository();

    public static void loadObject(){
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        Race race3 = RaceFactory.createRace("SpaceMan");
        repository.create(race1);
        repository.create(race2);
        repository.create(race3);
    }
    public static void main(String[] args) {

        RaceRepository repository = RaceRepository.getRepository();
        loadObject();
        repository.getAll();
        Name name1 = NameFactory.createName("Matthieu","Freire");
        //System.out.println(name1);
        Name name2 = NameFactory.createName("Emma", "Simone", "Deste");
        //Name error = NameFactory.createName("", null);
        Name name3 = NameFactory.createName("Freire", "STP", "aller");

        for (Name name : Arrays.asList(name1, name2, name3)) {
            System.out.println(1);
            System.out.println(name);
        }

        Employee employee1 = EmployeeFactory.createEmployee("1", name1);
        Employee employee2 = EmployeeFactory.createEmployee("2", name2);

        for (Employee employer :
                Arrays.asList(employee1, employee2)) {
            System.out.println(employer);
        }

    }
}