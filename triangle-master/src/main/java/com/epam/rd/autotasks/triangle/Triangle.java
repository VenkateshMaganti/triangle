package com.epam.rd.autotasks.triangle;

class Triangle {
    double x1, y1;
    double x2, y2;
    double x3, y3;

    public Triangle(Point a, Point b, Point c) {
        //TODO
        x1 = a.getX();
        y1 = a.getY();

        x2 = b.getX();
        y2 = b.getY();

        x3 = c.getX();
        y3 = c.getY();

        if(area() == 0) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        //TODO
        double a = 0.5 * ((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
        return Math.abs(a);
    }

    public Point centroid(){
        //TODO
        double x = (x1 + x2 + x3)/3;
        double y = (y1 + y2 + y3)/3;
        return new Point(x, y);
    }

}
