package org.testleaf.week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leafground.com/alert.xhtml");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button")).click();

        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
    }

}
