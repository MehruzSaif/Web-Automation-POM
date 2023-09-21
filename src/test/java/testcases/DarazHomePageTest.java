package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHomePageTest extends BaseDriverSetup {

    DarazHomePage darazHomePage = new DarazHomePage();

    @Test
    public void clickSignUpLoginButton() throws InterruptedException {
        
        getDriver().get(darazHomePage.DARAZ_HOME_PAGE_URL);
        /* Hover testing */
        darazHomePage.hoverOnElement(darazHomePage.Mens_Body_Fashion_Section);

        // /* search box testing */
        // WebElement seach_in_box = getDriver().findElement(darazHomePage.Search_in_daraz);
        // seach_in_box.sendKeys("Haylou RS4 Plus");

        // /* Enter */
        // action.sendKeys(Keys.ENTER);
        // action.build().perform();

        // /* Click */
        // /* WebElement click_searchButton = getDriver().findElement(darazHomePage.Search_Button);
        // click_searchButton.click(); */

        // /* Login button testing */
        // WebElement click_login = getDriver().findElement(darazHomePage.LOGIN_BUTTON);
        // click_login.click();

        // /* Sign Up button testing */
        // WebElement click_signUp = getDriver().findElement(darazHomePage.SIGNUP_BUTTON);
        // click_signUp.click();

        // /* Save more on app Button testing */
        // WebElement click_saveMoreOnApp = getDriver().findElement(darazHomePage.SAVE_MORE_ON_APP);
        // click_saveMoreOnApp.click();
    }

}