//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//
//public class welcomePage {
//    protected WebDriver driver;
//
//    private  By txt_welcomeText = By.xpath("//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]");
//
//    private  By btn_logout = By.xpath("//*[@class='logout']");
//
//    private  By tab_contactUs = By.id("contact-link");
//
//    private  By btn_orderHistory = By.xpath("//*[@title='Orders']");
//
//    public welcomePage(WebDriver driver) {
//        this.driver = driver;
//      //  PageFactory.initElements(driver,this);  //nowy
//        if (!driver.getTitle().equals("My account - My Store")) {
//            throw new IllegalStateException("This is not welcome Page. The Current page is " + driver.getCurrentUrl());
//        }
//    }
//
//    public void setLogout(){
//      driver.findElement(btn_logout).click();
//    }
//
//    public String getWelcomeText(){
//         return driver.findElement(txt_welcomeText).getText();
//    }
//    public void setTabContact(){
//        driver.findElement(tab_contactUs);
//    }
//    public void isDisplayHistoryOrders(){
//        driver.findElement(btn_orderHistory).isDisplayed();
//    }
//
//
//}
//
