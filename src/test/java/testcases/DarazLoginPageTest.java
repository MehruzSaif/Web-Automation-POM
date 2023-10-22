package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.BaseDriverSetup;

public class DarazLoginPageTest extends BaseDriverSetup {

    DarazHomePage darazHomePage = new DarazHomePage();
    DarazLoginPage darazLoginPage = new DarazLoginPage();

    @Test
    public void testLoginWithInvalidPhoneNo() {
    
        getDriver().get(darazHomePage.DARAZ_HOME_PAGE_URL);
        getDriver().get(darazLoginPage.DARAZ_LOGIN_PAGE_URL);

        darazHomePage.clickOnElement(darazHomePage.LOGIN_BUTTON);
        darazLoginPage.writeText(darazLoginPage.Phone_Email_Field, "0111111111");
        darazLoginPage.writeText(darazLoginPage.Password_Field, "12345678");

        /* Take a screen shot before click on Login button */
        darazLoginPage.takeScrreenShot("Login Info");
        darazLoginPage.clickOnElement(darazLoginPage.Login_Button);

        darazLoginPage.takeScrreenShot("Login");
        assertEquals(darazLoginPage.getElement(darazLoginPage.ERROR_MESSAGE).getText(), "Please enter a valid phone number.");
    }
}