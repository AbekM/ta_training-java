package com.epam.training.Asilbek_Makhmudov.quadratic_equation;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0){
            System.out.println("no roots");
        } else if (discriminant == 0) {
            System.out.println(-b / 2 * a);
        } else {
            System.out.println(((-b - Math.sqrt(discriminant))/(2 * a))
                    + " " + ((-b + Math.sqrt(discriminant))/(2 * a)));
        }
    }
}