package com.epam.training.Asilbek_Makhmudov.segments;

class Segment {
    public Point start;
    public Point end;
    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        if (start == end){
            throw new IllegalArgumentException();
        } else if(start.x == end.x && start.y == end.y){
            throw new RuntimeException();
        }
    }
    double length() {
        double length;
        length = Math.sqrt((Math.pow((end.x -start.x), 2) + Math.pow((end.y - start.y), 2)));
        return length;
    }

    Point middle() {
        double x;
        double y;
        x = (start.x + end.x)/2;
        y = (start.y + end.y)/2;
        return new Point(x,y);
    }

    Point intersection(Segment another) {
        double a1 = end.y - start.y;
        double b1 = start.x - end.x;
        double c1 = a1*(start.x) + b1*(start.y);
        double a2 = another.end.y - another.start.y;
        double b2 = another.start.x - another.end.x;
        double c2 = a2*(another.start.x)+ b2*(another.start.y);
        double determinant = a1*b2 - a2*b1;
        if (determinant == 0)
        {
            return null;
        }else
        {
            double x = (b2*c1 - b1*c2)/determinant;
            double y = (a1*c2 - a2*c1)/determinant;
            return new Point(x,y);
        }
    }
}
