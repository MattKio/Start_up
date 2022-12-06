package fr.efrei.factory;

import fr.efrei.domain.Identity_Type;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class Identity_TypeFactory {

    public static Identity_Type createIdentity(String passeport, String nic) {

        if (Helper.isNullOrEmpty(passeport) && Helper.isNullOrEmpty(nic))
        {
            return null;
        }

        Identity_Type identity = new Identity_Type.Builder().setPasseport(passeport).setNIC(nic).build();

        return identity;
    }
}
