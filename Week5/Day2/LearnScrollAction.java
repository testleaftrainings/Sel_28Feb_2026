package org.testleaf.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {
    public static void main(String args[]){
 //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Load the url
        driver.get("https://www.amazon.in/");

        //maximize the browser
        driver.manage().window().maximize();

        //Step1:
        WebElement scrollElement=driver.findElement(By.linkText("Conditions of Use & Sale"));
    
    
       //Step2:
       Actions act=new Actions(driver);

       //Step3:
    act.scrollToElement(scrollElement).perform();

    
    }

}
