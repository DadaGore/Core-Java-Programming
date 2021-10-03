package com.company;

import java.net.PortUnreachableException;

class phone{
    public void great (){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class smartphone extends phone {
    public void swagat(){
        System.out.println("Apka swagat he");
    }
    public void name() {
        System.out.println("i am a programmer");
    }
}
public class cwh49DynamicMethodDispatch {
    public static void main(String[] args) {
//phone obj = new phone();
//smartphone smobj = new smartphone();
//obj.name();

phone obj = new smartphone();
obj.name();

    }
}
