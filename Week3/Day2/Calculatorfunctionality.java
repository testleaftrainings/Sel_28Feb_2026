package org.testleaf.week3.day2;

public class Calculatorfunctionality {

    //add, sub, mul, div
    //add

   

    //add 2 numbers
    public void addNumbers(int a,int b){
        System.out.println(a+b);

    }

    //add 2 decimal numbers
     public void addNumbers(float a, float b){
        System.out.println(a+b);

    }

        //add 3 numbers
    public void addNumbers(int a, int b, int c, int d){
    System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        Calculatorfunctionality calcOptions=new Calculatorfunctionality();
        calcOptions.addNumbers(10, 20, 30,70);
        calcOptions.addNumbers(7.5f, 2.5f);
    }

}
