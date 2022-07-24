package com.epam.training.Asilbek_Makhmudov.pizza_split;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfSlices = scanner.nextInt();
        int numberOfPizzas = 1;
        while(true){
            if ((numberOfSlices * numberOfPizzas) % numberOfPeople == 0){
                System.out.println(numberOfPizzas);
                break;
            } else {
                numberOfPizzas++;
            }
        }
    }
}
