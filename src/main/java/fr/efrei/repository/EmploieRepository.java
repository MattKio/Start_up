package fr.efrei.repository;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Emploie;

import java.util.ArrayList;
import java.util.List;

public class EmploieRepository implements IEmploieRepository{
    private static EmploieRepository repository = null;
    private List<Emploie> emploieDB = null;

    private EmploieRepository() {
        emploieDB = new ArrayList<Emploie>();
    }

    public static EmploieRepository getRepository() {
        if (repository == null){
            return new EmploieRepository();
        }
        return repository;
    }

    public Emploie create(Emploie emploie) {
        boolean success = emploieDB.add(emploie);
        if (success)
        {
            return emploie;
        }
        else
            return null;
    }

    @Override
    public Emploie read(String s) {
        for (Emploie e: emploieDB){
            if (e.getTitle().equals(s))
            {
                return e;
            }
        }
        return null;
    }

    @Override
    public Emploie update(Emploie emploie) {

        Emploie oldemploie = read(emploie.getTitle());
        if (emploie != null) {
            emploieDB.remove(oldemploie);
            emploieDB.add(emploie);
            return emploie;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Emploie emploieToDelete = read(s);
        if (emploieToDelete == null)
        {
            return false;
        }

        emploieDB.remove(emploieToDelete);
        return true;
    }

    @Override
    public List<Emploie> getAll() {
        return emploieDB;
    }

    @Override
    public Emploie getIndex(int i) {
        return emploieDB.get(i);
    }
}
