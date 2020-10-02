package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage_PF {

    @FindBy(xpath = "//*[@class='logout']")
    WebElement btn_logout;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
            //"//*[@title='My wishlists']")
    WebElement btn_MyWishlists;

    WebDriver driver;

    public WelcomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkLogoutIsDisplayed() {
        btn_logout.isDisplayed();
    }

    public void setBtn_logout() {
        btn_logout.click();
    }

    public void checkVisibilityMyWishlistButton() {
        btn_MyWishlists.isDisplayed();
    }


}
