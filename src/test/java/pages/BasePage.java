package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utilities.BaseDriverSetup.getDriver;

public class BasePage {
    
    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    public void writeText(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }
}