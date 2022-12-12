package fr.efrei.repository;

import fr.efrei.domain.Gender;
import fr.efrei.domain.Race;
import java.util.ArrayList;
import java.util.List;

public class GenderRepository implements IGenderRepository {

    private static GenderRepository repository = null;
    private List<Gender> genderDB = null;

    private GenderRepository()     {
        genderDB = new ArrayList<Gender>();
    }

    public static GenderRepository getRepository() {

        if (repository == null)
        {
            return new GenderRepository();
        }

        return repository;
    }


    @Override
    public Gender create(Gender sex) {
        boolean success = genderDB.add(sex);
        if (success)
        {
            return sex;
        }
        else
            return null;

    }


    @Override
    public Gender read(String s) {
        for (Gender gender : genderDB){
            if (gender.getDescription().equals(s))
            {
                return gender;
            }
        }
        return null;
    }

    @Override
    public Gender update(Gender sex) {

        Gender oldSex = read(sex.getId());
        if (sex != null) {
            genderDB.remove(oldSex);
            genderDB.add(sex);
            return sex;
        }

        return null;
    }

    @Override
    public boolean delete(String s) {

        Gender sexToDelete = read(s);
        if (sexToDelete == null)
        {
            return false;
        }

        genderDB.remove(sexToDelete);
        return true;
    }

    @Override
    public List<Gender> getAll() {
        return genderDB;
    }

    public Gender getIndex(int i)
    {
        return genderDB.get(i);
    }

}
