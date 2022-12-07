package fr.efrei.repository;

import fr.efrei.domain.Name;

import java.util.List;

public interface INameRepository extends IRepository<Name, String> {

    public List<Name> getAll();
    public Name getIndex(int i);

}
