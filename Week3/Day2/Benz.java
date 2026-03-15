package org.testleaf.week3.day2;
//          Child extends Parent
public class Benz extends Car {


    public void applySoundHorn(){
        System.out.println("applySoundHorn");
    }


    public static void main(String[] args) {
      Benz ben=new Benz();
      ben.applyGear();
      ben.applySoundHorn();
    ben.driveFast();
    }


}
