package fr.efrei.repository;

import fr.efrei.domain.Race;

import java.util.List;


public interface IRaceRepository extends IRepository<Race, String> {

    List<Race> getAll();
    Race getIndex(int i);

}
