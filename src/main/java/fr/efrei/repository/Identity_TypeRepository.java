package fr.efrei.repository;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Identity_Type;

import java.util.ArrayList;
import java.util.List;

public class Identity_TypeRepository implements IIdentity_TypeRepository{
    private static Identity_TypeRepository repository = null;
    private List<Identity_Type> identityDB = null;

    private Identity_TypeRepository() {
        identityDB = new ArrayList<Identity_Type>();
    }

    public static Identity_TypeRepository getRepository() {
        if (repository == null){
            return new Identity_TypeRepository();
        }
        return repository;
    }

    public Identity_Type create(Identity_Type identity) {
        boolean success = identityDB.add(identity);
        if (success)
        {
            return identity;
        }
        else
            return null;
    }

    @Override
    public Identity_Type read(String s) {
        for (Identity_Type i: identityDB){
            if (i.getNic().equals(s) || i.getPasseport().equals(s))
            {
                return i;
            }
        }
        return null;
    }

    public Identity_Type update(Identity_Type identity) {

        Identity_Type oldidentityNIC = read(identity.getNic());
        Identity_Type oldidentityPST = read(identity.getPasseport());
        if (identity != null) {
            identityDB.remove(oldidentityPST);
            identityDB.remove(oldidentityNIC);
            identityDB.add(identity);
            return identity;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        Identity_Type identityToDelete = read(s);
        if (identityToDelete == null)
        {
            return false;
        }

        identityDB.remove(identityToDelete);
        return true;
    }

    @Override
    public List<Identity_Type> getAll() {
        return identityDB;
    }

    @Override
    public Identity_Type getIndex(int i) {
        return identityDB.get(i);
    }
}
