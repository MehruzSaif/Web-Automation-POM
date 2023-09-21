package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage {

    public String DARAZ_HOME_PAGE_URL = "https://www.daraz.com.bd/";
    
    public By LOGIN_BUTTON = By.xpath("//a[contains(text(),'Login')]");
    public By SIGNUP_BUTTON = By.xpath("//a[contains(text(),'Sign Up')]");
    public By CUSTOMER_CARE_BUTTON = By.xpath("//span[contains(text(),'CUSTOMER CARE')]");
    public By HELP_CENTER_BUTTON = By.xpath("//a[(text()='Help Center')]");
    public By SAVE_MORE_ON_APP = By.xpath("//a[@id='topActionDownload']");
    public By DARAZ_DONATES = By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]");


    /* <---------------------------Search Box ---------------------------------> */

    public By Search_in_daraz = By.xpath("//input[@class='search-box__input--O34g']");
    public By Search_Button = By.xpath("//button[contains(text(),'SEARCH')]");

    /* <---------------------------- Hover ------------------------------> */

    public By Mens_Body_Fashion_Section = By.xpath("//span[contains(text(),\"Men's & Boys' Fashion\")]");

    public void searchThings(String username) {
        writeText(Search_in_daraz, username);
        /* clickOnElement(Search_Button); */
        pressOnEnter(Search_Button);
    }
}