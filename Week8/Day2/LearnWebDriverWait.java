package org.testleaf.week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leafground.com/waits.xhtml");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Click']")).click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));

        boolean displayed = element.isDisplayed();

        System.out.println(displayed);

    }

}
