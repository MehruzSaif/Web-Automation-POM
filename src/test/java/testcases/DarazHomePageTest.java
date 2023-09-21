package testcases;

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
        darazHomePage.clickOnElement(darazHomePage.Mens_Body_Fashion_Section);

        /* Daraz Donates Button testing */
        darazHomePage.clickOnElement(darazHomePage.DARAZ_DONATES);

        /* search box testing */
        darazHomePage.writeText(darazHomePage.Search_in_daraz, "Haylou RS4 Plus");

        /* Enter */
        darazHomePage.pressOnEnter(darazHomePage.Search_Button);

        /* Click */
        darazHomePage.clickOnElement(darazHomePage.Search_Button);

        // /* Login button testing */
        darazHomePage.clickOnElement(darazHomePage.LOGIN_BUTTON);

        /* Sign Up button testing */
        darazHomePage.clickOnElement(darazHomePage.SIGNUP_BUTTON);

        /* Save more on app Button testing */
        darazHomePage.clickOnElement(darazHomePage.SAVE_MORE_ON_APP);

    }
}