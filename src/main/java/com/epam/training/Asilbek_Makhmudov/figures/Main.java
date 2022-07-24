package com.epam.training.Asilbek_Makhmudov.figures;

public class Main {
    public static void main(String[] args) {
        Point area;
        area = new Quadrilateral(new Point(6, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1)).leftmostPoint();
        System.out.println(area.x);
    }
}
