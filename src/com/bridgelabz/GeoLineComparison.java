package com.bridgelabz;

public class GeoLineComparison {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        int x3, y3, x4, y4;
        double lenghtofpoints1, lenghtofpoints2;
        x1 = 1;
        y1 = 1;
        x2 = 4;
        y2 = 4;
        x3 = 2;
        y3 = 3;
        x4 = 5;
        y4 = 5;
        lenghtofpoints1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        lenghtofpoints2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        if (lenghtofpoints1 == lenghtofpoints2) {
            System.out.println("length of both line are equal " + lenghtofpoints1 + "=" + lenghtofpoints2);
        } else {
            System.out.println("length of both lines are not equal");
        }
    }
}

