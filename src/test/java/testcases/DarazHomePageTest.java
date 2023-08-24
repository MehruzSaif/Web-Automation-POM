package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHomePageTest extends BaseDriverSetup {

    DarazHomePage darazHomePage = new DarazHomePage();

    @Test
    public void clickSignUpLoginButton() {
        
        driver.get(darazHomePage.DARAZ_HOME_PAGE_URL);
        driver. manage().window().maximize();

        WebElement click_signUp_login = driver.findElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
        click_signUp_login.click();
    }

}
