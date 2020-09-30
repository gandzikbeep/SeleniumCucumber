package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

//    @Given("user is on login page")
//    public void verifyLoginPage() {
//        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
//        driver = new ChromeDriver();
//
//        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
//        System.out.println("Inside step - user is on login page");
//    }
////@When("user log in with username and password")
////public void login(){
////    System.out.println("Inside step - user enters username and password");
////    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("correctUsername@pl.pl");
////    driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("1234567");
////    System.out.println("Inside step - clicks on login button");
////    driver.findElement(By.id("SubmitLogin")).click();
////}
//
//@When("^user enters (.*) and (.*)$")
//        public void loginMultipleUsers(String username, String password){
//    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
//    driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
//    System.out.println("Inside step - clicks on login button");
//    driver.findElement(By.id("SubmitLogin")).click();
//}
//
//
//
//    @Then("user is navigated to the welcome page")
//    public void user_is_navigated_to_the_welcome_page() {
//
//        boolean status = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).isDisplayed();
//        Assert.assertTrue(status);
//        System.out.println("user is on Welcome Page");
//        driver.close();
//        driver.quit();
//    }

}


