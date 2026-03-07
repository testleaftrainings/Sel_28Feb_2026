package org.testleaf.week2.day1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //Launch the browser
        //Chrome, Edge, firefox - Different driver
        //chrome - ChromeDriver --> Class in java

        //Step1: Launch the browser - Chrome
        //ChromeDriver driver=new ChromeDriver();
          EdgeDriver driver=new EdgeDriver();
       
          //Step2: Load the url - get()
        driver.get("https://www.facebook.com/");

        //Step3: Maximize the browser
        //driver.manage().window().maximize();


        //To have customised brower size
        Dimension size = new Dimension(800, 600);
        driver.manage().window().setSize(size);

        
    }

}
