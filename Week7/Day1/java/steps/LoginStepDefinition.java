package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass {

   @Given("Launch the browser")
    public void launchBrowser(){
    ChromeOptions op=new ChromeOptions();
    op.addArguments("guest");
    driver=new ChromeDriver(op);
      }
      
    @And("Load the url")
     public void loadUrl(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        driver.get("http://leaftaps.com/opentaps/control/main");
    }

   @And("Enter the username as {string}")
     public void enterUsername(String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @And("Enter the password as {string}")
     public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("Click on the Login button")
     public void clickLoginButton(){
        driver.findElement(By.className("decorativeSubmit")).click();
    }

    @Then("User should be loggedin")
     public void verifyLogin(){
        System.out.println("Login successful");
    }

    @But("It throws error message")
    public void verifyErrorMessage(){
        System.out.println("Error message thrown");
    }

}
