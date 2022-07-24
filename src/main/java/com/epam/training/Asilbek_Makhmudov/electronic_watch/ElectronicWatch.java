package com.epam.training.Asilbek_Makhmudov.electronic_watch;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds - hours*3600)/60;
        int secondsInMinute = (seconds - minutes*60 - hours*3600);
        int hoursInWatch = (hours > 24 ? hours / 24 : hours == 24 ? 0 : hours);
        System.out.format( hoursInWatch +":"+df.format(minutes)+":"+df.format(secondsInMinute));
    }
}
