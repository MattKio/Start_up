package fr.efrei.repository;

import fr.efrei.domain.Name;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements INameRepository {

    private static NameRepository repository = null;
    private List<Name> nameDB = null;

    private NameRepository()     {
        nameDB = new ArrayList<Name>();
    }

    public static NameRepository getRepository() {

        if (repository == null)
        {
            return new NameRepository();
        }

        return repository;
    }


    @Override
    public Name create(Name name) {
        boolean success = nameDB.add(name);
        if (success)
        {
            return name;
        }
        else
            return null;

    }


    @Override
    public Name read(String s) {
        for (Name n: nameDB){
            if (n.getFirstName().equals(s) || n.getMiddleName().equals(s) || n.getLastName().equals(s))
            {
                return n;
            }
        }
        return null;
    }

    @Override
    public Name update(Name name) {
        Name oldFirstName = read(name.getFirstName());
        Name oldMiddleName = read(name.getMiddleName());
        Name oldLastName = read(name.getLastName());

        if (name != null)
        {
            nameDB.remove(oldFirstName);
            nameDB.remove(oldMiddleName);
            nameDB.remove(oldLastName);

            nameDB.add(name);
            return name;
        }

        return null;
    }

    @Override
    public boolean delete(String s) {

        Name nameToDelete = read(s);
        if (nameToDelete == null)
        {
            return false;
        }

        nameDB.remove(nameToDelete);
        return true;
    }

    @Override
    public List<Name> getAll() {
        return nameDB;
    }

    public Name getIndex(int i)
    {
        return nameDB.get(i);
    }
}
