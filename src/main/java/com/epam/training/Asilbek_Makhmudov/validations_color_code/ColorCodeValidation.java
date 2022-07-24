package com.epam.training.Asilbek_Makhmudov.validations_color_code;

public class ColorCodeValidation {
    public static boolean validateColorCode(String color) {
        if (color == null) return false;
        return color.matches("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
    }
}





