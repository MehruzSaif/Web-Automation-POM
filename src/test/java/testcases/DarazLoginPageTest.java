package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.DarazLoginPage;
import utilities.BaseDriverSetup;

public class DarazLoginPageTest extends BaseDriverSetup {

    DarazLoginPage darazLoginPage = new DarazLoginPage();

    @Test
    public void clickLoginButton() throws InterruptedException {

        getDriver().get(darazLoginPage.DARAZ_LOGIN_PAGE_URL);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);

        WebElement Phone_Email = getDriver().findElement(darazLoginPage.Phone_Email_Field);
        Phone_Email.sendKeys("mehruzsaif007@gmail.com");

        WebElement Password = getDriver().findElement(darazLoginPage.Password_Field);
        Password.sendKeys("12345678");

        WebElement click_Show_Password_Icon = getDriver().findElement(darazLoginPage.Password_Field);
        click_Show_Password_Icon.click();

        WebElement click_LoginButton = getDriver().findElement(darazLoginPage.Login_Button);
        click_LoginButton.click();

        Thread.sleep(5000);
    }
}