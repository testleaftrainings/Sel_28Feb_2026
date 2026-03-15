package org.testleaf.week3.day2;

//BaseClass/ParentClass
public class Vehicle {

    public void driveSlow(){
System.out.println("driveSlow");
    }

    public void driveFast(){
System.out.println("driveFast");
    }

    public static void main(String[] args) {
        Vehicle vehOptions=new Vehicle();
        vehOptions.driveFast();
        vehOptions.driveSlow();

    }

    

}
