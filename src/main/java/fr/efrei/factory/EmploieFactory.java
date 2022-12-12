package fr.efrei.factory;

import fr.efrei.domain.Emploie;
import fr.efrei.util.Helper;

public class EmploieFactory {



    public static Emploie createEmploie (String Title){
        if (Helper.isNullOrEmpty(Title)){
            return null;
        }

        Emploie emploie = new Emploie.Builder().setTitle(Title).build();
        return emploie;

    }

    public static Emploie createEmploie(Emploie em) {
        if (Helper.isNullOrEmpty(em.getTitle())){
            return null;
        }

        Emploie emploie = new Emploie.Builder().setTitle(em.getTitle()).build();
        return emploie;
    }
}
