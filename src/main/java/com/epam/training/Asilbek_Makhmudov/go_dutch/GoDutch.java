package com.epam.training.Asilbek_Makhmudov.go_dutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int friends = scanner.nextInt();
        if(bill < 0){
            System.out.println("Bill total amount cannot be negative");
        }else if(friends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            System.out.println((int)(bill * 1.1 / friends));
        }
    }
}
