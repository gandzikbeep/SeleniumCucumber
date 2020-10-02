package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pageFactory.WelcomePage_PF;


import java.util.concurrent.TimeUnit;

public class LoginStepsPOM_PF {
    WebDriver driver = null;
    LoginPage_PF login;
    WelcomePage_PF welcome;
    HomePage_PF home;


    @Given("user is on login page")
    public void verifyLoginPage() {
        System.out.println("====== Inside Login steps POM =====");
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        System.out.println("Inside step - user is on login page");

    }

    @When("^user enters (.*) and (.*)$")
    public void loginMultipleUsers(String username, String password) {

        login = new LoginPage_PF(driver);  //noooo
        login.enterUsername(username);
        login.enterPassword(password);
        System.out.println("Inside step - enters username and password");
        login.clickSubmitBtn();
        System.out.println("Inside step - clicks on login button");

    }

    @Then("user is navigated to the welcome page")
    public void user_is_navigated_to_the_welcome_page() {
        System.out.println("Step 3 - user is navigated to the welcome page");
        welcome = new WelcomePage_PF(driver);
        welcome.checkLogoutIsDisplayed();
        Assert.assertTrue(true);
    }

    @Then("user logout")
    public void user_logout() {
        System.out.println("LOGOUT step");
        welcome.setBtn_logout();
        home = new HomePage_PF(driver);
        home.isSignInButtonIsVisible();
        Assert.assertTrue(true);
        driver.quit();

    }

}