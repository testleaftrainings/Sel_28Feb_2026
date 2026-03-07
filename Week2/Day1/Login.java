package org.testleaf.week2.day1;

public class Login {

    public void enterUsername(String username){
        //String username="vineeth@fb.com";
     System.out.println(username);
    }

    public void enterPassword(String password){
        //String password="123456";
    System.out.println(password);
    }

    public static void main(String[] args) {
        Login loginOptions=new Login();
        loginOptions.enterUsername("vineeth@fb.com");
        loginOptions.enterUsername("bharath@fb.com");
    
    }

}
