package com.Illya.firstproject;

public class Circle {
    private Point c;
    private double r;

    public Circle(Point c, double r) {
        this.c = c;
        this.r = r;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            System.out.println("Введите положительный радиус!");
        }
    }

    public boolean containsPoint(Point p) {
        if (p.distanceTo(this.c) < this.r) {
            System.out.println("(" + p.getX() + "; " + p.getY() + ")");
            return true;
        } else {
            return false;
        }

    }
}
