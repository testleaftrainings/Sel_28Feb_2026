package org.testleaf.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMousehover {

    public static void main(String[] args) {
        //Launch the browser
        ChromeDriver driver=new ChromeDriver();

        //Load the url
        driver.get("https://www.pvrcinemas.com/");

        //maximize the browser
        driver.manage().window().maximize();

        //Step1:Find the element
        WebElement mouseHoverElement=driver.findElement(By.xpath("//span[text()='More']"));

        //Create Object for Actions Class
        Actions act=new Actions(driver);


        //Use the appropriate method for mousehover    -moveToElement
        act.moveToElement(mouseHoverElement).perform();

    }

}
