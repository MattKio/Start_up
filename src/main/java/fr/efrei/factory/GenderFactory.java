package fr.efrei.factory;

import fr.efrei.domain.Gender;
import fr.efrei.util.Helper;

public class GenderFactory {
    public static Gender createSex(String description) {
        String id = Helper.generateID();

        if (Helper.isNullOrEmpty(description))
        {
            return null;
        }

        Gender sex = new Gender.Builder().setId(id).setDescription(description).build();

        return sex;
    }
}
