package org.testleaf.week3.day2;
//      Sub/Child extends Parent
public class Car extends Vehicle{

    public void applyGear(){
        System.out.println("applyGear");
    }

    public static void main(String[] args) {
        Car carOptions=new Car();
        carOptions.applyGear();
        carOptions.driveFast();
        carOptions.driveSlow();
        

    }

}
