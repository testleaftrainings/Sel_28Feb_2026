package org.testleaf.week8.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {


    public static void main(String[] args) throws IOException {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        //take screenshot
        File source = driver.getScreenshotAs(OutputType.FILE);

        //assigning the location
        File destination=new File("learn_selenium/snaps/Leaftaps.png");

        //paste the screenshot in the location
        FileUtils.copyFile(source, destination);
   }

}
