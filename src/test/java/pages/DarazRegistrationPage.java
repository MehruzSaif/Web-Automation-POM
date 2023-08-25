package pages;

import org.openqa.selenium.By;

public class DarazRegistrationPage extends BasePage {

    public String DARAZ_REG_PAGE_URL = "https://member.daraz.com.bd/user/register";

    public By Reg_Phone_Field = By.xpath("//input[@placeholder='Please enter your phone number']");
    public By Verification_Code_Field = By.xpath("//input[@placeholder='Enter your first and last name']");

}