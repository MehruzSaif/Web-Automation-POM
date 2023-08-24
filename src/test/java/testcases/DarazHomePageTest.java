package testcases;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHomePageTest extends BaseDriverSetup {

    DarazHomePage darazHomePage = new DarazHomePage();

    @Test
    public void clickSignUpLoginButton() throws InterruptedException {
        
        driver.get(darazHomePage.DARAZ_HOME_PAGE_URL);
        driver. manage().window().maximize();
        Thread.sleep(3000);

        /* Hover testing */
        Actions action = new Actions(driver);
        WebElement hover_Mens_Body_Fashion_Section = driver.findElement(darazHomePage.Mens_Body_Fashion_Section);
        action.moveToElement(hover_Mens_Body_Fashion_Section).perform();

        /* search box testing */
        WebElement seach_in_box = driver.findElement(darazHomePage.Search_in_daraz);
        seach_in_box.sendKeys("Haylou Rs4 Plus");

        WebElement click_searchButton = driver.findElement(darazHomePage.Search_Button);
        click_searchButton.click();

        /* Login button testing */
        WebElement click_signUp_login = driver.findElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
        click_signUp_login.click();

        /* Save more on app Button testing */
        WebElement click_saveMoreOnApp = driver.findElement(darazHomePage.SAVE_MORE_ON_APP);
        click_saveMoreOnApp.click();

        Thread.sleep(5000);
    }

}
