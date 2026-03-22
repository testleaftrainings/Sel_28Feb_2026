package org.testleaf.week4.day1;

public class SBI implements RBI {

   public void regulateKYC(){
   System.out.println("regulateKYC by Pan card");
   }

   public void regulateTransactions(){
    System.out.println("regulateTransactions above 10L");
   }

   public static void main(String[] args) {
    SBI sbiOptions=new SBI();
    sbiOptions.regulateKYC();
    sbiOptions.regulateTransactions();
    

   }


}
