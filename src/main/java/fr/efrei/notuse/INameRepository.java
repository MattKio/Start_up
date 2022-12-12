package fr.efrei.notuse;

import fr.efrei.domain.Name;
import fr.efrei.repository.IRepository;

import java.util.List;

public interface INameRepository extends IRepository<Name, String> {

    public List<Name> getAll();
    public Name getIndex(int i);

}
