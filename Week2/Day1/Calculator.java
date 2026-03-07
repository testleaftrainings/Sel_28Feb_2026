package org.testleaf.week2.day1;

public class Calculator {
  
public void add(int a,int b){
      System.out.println(a+b);
   }

   public static void main(String[] args) {
       Calculator calcOptions=new Calculator();
       calcOptions.add(10, 20);
       calcOptions.add(50, 100);
    }

}
