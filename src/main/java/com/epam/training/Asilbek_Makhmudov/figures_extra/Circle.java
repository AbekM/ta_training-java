package com.epam.training.Asilbek_Makhmudov.figures_extra;

class Circle extends Figure{
    Point a;
    double r;
    Circle(Point a, double r){
        this.a = a;
        this.r = r;
        if (r == 0 || r < 0 || a == null) {
            throw new IllegalArgumentException();
        }
    }
    public Point centroid(){
        return a;
    }
    public boolean isTheSame(Figure figure){
        return figure.getClass() == Circle.class && Math.abs(((Circle) figure).a.x - a.x) < 0.00001
                && Math.abs(((Circle) figure).a.y - a.y) < 0.00001
                && Math.abs(((Circle) figure).r - r) < 0.00001;
    }
}
