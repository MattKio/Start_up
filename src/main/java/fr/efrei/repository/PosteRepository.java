package fr.efrei.repository;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Emploie;
import fr.efrei.domain.Poste;

import java.util.ArrayList;
import java.util.List;

public class PosteRepository implements IPosteRepository{
    private static PosteRepository repository = null;
    private List<Poste> PosteDB = null;

    private PosteRepository() {
        PosteDB = new ArrayList<Poste>();
    }

    public static PosteRepository getRepository() {
        if (repository == null){
            return new PosteRepository();
        }
        return repository;
    }

    public Poste create(Poste poste) {
        boolean success = PosteDB.add(poste);
        if (success)
        {
            return poste;
        }
        else
            return null;
    }

    @Override
    public Poste read(String s) {
        for (Poste p: PosteDB){
            if (p.getPosteName().equals(s) || p.getCodePoste().equals(s))
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public Poste update(Poste poste) {

        Poste oldposte = read(poste.getCodePoste());
        if (poste != null) {
            PosteDB.remove(oldposte);
            PosteDB.add(poste);
            return poste;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Poste posteToDelete = read(s);
        if (posteToDelete == null)
        {
            return false;
        }

        PosteDB.remove(posteToDelete);
        return true;
    }

    @Override
    public List<Poste> getAll() {
        return PosteDB;
    }

    @Override
    public Poste getIndex(int i) {
        return PosteDB.get(i);
    }
}
