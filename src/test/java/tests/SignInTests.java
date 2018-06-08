package tests;

import core.TestBase;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.SignInPage;

public class SignInTests extends TestBase {

    @Test
    public void verifyLogin() {

        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginAs("ajeeshtest@gmail.com", "ajeesh123");
        AccountPage accountScreen = new AccountPage(driver);
        accountScreen.verifyAccountPage();
    }

    @Test
    public void verifyInvalidLogin() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.loginAs("ajeeshtest@gmails.com", "ajees3h123");
        signInPage.verifyErroMessage();
    }
}
