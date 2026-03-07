package org.testleaf.week2.day1;

public class Mobile {

    public void makeCall(){
        System.out.println("Make Call");
    }

    public void doChat(){
        System.out.println("Do chat");
    }

    public static void main(String[] args) {
        System.out.println("I am from main method");

        //ClassName objectName=new ClassName();
        Mobile mobileOptions=new Mobile();
        mobileOptions.makeCall();
        mobileOptions.doChat();
    }

}
