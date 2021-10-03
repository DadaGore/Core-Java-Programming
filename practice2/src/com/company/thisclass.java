package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class EkClass1{
    int a;

    public int getA() {
        return a;
    }

    EkClass1(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
public class thisclass{
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
    }
}