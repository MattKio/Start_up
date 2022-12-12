package fr.efrei.repository;

import fr.efrei.domain.Gender;

import java.util.List;

public interface IGenderRepository extends IRepository<Gender, String> {
    List<Gender> getAll();
    Gender getIndex(int i);
}
