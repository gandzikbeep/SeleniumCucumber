package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

public class LoginStepsPOM {
    WebDriver driver = null;
    loginPage login;

    @Given("user is on login page")
    public void verifyLoginPage() {
        System.out.println("====== Inside Login steps POM =====");
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        System.out.println("Inside step - user is on login page");

    }
//@When("user log in with username and password")
//public void login(String username, String password){
//
//
//    System.out.println("Inside step - user enters username and password");
//    login.enterUsername(username);
//    login.enterPassword(password);
//    System.out.println("Inside step - clicks on login button");
//    login.clickSubmitBtn();
//}

@When("^user enters (.*) and (.*)$")
        public void loginMultipleUsers(String username, String password){

    login = new loginPage(driver);
    login.enterUsername(username);
    login.enterPassword(password);
    login.clickSubmitBtn();
    System.out.println("Inside step - clicks on login button");

}


    @Then("user is navigated to the welcome page")
    public void user_is_navigated_to_the_welcome_page() {

        boolean status = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).isDisplayed();
        Assert.assertTrue(status);
        System.out.println("user is on Welcome Page");
        driver.close();
        driver.quit();
    }

}


