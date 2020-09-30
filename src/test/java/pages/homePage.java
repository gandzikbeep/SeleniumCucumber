package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    protected WebDriver driver;

    private  By img_logo = By.xpath("//*[@id=\"header_logo\"]/a/img");
    private  By btn_signin = By.xpath("//*[@title = 'Log in to your customer account']");

    public homePage(WebDriver driver) {
        this.driver = driver;
//        if (!driver.getTitle().equals("My Store")) {
//            throw new IllegalStateException("This is not Home Page. The Current page is " + driver.getCurrentUrl());
//        }
    }

    public void checkLogo() {
        driver.findElement(img_logo).isDisplayed();
    }

    public void goToLoginPage() {
        driver.findElement(btn_signin).click();
    }

    public void visibilitySignInBtn() {
        driver.findElement(btn_signin).isDisplayed();
    }


}
