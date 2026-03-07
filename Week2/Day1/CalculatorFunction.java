package org.testleaf.week2.day1;

public class CalculatorFunction {


//void - method will not return anything

public int add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
        return c+a+b;
    }

   
   public static void main(String[] args) {
        CalculatorFunction calcOptions=new CalculatorFunction();
        int addNumber=calcOptions.add();
        System.out.println(addNumber);
        
        
    }

}
