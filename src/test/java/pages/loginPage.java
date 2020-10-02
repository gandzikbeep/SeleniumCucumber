//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class loginPage {
//   protected WebDriver driver;
//
//    private By txt_username = By.id("email");
//
//    private By txt_password = By.id("passwd");
//
//    private By btn_login = By.id("SubmitLogin");
//
//
//    public loginPage(WebDriver driver) {
//        this.driver = driver;
//       if(! driver.getTitle().equals("Login - My Store")) {
//           throw new IllegalStateException("This is not Login Page. The Current page is "+driver.getCurrentUrl());
//       }
//    }
//
//    public void enterUsername(String username) {
//        driver.findElement(txt_username).sendKeys(username);
//    }
//
//    public void enterPassword(String password) {
//        driver.findElement(txt_password).sendKeys(password);
//    }
//
//    public void clickSubmitBtn() {
//        driver.findElement(btn_login).click();
//    }
//
//
////    public void loginValidUser(String username, String password) {
////        driver.findElement(txt_username).sendKeys(username);
////        driver.findElement(txt_password).sendKeys(password);
////        driver.findElement(btn_login).click();
////    }
//
//}
