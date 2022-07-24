package com.epam.training.Asilbek_Makhmudov.meet_an_agent;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == PASSWORD){
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
