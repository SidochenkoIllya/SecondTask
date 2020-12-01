package com.Illya.firstproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point[] points = new Point[3];
        for (int i = 0; i < points.length; i++) {
            System.out.println("Введите координаты x и y " + (i + 1) + "-й" + " точки: ");
            points[i] = new Point(sc.nextDouble(), sc.nextDouble());
        }

        System.out.println("Введите координаты x и y центра окружности: ");
        Point centralPoint = new Point(sc.nextDouble(), sc.nextDouble());
        Circle circle = new Circle(centralPoint, 0);
        System.out.println("Введите радиус окружности: ");
        circle.setR(sc.nextDouble());
        System.out.println("Точки, лежащие в окружности: ");
        for (int i = 0; i < points.length; i++) {
            circle.containsPoint(points[i]);
        }
    }
}
