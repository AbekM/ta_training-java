package com.epam.training.Asilbek_Makhmudov.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int days = 0;
        int i = 0 ;
        if (b>=a & a<h){
            System.out.println("Impossible");
        } else{
            while(i < h){
                days++;
                i+=a;
                if (i>=h){
                    break;
                }
                i-=b;
            }
            System.out.println(days);
        }
    }
}
