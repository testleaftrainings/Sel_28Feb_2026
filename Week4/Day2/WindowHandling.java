package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

    public static void main(String[] args) {
        //Launch the browser
          ChromeDriver driver=new ChromeDriver();
        
          //Load the url
        driver.get("https://leafground.com/alert.xhtml");
       
        //maximize the browser
        driver.manage().window().maximize();

        //getWindowHandle
        String parentAddress = driver.getWindowHandle();
        System.out.println("parentAddress is : "+parentAddress);

       //Click on the Open button
        driver.findElement(By.xpath("//span[text()='Open']")).click();

        Set<String> allAdress = driver.getWindowHandles();
        System.out.println(" is : "+allAdress);

        //[BAA15EE8BD1215581E9437F8A41332AA, 0AFAF75688C0906E8B2332ADADD141E8]

        //Create a empty List
        List<String> address=new ArrayList<String>(allAdress);

        String childAddress = address.get(1);
        System.out.println(childAddress);
        //0AFAF75688C0906E8B2332ADADD141E8

        String parentTitle = driver.getTitle();
        System.out.println("parentTitle is: "+parentTitle);


        //switch to child window
        driver.switchTo().window(childAddress);


        String childTitle = driver.getTitle();
        System.out.println("childTitle is: "+childTitle);

        //close
        driver.close();
        
        //quit
        //driver.quit();

        String parentWindowAddress = address.get(0);
        driver.switchTo().window(parentWindowAddress);

        String title = driver.getTitle();
        System.out.println("title is: "+title);
     
    }

}
