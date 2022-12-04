package fr.efrei.util;

import fr.efrei.domain.Demographic_info;
import fr.efrei.domain.Name;
import fr.efrei.domain.Race;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    public static boolean isNullOrEmptyDemo (Demographic_info demo){
        return demo == null || (demo.isEmpty());
    }

    public static boolean isNullOrEmptyRace (Race r){
        return r == null || (r.isEmpty());
    }

    public static String generateID() {
        return UUID.randomUUID().toString();
    }



}
