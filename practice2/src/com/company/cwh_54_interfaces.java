package com.company;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp (int increment);
}
class AvonCycle implements Bicycle {
    void blowHorn(){
        System.out.println("Pee Poop Pee");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brakes");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding Up");
    }
}

public class cwh_54_interfaces {
    public static void main(String[] args) {
AvonCycle dadaCycle = new AvonCycle();
dadaCycle.applyBrake(1);
        System.out.println(dadaCycle.a);
    }
}
