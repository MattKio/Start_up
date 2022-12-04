package fr.efrei.factory;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class Demographic_infoFactory {

    public static Demographic_info createDemo_info (Race race, String sex) {
        if (Helper.isNullOrEmptyRace(race) || Helper.isNullOrEmpty(sex))
        {
            return null;
        }

        Demographic_info demo = new Demographic_info.Builder().setRace(race).setSex(sex).build();
        return demo;
    }
}
