package org.testleaf.week2.day1;

public class Palindrome {

  
    public static void main(String[] args) {
      
        int input=12122;
        int temp=input;
        int output=0;


      while(input>=1){

        output=(output*10)+(input%10);

        input=input/10;


      }

     if(temp==output){
        System.out.println("It is Palindrome");
      }
      else{
        System.out.println("Not a palindrome");
      }
  }

}
