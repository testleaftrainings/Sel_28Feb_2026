package org.testleaf.week4.day1;

public class HDFC implements RBI {

   
    public void regulateKYC() {
        System.out.println("regulateKYC by Adhaar card");
    }

   
    public void regulateTransactions() {
       System.out.println("regulateTransactions above 30L");
    }

  public void regulateCarLoan(){
        System.out.println("regulateCarLoan above 1 Crore");
    }
   

public static void main(String[] args) {
    HDFC hdfcOptions=new HDFC();
    hdfcOptions.regulateKYC();
    hdfcOptions.regulateTransactions();
    hdfcOptions.regulateCarLoan();
    //RBI.regulateCarLoan();
}

}
