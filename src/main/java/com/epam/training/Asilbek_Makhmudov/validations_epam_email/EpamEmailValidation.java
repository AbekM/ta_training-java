package com.epam.training.Asilbek_Makhmudov.validations_epam_email;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String email) {
        if (email == null) return false;
        return email.matches("^[a-zA-Z0-9]+_+[a-zA-Z0-9]+@epam.com+$");
    }
}





