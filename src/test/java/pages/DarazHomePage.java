package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage {

    public String DARAZ_HOME_PAGE_URL = "https://www.daraz.com.bd/";
    
    public By SIGNUP_LOGIN_BUTTON = By.xpath("//a[contains(text(),'Signup / Login')]");
    public By CUSTOMER_CARE_BUTTON = By.xpath("//span[contains(text(),'CUSTOMER CARE')]");
    public By HELP_CENTER_BUTTON = By.xpath("//a[(text()='Help Center')]");
    public By SAVE_MORE_ON_APP = By.xpath("//a[@id='topActionDownload']");
    public By DARAZ_DONATES = By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]");

}