package fr.efrei.factory;

import fr.efrei.domain.Poste;
import fr.efrei.util.Helper;

public class PosteFactory {
    public static Poste createPoste (String posteName){
        String codePoste = Helper.generateID();
        if (Helper.isNullOrEmpty(codePoste) || Helper.isNullOrEmpty(posteName)){
            return null;
        }

        Poste poste = new Poste.Builder().setCodePostal(codePoste).setPosteName(posteName).setStatut(false).build();
        return poste;
    }

    public static Poste createPoste(Poste posteName) {
        String codePoste = Helper.generateID();
        if (Helper.isNullOrEmpty(codePoste) || Helper.isNullOrEmpty(posteName.getPosteName())){
            return null;
        }

        Poste poste = new Poste.Builder().setCodePostal(codePoste).setPosteName(posteName.getPosteName()).setStatut(false).build();
        return poste;
    }
}


