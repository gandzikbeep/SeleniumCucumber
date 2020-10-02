package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageFactory.WelcomePage_PF;



public class WelcomeStepsPOM {
    WebDriver driver = null;

    WelcomePage_PF welcome;


    @Then("user see My Wishlist button")
    public void areTheButtonsAreVisible(){
        welcome = new WelcomePage_PF(driver);
        welcome.checkVisibilityMyWishlistButton();
        Assert.assertTrue(true);
        driver.quit();
    }

}
