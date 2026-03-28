package org.testleaf.week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {
    public static void main(String[] args) {

       //Launch the browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the url
        driver.get("https://leafground.com/table.xhtml");

        //maximize the browser
        driver.manage().window().maximize();

        //add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        //Number of Rows
        List<WebElement> numberOfTrTage = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
       
        int rowCount = numberOfTrTage.size();
        System.out.println("The Row count is: "+rowCount);

        List<WebElement> numberOfTdTags = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
        int columnCount = numberOfTdTags.size();
        System.out.println("columnCount is: "+columnCount);

        //Print the entire row2
        List<WebElement> row2Data = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td"));
       for (int i = 0; i <row2Data.size(); i++) {
          String row2StringValue = row2Data.get(i).getText();
          System.out.println("row2StringValue is : "+row2StringValue);
 }
     //prit all the data in the table
      List<WebElement> allData = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td"));
      for (int i = 0; i < allData.size(); i++) {
          String allDataStringValue = allData.get(i).getText();
          System.out.println("The all data is: "+allDataStringValue);
          //String text = allData.get(0).getText();
          //String text = allData.get(1).getText();
          //String text = allData.get(59).getText();
      }
    
    }

}
