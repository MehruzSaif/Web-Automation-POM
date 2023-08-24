package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHelpCenterPage;
import utilities.BaseDriverSetup;

public class DarazHelpCenterPageTest extends BaseDriverSetup {

    DarazHelpCenterPage darazHelpCenterPage = new DarazHelpCenterPage();

    @Test
    public void TestHelpCenterPageTitle() throws InterruptedException {

        driver.get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
        driver. manage().window().maximize();
        Thread.sleep(3000);

        assertEquals(driver.getTitle(), darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);

        Thread.sleep(3000);
    }

}