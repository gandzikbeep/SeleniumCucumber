package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

    @FindBy(xpath = "//*[@id='header_logo']/a/img")
    WebElement img_logo;

    @FindBy(xpath = "//*[@title = 'Log in to your customer account']")
    WebElement btn_signin;

    WebDriver driver;

    public HomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void isLogoIsVisible(){
        img_logo.isDisplayed();
    }
    public void isSignInButtonIsVisible(){
        btn_signin.isDisplayed();
    }

    public void isBtnLogoutIsVisible(){
        btn_signin.isDisplayed();
    }

    public void goToLoginPage(){
        btn_signin.click();

   }



}
