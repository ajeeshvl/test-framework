package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAs(String email, String password) {
        System.out.println("I'm in login page");
        WebElement accountButton = driver.findElement(By.id("header-account-menu"));
        accountButton.click();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement accountSiginButton = driver.findElement(By.id("header-account-signin"));
        accountSiginButton.click();
        WebElement emailTextBox = driver.findElement(By.id("signin-loginid"));
        WebElement passwordTextBox = driver.findElement(By.id("signin-password"));

        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);

    }

    public void verifyErroMessage() {
        System.out.println("error message verify");
    }
}
