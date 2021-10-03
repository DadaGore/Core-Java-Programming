package com.company;
interface Mycamera{
    void takeSnap();
    void recordVideo();
}
interface Mywifi{
    String [] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling" + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting");
    }
}
class MySmartPhone extends MyCellPhone implements Mycamera, Mywifi {
    @Override
    public void takeSnap() {
        System.out.println("Taking snaps");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recordinng the video");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String [] networklist = {"Dada" , "Shubham", "Harry"};
        return networklist;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " +network);
    }
}

public class cwh_57_defauiltInterfaces {
    public static void main(String[] args) {
MySmartPhone OnePlus= new MySmartPhone();
String[] ar = OnePlus.getNetwork();
for( String item:ar){
    System.out.println(item);
}


    }

}
