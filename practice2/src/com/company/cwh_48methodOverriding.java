package com.company;
class A{
    public int harry(){
        return 4;
    }
    public void meht2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meht2(){
        System.out.println("I am method 2 of class B");
    }
    public void meht3(){
        System.out.println("I am method 3 of class B");
    }
}
public class cwh_48methodOverriding {
    public static void main(String[] args) {
A a = new A();
a.meht2();
B b = new B();
b.meht2();
    }
}
