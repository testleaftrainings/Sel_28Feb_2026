package org.testleaf.week4.day1;

public class ImplementAxis extends Axis{

    public void regulateKYC(){
    System.out.println("regulateKYC");
    }

     public void regulateTransactions(){
        System.out.println("regulateTransactions");
    }

     public void regulateGoldLoan(){
        System.out.println("regulateGoldLoan");
    }


    public void regulateHouseLoan(){
        super.regulateHouseLoan();
    System.out.println("regulateHouseLoan above 1 crore");
    }

    public static void main(String args[]){
    ImplementAxis options=new ImplementAxis();
    options.regulateKYC();
    options.regulateTransactions();
    options.regulateGoldLoan();
    options.regulateHouseLoan();

    }
}
