package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {


    WebDriver driver;


    @Given("Open homepage")
    public void open_HomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        String homePageUrl = "http://automationpractice.com/index.php";
        driver.get(homePageUrl);
    }
    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
        Assert.assertTrue("nie jest widoc", status);
    }
    @Then("SignIn button is visible on homePage")
    public void isSignInButtonIsVisibleOnHomePage(){
        boolean status = driver.findElement(By.xpath("//*[@title = 'Log in to your customer account']")).isDisplayed();
        Assert.assertTrue("wiad",status);
    }

    @And("Close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }

    @Given("Open loginPage")
    public void click_on_sign_in_btn() {

        driver.findElement(By.xpath("//*[@title = 'Log in to your customer account']")).click();

    }

}
