package com.epam.training.Asilbek_Makhmudov.figures_extra;

class Triangle extends Figure {
    Point a;
    Point b;
    Point c;
    Triangle (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == null || b == null || c  == null) throw new IllegalArgumentException();
        double t = (a.x*(b.y-c.y) + b.x*(c.y-a.y) + c.x*(a.y - b.y));
        if (t==0) throw new IllegalArgumentException();
    }

    public Point centroid() {
        int i = 0;
        int k = 0;
        Point centroid = new Point(i, k);
        centroid.x = (a.x + b.x + c.x) / 3;
        centroid.y = (a.y + b.y + c.y) / 3;
        return centroid;
    }

    public boolean isTheSame(Figure figure){
        if (figure.getClass() == Triangle.class){
            return true;
        }
        return false;
    }
}
