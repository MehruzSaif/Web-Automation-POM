package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHelpCenterPage;
import pages.DarazHomePage;
import utilities.BaseDriverSetup;

public class DarazHelpCenterPageTest extends BaseDriverSetup {

    DarazHomePage darazHomePage = new DarazHomePage();
    DarazHelpCenterPage darazHelpCenterPage = new DarazHelpCenterPage();

    @Test
    public void TestHelpCenterPageTitle() {

        getDriver().get(darazHomePage.DARAZ_HOME_PAGE_URL);
        // getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);

        darazHomePage.hoverOnElement(darazHomePage.DARAZ_HELP_SUPPORT);
        darazHomePage.clickOnElement(darazHomePage.DARAZ_HELP_CENTER);

        /* Assertions  */
        assertEquals(getDriver().getTitle(), darazHelpCenterPage.HELP_CENTER_PAGE_TITLE);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        darazHelpCenterPage.takeScrreenShot("Help Center Page");
    }

    @Test
    public void TestHelpCenterPageURL() {
        getDriver().get(darazHelpCenterPage.HELP_CENTER_PAGE_URL);

        /* Assertions  */
        assertEquals(getDriver().getCurrentUrl(), darazHelpCenterPage.HELP_CENTER_PAGE_URL);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        darazHelpCenterPage.takeScrreenShot("Help Center Page");
    }
}