package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Allure;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;

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
    
    /* <------------------For Taking Screenshot------------------> */
    public void takeScrreenShot(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }

}