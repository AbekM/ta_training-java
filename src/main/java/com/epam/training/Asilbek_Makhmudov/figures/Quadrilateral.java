package com.epam.training.Asilbek_Makhmudov.figures;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Quadrilateral extends Figure{
    Point a;
    Point b;
    Point c;
    Point d;

    Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {
        double area;
        area = Math.abs((a.x * b.y + b.x * c.y + c.x * d.y + d.x * a.y)
                - (b.x * a.y + c.x * b.y + d.x * c.y + a.x * d.y)) * 0.5;
        return area;
    }

    public String pointsToString(){
        DecimalFormat df = new DecimalFormat("0.0");
        return "(" + df.format(a.getX()) +"," + df.format(a.getY()) + ")" +
                "(" + df.format(b.getX()) +"," + df.format(b.getY()) + ")" +
                "(" + df.format(c.getX()) +"," + df.format(c.getY()) + ")" +
                "(" + df.format(d.getX()) +"," + df.format(d.getY()) + ")" ;
    }

    public Point leftmostPoint(){
        double[] arr = new double[4];
        arr[0] = a.x;
        arr[1] = b.x;
        arr[2] = c.x;
        arr[3] = d.x;
        List<Double> ints = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        if (Collections.min(ints) == a.x) return a;
        if (Collections.min(ints) == b.x) return b;
        if (Collections.min(ints) == c.x) return c;
        return d;
    }
}
