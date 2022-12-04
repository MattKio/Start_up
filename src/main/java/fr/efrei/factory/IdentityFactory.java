package fr.efrei.factory;

import fr.efrei.domain.Identity;
import fr.efrei.util.Helper;

public class IdentityFactory {

    public static Identity createIdentity (String passport_id, String NIC_id){
        if (Helper.isNullOrEmpty(passport_id) || Helper.isNullOrEmpty(NIC_id))
        {
            return null;
        }

        Identity identity = new Identity.Builder().setPassport_id(passport_id).setNIC_id(NIC_id).build();
        return identity;
    }

    public static Identity createIdentity_Passportid (String passport_id){
        if (Helper.isNullOrEmpty(passport_id))
        {
            return null;
        }

        Identity identity = new Identity.Builder().setPassport_id(passport_id).build();
        return identity;
    }

    public static Identity createIdentity_NICid (String NIC_id){
        if (Helper.isNullOrEmpty(NIC_id))
        {
            return null;
        }

        Identity identity = new Identity.Builder().setNIC_id(NIC_id).build();
        return identity;
    }
}
