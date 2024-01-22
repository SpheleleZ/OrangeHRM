package org.OrangeHRM.web.pages;

import org.OrangeHRM.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private final WebDriver driver;

    private final WaitHelper waitHelper;

    @FindBy(id = "txtUsername")
    @CacheLookup
    WebElement usernameField;

    @FindBy(id = "txtPassword")
    @CacheLookup
    WebElement passwordField;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
    }
}
