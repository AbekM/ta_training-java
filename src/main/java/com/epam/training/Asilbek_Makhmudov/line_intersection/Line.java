package com.epam.training.Asilbek_Makhmudov.line_intersection;

public class Line {
    private final int k;
    private final int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
    public int getK(){
        return k;
    }
    public int getB(){
        return b;
    }

    public Point intersection(Line other) {
        int x;
        int y;
        if (k == other.getK()){
            return null;
        }else {
            x = (other.getB() - b)/(k-other.getK());
            y = k * x + b;
            return new Point(x,y);
        }
    }
}
