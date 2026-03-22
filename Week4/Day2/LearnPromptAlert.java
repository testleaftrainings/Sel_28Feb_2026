package org.testleaf.week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

    public static void main(String[] args) {
          ChromeDriver driver=new ChromeDriver();

        driver.get("https://leafground.com/alert.xhtml");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();

         //Switch the focus
        Alert promptALert = driver.switchTo().alert();

        promptALert.sendKeys("Prompt is entered");

        promptALert.accept();
        
    }

   

}
