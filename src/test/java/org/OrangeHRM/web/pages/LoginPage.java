package org.OrangeHRM.web.pages;

import org.OrangeHRM.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final WebDriver driver;

    private final WaitHelper waitHelper;

    @FindBy(id = "txtUsername")
    @CacheLookup
    WebElement usernameField;

    @FindBy(id = "txtPassword")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "//button[text()=\"Login\"]")
    @CacheLookup
    WebElement loginButton;

    @FindBy(id = "frmLogin")
    @CacheLookup
    WebElement verifyLoginForm;

    @FindBy(xpath = "//i[text()=\"oxd_home_menu\"]")
    @CacheLookup
    WebElement verifyHomePage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUsernameField(String username) {
        waitHelper.waitForElement(usernameField, 20);
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password) {
        waitHelper.waitForElement(passwordField, 20);
        passwordField.sendKeys(password);
    }

    public HomePage setLoginButton() {
        waitHelper.waitForElement(loginButton, 20);
        loginButton.click();
        return new HomePage(driver);
    }

    public boolean verifyLoginPage() {
        waitHelper.waitForElement(verifyLoginForm, 20);
        return verifyLoginForm.isDisplayed();
    }

    public boolean verifyHomePage(){
        waitHelper.waitForElement(verifyHomePage,20);
        return verifyHomePage.isDisplayed();
    }
}
