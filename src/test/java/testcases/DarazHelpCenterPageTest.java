package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHelpCenterPage;
import utilities.BaseDriverSetup;

public class DarazHelpCenterPageTest extends BaseDriverSetup {

    DarazHelpCenterPage darazHelpCenterPage = new DarazHelpCenterPage();

    @Test
    public void TestHelpCenterPageTitle() {

        getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);
        getDriver(). manage().window().maximize();

        assertEquals(getDriver().getTitle(), darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}