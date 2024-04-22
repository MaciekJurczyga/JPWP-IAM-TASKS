package org.example;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String password = "sample_password";

        // czy String zawiera dużą literę
        System.out.println("Czy string zawiera dużą literę? " + (containsUpperCaseLetter(password) ? "tak" : "nie"));

        // czy String zawiera znak specjalny
        System.out.println("Czy string zawiera znak specjalny? " + (containsSpecialCharacter(password) ? "tak" : "nie"));

        // czy zawiera małą literę
        System.out.println("Czy string zawiera małą literę? " + (containsLowerCaseLetter(password) ? "tak" : "nie"));

        // czy zawiera liczbe
        System.out.println("Czy string zawiera liczbę? " + (containsNumber(password) ? "tak" : "nie"));

        // czy ma długość minimum 5
        System.out.println("Czy string jest długości conajmniej 5? " + ((hasMinimumLength(password)) ? "tak" : "nie") );

    }

    private static boolean containsUpperCaseLetter(String password) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean containsSpecialCharacter(String password) {
        // PODPOWIEDŹ, znak specjalny to w regexach negacja liczby oraz małej i dużej litery.
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean containsLowerCaseLetter(String password){
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean containsNumber(String password){
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean hasMinimumLength(String password){
        // tak wiemy, że nikt normalny tak tego nie sprawdzi :)
        // sprawdz czy hasło ma długość przynjamniej 5
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}