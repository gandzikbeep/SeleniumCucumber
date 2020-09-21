package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
    WebDriver driver;

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("I open Automation Practice homepage")
    public void i_open_automation_practice_homepage() {
        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
