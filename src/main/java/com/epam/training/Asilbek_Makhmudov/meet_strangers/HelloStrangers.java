package com.epam.training.Asilbek_Makhmudov.meet_strangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 0){
            System.out.println("Oh, it looks like there is no one here");
        } else if (input < 0) {
            System.out.println("Seriously? Why so negative?");
        }else {
            scanner.nextLine();
            while (input > 0) {
                String Name = scanner.nextLine();

                System.out.println("Hello, " + Name);
                input--;
            }
        }
    }
}
