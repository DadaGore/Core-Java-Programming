package com.company;
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base 2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child2 extends Parent2 {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_AbstractcCLasses {
    public static void main(String[] args) {
        child2 c = new child2();



    }

    }

