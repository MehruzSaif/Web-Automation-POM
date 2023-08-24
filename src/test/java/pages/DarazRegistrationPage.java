package pages;

import org.openqa.selenium.By;

public class DarazRegistrationPage extends BasePage {

    public By Phone_Email_Field = By.xpath("//input[@type='text']");
    public By Password_Field = By.xpath("//input[@type='password']");
    public By Login_Button = By.xpath("//button[contains(text(),'LOGIN')]");
    
}
