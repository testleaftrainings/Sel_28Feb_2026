package org.testleaf.week4.day1;

public interface RBI {


    public void regulateKYC();


    public void regulateTransactions();


    default void regulateCarLoan(){
        System.out.println("regulateCarLoan above 50L");
    }

}
