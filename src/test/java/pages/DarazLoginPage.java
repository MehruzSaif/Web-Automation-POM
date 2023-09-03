package pages;

import org.openqa.selenium.By;

public class DarazLoginPage extends BasePage {

    public String DARAZ_LOGIN_PAGE_URL = "https://member.daraz.com.bd/user/login";

    public By Phone_Email_Field = By.xpath("//input[@type='text']");
    public By Password_Field = By.xpath("//input[@type='password']");
    public By Login_Button = By.xpath("//button[contains(text(),'LOGIN')]");
    public By ERROR_MESSAGE = By.xpath("//div[@class='next-feedback-content']");

    /* icon click for show password */
    public By Show_Password_Icon = By.xpath("//div[@class='mod-input-password-icon']");

    public void doLogin(String username, String password) {
        writeText(Phone_Email_Field, username);
        writeText(Password_Field, password);
        clickOnElement(Login_Button);
    }
}