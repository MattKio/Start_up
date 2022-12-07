package fr.efrei.repository;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Race;

import java.util.ArrayList;
import java.util.List;

public class Demographic_infoRepository implements IDemographic_infoRepository{
    private static Demographic_infoRepository repository = null;
    private List<Demographic_info> demoDB = null;

    private Demographic_infoRepository() {
        demoDB = new ArrayList<Demographic_info>();
    }

    public static Demographic_infoRepository getRepository() {
        if (repository == null){
            return new Demographic_infoRepository();
        }
        return repository;
    }

    public Demographic_info create(Demographic_info demo) {
        boolean success = demoDB.add(demo);
        if (success)
        {
            return demo;
        }
        else
            return null;
    }

    @Override
    public Demographic_info read(String s) {
        for (Demographic_info d: demoDB){
            if (d.getRace().getId().equals(s))
            {
                return d;
            }
        }
        return null;
    }

    @Override
    public Demographic_info update(Demographic_info demo) {

        Demographic_info olddemo = read(demo.getRace().getId());
        if (demo != null) {
            demoDB.remove(olddemo);
            demoDB.add(demo);
            return demo;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Demographic_info demoToDelete = read(s);
        if (demoToDelete == null)
        {
            return false;
        }

        demoDB.remove(demoToDelete);
        return true;
    }

    @Override
    public List<Demographic_info> getAll() {
        return demoDB;
    }

    @Override
    public Demographic_info getIndex(int i) {
        return demoDB.get(i);
    }
}
