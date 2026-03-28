package org.testleaf.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

    public static void main(String[] args) {
       //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/frame.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //switch to the frame
        //By index
        driver.switchTo().frame(0);

        //By name/id value
        //driver.switchTo().frame("frame2");

        //Click the button
        driver.findElement(By.id("Click")).click();
}
}   