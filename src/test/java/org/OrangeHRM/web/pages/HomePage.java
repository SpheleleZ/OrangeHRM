package org.OrangeHRM.web.pages;

import org.OrangeHRM.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;

    private final WaitHelper waitHelper;

    @FindBy(xpath = "//i[text()=\"oxd_home_menu\"]")
    @CacheLookup
    WebElement verifyHomePage;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver,this);
    }

    public boolean verifyHomePage(){
        waitHelper.waitForElement(verifyHomePage,20);
        return verifyHomePage.isDisplayed();
    }
}
