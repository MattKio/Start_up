package fr.efrei.factory;

import fr.efrei.domain.Poste;
import fr.efrei.util.Helper;

public class PosteFactory {
    public static Poste createPoste (String codePostal, String posteName, boolean statut){
        if (Helper.isNullOrEmpty(codePostal) || Helper.isNullOrEmpty(posteName)){
            return null;
        }

        Poste poste = new Poste.Builder().setCodePostal(codePostal).setPosteName(posteName).setStatut(statut).build();
        return poste;
    }
}


