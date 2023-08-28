package testcases;

import org.testng.annotations.Test;

import pages.DarazRegistrationPage;
import utilities.BaseDriverSetup;

public class DarazRegPageTest extends BaseDriverSetup {

    DarazRegistrationPage darazRegPage = new DarazRegistrationPage();

    @Test
    public void click_signUp_button() throws InterruptedException {

        getDriver().get(darazRegPage.DARAZ_REG_PAGE_URL);
        getDriver(). manage().window().maximize();
        Thread.sleep(3000);


    }
}