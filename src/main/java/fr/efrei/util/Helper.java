package fr.efrei.util;

import fr.efrei.domain.*;

import fr.efrei.domain.Name;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    public static boolean isNullOrEmptyDemo (Demographic_info demo){
        return demo == null || (demo.isEmpty());
    }

    public static boolean isNullOrEmptyName(Name n){
        return n == null || (n.isEmpty());
    }

    public static boolean isNullOrEmptyIdentityType(Identity_Type i) {
        return i == null || (i.isEmpty());

    }

    public static boolean isNullOrEmptyPoste(Poste p) {
        return p == null || (p.isEmpty());
    }

    public static boolean isNullOrEmptyEmploie(Emploie e) {
        return e == null || (e.isEmpty());
    }

    public static boolean isNullOrEmptyContactDetails(Contact_Details c) {
        return c == null || (c.isEmpty());
    }

    public static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static boolean isNullOrEmptyAddressDetails(AddressDetails a) {
        return a == null || (a.isEmpty());
    }
}
