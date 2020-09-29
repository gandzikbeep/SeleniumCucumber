package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WelcomePage {
    WebDriver driver;

    @Then("Welcome text on page should be displayed")

    public void welcome_page_is_displayed() {
        WelcomePage welcomePage = new WelcomePage();
        boolean status = welcomePage.driver.findElement(By.xpath("//*[contains(text(),'Welcome to your account. Here")).isDisplayed();
        String expected = "Welcome to your account";
        Assert.assertTrue(expected,status);

    }

}
