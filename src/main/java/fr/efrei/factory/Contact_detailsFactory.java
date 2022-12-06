package fr.efrei.factory;

import fr.efrei.domain.Contact_details;
import fr.efrei.util.Helper;

public class Contact_detailsFactory {

    public static Contact_details createContact_details (String phonenumber, String Email, String homenumber){
        if (Helper.isNullOrEmpty(phonenumber) || Helper.isNullOrEmpty(Email) || Helper.isNullOrEmpty(homenumber)){
            return null;
        }

        Contact_details contact_details = new Contact_details.Builder().setPhoneNumber(phonenumber).setEmail(Email).setHomeNumber(homenumber).build();
        return contact_details;
    }
}
