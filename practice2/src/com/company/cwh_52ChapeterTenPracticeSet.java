package com.company;
class Circle{
    public int radius;
    Circle(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    Cylinder1(int r, int h){
super(r);
this.radius=h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52ChapeterTenPracticeSet {
    public static void main(String[] args) {
Circle objC = new Circle(25);
        System.out.println(objC.area());

    }
}
