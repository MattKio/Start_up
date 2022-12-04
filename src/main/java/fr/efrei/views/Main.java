package fr.efrei.views;

import fr.efrei.domain.Name;
import fr.efrei.domain.Race;
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
    }
    public static void main(String[] args) {

        RaceRepository repository = RaceRepository.getRepository();
        loadObject();
        repository.getAll();
        Name name1 = NameFactory.createName("Matthieu","Freire");
        Name name2 = NameFactory.createName("Emma", "Simone", "Deste");
        Name error = NameFactory.createName("", null);

        for (Name name : Arrays.asList(name1, name2, error)) {
            System.out.println(name);
        }
    }
}