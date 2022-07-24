package com.epam.training.Asilbek_Makhmudov.average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        int numberOfInputs = 0;
        int average = 0;
        do {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                sum += input;
                numberOfInputs++;
                average = sum / numberOfInputs;

            }
        }while (input != 0);
        System.out.println(average);
    }

}