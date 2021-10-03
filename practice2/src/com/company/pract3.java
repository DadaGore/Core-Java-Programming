package com.company;
import java.util.Scanner;
import java.util.Random;

class Cylinder{
 private int radius;
 private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class pract3 {
    public static void main(String[] args) {
        Cylinder myCylinder= new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(5);
        int r =myCylinder.getRadius();
        System.out.println(r);
    }
}
