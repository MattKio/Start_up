package fr.efrei.views;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Employee;
import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.factory.Demographic_infoFactory;
import fr.efrei.factory.EmployeeFactory;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.RaceRepository;
import java.util.Arrays;


public class Main {

    public static RaceRepository repository = RaceRepository.getRepository();

    public static void loadObject(){
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        Race race3 = RaceFactory.createRace("SpaceMan");
        repository.create(race1);
        repository.create(race2);
        repository.create(race3);

        for (Race r :
                Arrays.asList(race1, race2, race3)) {
            System.out.println(r);
        }
    }
    public static void main(String[] args) {

        //RaceRepository repository = RaceRepository.getRepository();
        //loadObject();
        //repository.getAll();
        Name name1 = NameFactory.createName("Matthieu","Freire");
        Name name2 = NameFactory.createName("Nassim", "Abbou");
        Name name3 = NameFactory.createName("Jules", "Roger", "Logerot");
        //Name error = NameFactory.createName("", null);

        /*for (Name name : Arrays.asList(name1, name2, name3)) {
            System.out.println(name);
        }*/
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        Race race3 = RaceFactory.createRace("SpaceMan");

        Demographic_info demographicInfo = Demographic_infoFactory.createDemo_info(race1, "male");

        Employee employee1 = EmployeeFactory.createEmployee(name1);
        Employee employee2 = EmployeeFactory.createEmployee(name2);
        Employee employee3 = EmployeeFactory.createEmployee(name3, demographicInfo);

        for (Employee e : Arrays.asList(employee1, employee2, employee3)) {
            System.out.println(e);

        }


    }
}