package testcases;

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

        WebElement seach_in_box = driver.findElement(darazHomePage.Search_in_daraz);
        seach_in_box.sendKeys("Haylou Rs4 Plus");

        WebElement click_searchButton = driver.findElement(darazHomePage.Search_Button);
        click_searchButton.click();

        WebElement click_signUp_login = driver.findElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
        click_signUp_login.click();

        WebElement click_saveMoreOnApp = driver.findElement(darazHomePage.SAVE_MORE_ON_APP);
        click_saveMoreOnApp.click();

    }

}
