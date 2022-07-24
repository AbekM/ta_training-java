package com.epam.training.Asilbek_Makhmudov.max_in_seq;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int maximumIntInSequence = input;
        while (input != 0) {
            input = scanner.nextInt();
            if(input == 0){
                break;
            }else if (input > maximumIntInSequence){
                maximumIntInSequence = input;
            }
        }
        return maximumIntInSequence;
    }
    public static void main(String[] args) {
        System.out.println(max());
    }
}
