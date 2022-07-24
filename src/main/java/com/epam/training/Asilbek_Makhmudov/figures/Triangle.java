package com.epam.training.Asilbek_Makhmudov.figures;

import java.text.DecimalFormat;

class Triangle extends Figure{
    Point a;
    Point b;
    Point c;
    Triangle (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double area;
        area = Math.abs(a.getX()*(b.getY()-c.getY()) + b.getX()*(c.getY()-a.getY()) + c.getX()*(a.getY() - b.getY()))*0.5;
        return area;
    }

    public String pointsToString(){
        DecimalFormat df = new DecimalFormat("0.0");
        return "(" + df.format(a.getX()) +"," + df.format(a.getY()) + ")" +
                "(" + df.format(b.getX()) +"," + df.format(b.getY()) + ")" +
                "(" + df.format(c.getX()) +"," + df.format(c.getY()) + ")" +"";
    }
    public Point leftmostPoint(){
        if (a.x < b.x){
            if (a.x < c.x){
                return a;
            }else return c;
        }else if (b.x < c.x){
            return b;
        }else return c;
    }
}
