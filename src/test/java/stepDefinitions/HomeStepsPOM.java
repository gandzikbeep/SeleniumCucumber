package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.homePage;

public class HomeStepsPOM {


    WebDriver driver = null;
    homePage home;


    @Given("Open homepage")
    public void open_HomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        String homePageUrl = "http://automationpractice.com/index.php";
        driver.get(homePageUrl);
        System.out.println("======inside home Page POM=================== ");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        home = new homePage(driver);
        home.checkLogo();
        Assert.assertTrue(true);
    }

    @Then("SignIn button is visible on homePage")
    public void isSignInButtonIsVisibleOnHomePage() {
        home.visibilitySignInBtn();
        Assert.assertTrue(true);
    }

    @And("Close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }

    @Given("Open loginPage")
    public void click_on_sign_in_btn() {
        home.goToLoginPage();
    }

}
