package org.testleaf.week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

    public static void main(String[] args) {

        //Launch the browser
          ChromeDriver driver=new ChromeDriver();
        
          //Load the url
        driver.get("https://leafground.com/alert.xhtml");
       
        //maximize the browser
        driver.manage().window().maximize();
        
       //Click on the show button for simple alert
        driver.findElement(By.xpath("//span[text()='Show']")).click();

        //switch the focus to Alertbox
        Alert simpleAlert = driver.switchTo().alert();

        //getText from the alert
        String text = simpleAlert.getText();
        System.out.println(text);
        
        //Accepting the alert
        simpleAlert.accept();


        


        
    }

}
