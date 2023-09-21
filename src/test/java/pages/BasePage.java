package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    /* <------------------Enter------------------> */
    public void pressOnEnter(By locator) {
        Actions action = new Actions(getDriver());
        action.sendKeys(Keys.ENTER);
        action.build().perform();
    }

    /* <------------------Hover------------------> */
    public void hoverOnElement(By locator) {
        Actions action = new Actions(getDriver());
        action.moveToElement(getElement(locator)).perform();
    }

}