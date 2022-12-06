package fr.efrei.factory;

import fr.efrei.domain.Contact_Details;
import fr.efrei.domain.Identity_Type;
import fr.efrei.util.Helper;

public class Contact_DetailsFactory {

    public static Contact_Details createContact(String phone, String email, String home) {

        if (Helper.isNullOrEmpty(phone) && Helper.isNullOrEmpty(email) && Helper.isNullOrEmpty(home))
        {
            return null;
        }

        Contact_Details contact_details = new Contact_Details.Builder().setPhone_number(phone).setEmail(email).setHome_Number(home).build();

        return contact_details;
    }
}
