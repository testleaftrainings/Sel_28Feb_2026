package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

    public static void main(String[] args) {

       //Execute the browser in guest mode
       ChromeOptions opt=new ChromeOptions();

       opt.addArguments("guest");
       
       //Launch the browser
        ChromeDriver driver=new ChromeDriver(opt);

        //Load the url
        driver.get("http://leaftaps.com/opentaps/control/main");

        //maximize the browser
        driver.manage().window().maximize();

        //Enter the username
        // findElement -locate a WebElement
        //sendKeys  - enter a value in a text field
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

        //Enter the password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        //Click login button - click()
        driver.findElement(By.className("decorativeSubmit")).click();

        //Click on the CRMSFA link
       // driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.partialLinkText("CRM")).click();

       //Click on the Leads link
       driver.findElement(By.linkText("Leads")).click();

       //Click on the Create Lead link
       driver.findElement(By.linkText("Create Lead")).click();

       //Enter the companyname
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

       //Enter the firstName
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

       //Enter the lastname
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");


       //Handle the dropdown

       //Step1: Find the element
       WebElement sourceEle=driver.findElement(By.id("createLeadForm_dataSourceId"));

       //Step2: Create Object
       Select options=new Select(sourceEle);

       //Selection
       //options.selectByIndex(3);
       //options.selectByValue("LEAD_EXISTCUST");

       options.selectByVisibleText("Partner");


       //Click createlead button
       //driver.findElement(By.name("submitButton")).click();
    }

}
