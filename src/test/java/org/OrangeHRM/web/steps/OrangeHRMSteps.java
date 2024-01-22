package org.OrangeHRM.web.steps;

import io.cucumber.java.en.*;
import org.OrangeHRM.web.base.BaseTest;
import org.OrangeHRM.web.pages.HomePage;
import org.OrangeHRM.web.pages.LoginPage;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class OrangeHRMSteps extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @Given("^Browser is launched$")
    public void browser_is_launched() {
        setUp();
    }

    @And("User login {string} page is open")
    public void user_login_page_is_open(String url) {
        openPage(url);
    }

    @Then("^Verify user login page is open$")
    public void verify_user_login_page_is_open() {
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.verifyLoginPage(),"Login Page not open");
    }

    @When("^Users enters (.*) and (.*)$")
    public void users_enters_and_(String username,String password) {
       loginPage.setUsernameField(username);
       loginPage.setPasswordField(password);
    }

    @And("Click on login button")
    public void click_on_login_button() {
        homePage = new HomePage(driver);
        homePage = loginPage.setLoginButton();
    }

    @Then("verify user logged in successfully")
    public void verify_user_logged_in_successfully() {
        assertTrue(homePage.verifyHomePage(),"Home Page is not open");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        tearDown();
    }
}
