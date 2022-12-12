package fr.efrei.views;

import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
import fr.efrei.factory.NameFactory;
import fr.efrei.factory.RaceFactory;
import fr.efrei.notuse.NameRepository;
import fr.efrei.repository.RaceRepository;


public class Main {

    public static String male = "♂";
    public static String female = "♀";
    public static RaceRepository raceRepository = RaceRepository.getRepository();
    public static NameRepository nameRepository = NameRepository.getRepository();

    public static void loadObjectRace(){
        Race race1 = RaceFactory.createRace("Indian");
        Race race2 = RaceFactory.createRace("White");
        Race race3 = RaceFactory.createRace("SpaceMan");
        raceRepository.create(race1);
        raceRepository.create(race2);
        raceRepository.create(race3);
    }

    public static void loadObjectName(){
        Name name1 = NameFactory.createName("Matthieu","Freire");
        Name name2 = NameFactory.createName("Nassim", "Abbou");
        Name name3 = NameFactory.createName("Jules", "Roger", "Logerot");
        nameRepository.create(name1);
        nameRepository.create(name2);
        nameRepository.create(name3);
    }


    public static void main(String[] args) {

        Menu.menu();


        /*loadObjectRace();
        loadObjectName();

        Demographic_info demographicInfo1 = Demographic_infoFactory.createDemo_info(raceRepository.getIndex(0), male);
        Demographic_info demographicInfo2 = Demographic_infoFactory.createDemo_info(raceRepository.getIndex(1), female);

        Employee employee1 = EmployeeFactory.createEmployee(nameRepository.getIndex(0), demographicInfo1);
        Employee employee2 = EmployeeFactory.createEmployee(nameRepository.getIndex(1), demographicInfo2);

        System.out.println(employee1);
        System.out.println(employee2);*/

        /*for (Name name : Arrays.asList(name1, name2, name3)) {
            System.out.println(name);
        }*/



    }
}