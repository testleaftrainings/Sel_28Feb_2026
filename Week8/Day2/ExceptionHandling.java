package org.testleaf.week8.day2;

public class ExceptionHandling {

    public static void main(String args[]){
    try{
     int number=10;
     System.out.println(number/0);
     }

     catch(ArithmeticException exp){

     }

     try{
        int arr[]=new int[-3];
      System.out.println(arr[3]);
     }

      
     catch(ArrayIndexOutOfBoundsException e){
      System.out.println("The Exception is: "+e);
     }

    finally{
      System.out.println("Close browser and Report generated");
     }

   }

}
