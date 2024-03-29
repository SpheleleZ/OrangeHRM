package org.OrangeHRM.web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    protected WebDriver driver;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    /*
     * WaitForElement Method help if Browser have to wait for element to be visible
     */

    public void waitForElement(WebElement element, long timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
