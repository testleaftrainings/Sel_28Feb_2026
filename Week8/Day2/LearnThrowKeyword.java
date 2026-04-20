package org.testleaf.week8.day2;

public class LearnThrowKeyword {

 public static void main(String[] args) {

           //used to explicitly throw an exception for the methods

    int age=-18;

    if(age>=18){
        System.out.println("Eligible for vote");
    }
   else{
        System.out.println("Not Eligible for vote");
    }

    if(age<1){
     throw new ArithmeticException("Not eligible as my age is Negative");
    }
        
    }

}
