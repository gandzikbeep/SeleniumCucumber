package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToLoginPage {

    WebDriver driver;

    @Given("Launch chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("Open Automation Practice homepage")
    public void open_automation_practice_homepage() {
        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);

    }
    @When("I open LoginPage")
    public void i_open_login_page() {
    driver.findElement(By.xpath("//*[@class='login']")).click();
    }

    @Then("I verify that input email is present")
    public void i_verify_that_the_logo_present_on_page() {

        boolean status = driver.findElement(By.xpath("id='email'")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @And("close browser2")
    public void close_browser2() {
        driver.quit();
    }
}

