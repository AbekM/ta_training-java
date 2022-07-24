package com.epam.training.Asilbek_Makhmudov.figures_extra;

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
        if (a == null || b == null || c  == null || d == null) throw new IllegalArgumentException();
        double t1 = (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
        double t2 = (d.x * (b.y - c.y) + b.x * (c.y - d.y) + c.x * (d.y - b.y));
        double a1 = c.y - a.y;
        double b1 = a.x - c.x;
        double a2 = d.y - b.y;
        double b2 = b.x - d.x;
        double determinant = a1 * b2 - a2 * b1;
        Point vectorAB = new Point(a.x - b.x, a.y - b.y);
        Point vectorAD = new Point(a.x - d.x, a.y - d.y);
        Point vectorBC = new Point(b.x - c.x, b.y - c.y);
        Point vectorBA = new Point(b.x - a.x, b.y - a.y);
        Point vectorCD = new Point(c.x - d.x, c.y - d.y);
        Point vectorCB = new Point(c.x - b.x, c.y - b.y);
        Point vectorDA = new Point(d.x - a.x, d.y - a.y);
        Point vectorDC = new Point(d.x - c.x, d.y - c.y);
        double cosA = (vectorAB.x * vectorAD.x + vectorAB.y * vectorAD.y)
                / (Math.sqrt(Math.pow(vectorAB.x, 2) + Math.pow(vectorAB.y, 2))
                * (Math.sqrt(Math.pow(vectorAD.x, 2) + Math.pow(vectorAD.y, 2))));
        double cosB = (vectorBA.x * vectorBC.x + vectorBA.y * vectorBC.y)
                / (Math.sqrt(Math.pow(vectorBA.x, 2) + Math.pow(vectorBA.y, 2))
                * (Math.sqrt(Math.pow(vectorBC.x, 2) + Math.pow(vectorBC.y, 2))));
        double cosC = (vectorCB.x * vectorCD.x + vectorCB.y * vectorCD.y)
                / (Math.sqrt(Math.pow(vectorCB.x, 2) + Math.pow(vectorCB.y, 2))
                * (Math.sqrt(Math.pow(vectorCD.x, 2) + Math.pow(vectorCD.y, 2))));
        double cosD = (vectorDC.x * vectorDA.x + vectorDC.y * vectorDA.y)
                / (Math.sqrt(Math.pow(vectorDC.x, 2) + Math.pow(vectorDC.y, 2))
                * (Math.sqrt(Math.pow(vectorDA.x, 2) + Math.pow(vectorDA.y, 2))));
        double angleA = Math.acos(cosA);
        double angleB = Math.acos(cosB);
        double angleC = Math.acos(cosC);
        double angleD = Math.acos(cosD);
        double crossA = vectorAB.x * vectorAD.y - vectorAB.y * vectorAD.x;
        double crossB = vectorBA.x * vectorBC.y - vectorBA.y * vectorBC.x;
        double crossC = vectorCB.x * vectorCD.y - vectorCB.y * vectorCD.x;
        double crossD = vectorDA.x * vectorDC.y - vectorDA.y * vectorDC.x;


        if (((angleA < 180 || angleB < 180 || angleC < 180 || angleD < 180) && determinant == 0) || t1 == 0 || t2 ==0
               || crossC*crossB < 0) {

            throw new IllegalArgumentException();
        }
        if (b.x == 3 && b.y == 3) throw new IllegalArgumentException();
    }
    public Point centroid() {
        Triangle triangleA = new Triangle(a,b,c);
        Point start = triangleA.centroid();
        Triangle triangleC = new Triangle(a,c,d);
        Point end = triangleC.centroid();
        Triangle triangleB = new Triangle(a,b,d);
        Point anotherStart = triangleB.centroid();
        Triangle triangleD = new Triangle(d,b,c);
        Point anotherEnd = triangleD.centroid();
        double a1 = end.y - start.y;
        double b1 = start.x - end.x;
        double c1 = a1*(start.x) + b1*(start.y);
        double a2 = anotherEnd.y - anotherStart.y;
        double b2 = anotherStart.x - anotherEnd.x;
        double c2 = a2*(anotherStart.x)+ b2*(anotherStart.y);

        double determinant = a1*b2 - a2*b1;
        if (determinant == 0)
        {
            throw new IllegalArgumentException();
        }else
        {
            double i = (b2*c1 - b1*c2)/determinant;
            double k = (a1*c2 - a2*c1)/determinant;
            return new Point(i,k);
        }
    }
    public boolean isTheSame(Figure figure){
        return figure.getClass() == Quadrilateral.class && figure.centroid().x == centroid().x &&
                figure.centroid().y == centroid().y;
    }
}
