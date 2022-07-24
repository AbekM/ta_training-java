package com.epam.training.Asilbek_Makhmudov.triangle;

class Triangle {
    public Point a;
    public Point b;
    public Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double t = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
        if (t == 0){
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double area;
        area = Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) * 0.5;
        return area;
    }

    public Point centroid(){
        int i = 0;
        int k = 0;
        Point centroid = new Point(i, k);
        centroid.x = (a.x + b.x + c.x) / 3;
        centroid.y = (a.y + b.y + c.y) / 3;
        return centroid;
    }
}
