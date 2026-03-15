package org.testleaf.week3.day2;
//         Sub/Child extends Parent
public class Audi extends Car {

    public void fillPetrol(){
        System.out.println("fillPetrol");
    }

    public static void main(String[] args) {
        Audi audiOptions=new Audi();
        audiOptions.fillPetrol();
        audiOptions.applyGear();
        audiOptions.driveFast();
        audiOptions.driveSlow();


    }

}


//class Audi extends Car extends Vehicle


