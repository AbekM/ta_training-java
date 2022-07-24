package com.epam.training.Asilbek_Makhmudov.figures;

import java.text.DecimalFormat;

class Circle extends Figure{
    Point a;
    double r;
    Circle(Point a, double r){
        this.a = a;
        this.r = r;
    }
    public double area() {
        double area;
        area = Math.PI * r * r;
        return area;
    }

    public String pointsToString(){
        DecimalFormat df = new DecimalFormat("0.0");
        return "(" + df.format(a.getX()) +"," + df.format(a.getY()) + ")";
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.0");
        return this.getClass().getSimpleName() +"[" +"(" + df.format(a.getX()) +","
                + df.format(a.getY()) + ")" + r + "]" ;
    }
    public Point leftmostPoint(){
        Point left = a;
        left.x = a.x - r;
        left.y = a.y;
        return left;
    }
}
