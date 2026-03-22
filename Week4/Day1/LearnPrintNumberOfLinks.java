package org.testleaf.week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPrintNumberOfLinks {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();


       List<WebElement> allLinks = driver.findElements(By.tagName("a"));


    int size = allLinks.size();
    System.out.println("The List is: "+size);

    WebElement element = driver.findElement(By.linkText("Sign up"));
    String text = element.getText();
    System.out.println("The Element is: "+text);

for(int i=0;i<size;i++){
    WebElement webElement = allLinks.get(i);
    String name= webElement.getText();
   System.out.println(name);
      }
  }

}
