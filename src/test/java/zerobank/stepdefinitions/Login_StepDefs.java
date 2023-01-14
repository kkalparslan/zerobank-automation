package zerobank.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import zerobank.pages.LoginPage;
import zerobank.utilities.ConfigurationReader;
import zerobank.utilities.Driver;

public class Login_StepDefs {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        driver = Driver.get();
        driver.get(ConfigurationReader.get("url"));
    }

    @When("The user should be sign in")
    public void the_user_should_be_sign_in() {
        loginPage.signinMethod();
    }

    @When("The user should be able to input valid credantials")
    public void the_user_should_be_able_to_input_valid_credantials() {
        loginPage.loginMethod();
    }


    @When("The user should be navigate new url {string}")
    public void the_user_should_be_navigate_new_url(String newurl) {
        Driver.get().get(newurl);

    }

    @And("The user should be able to invalid {string} and {string}")
    public void theUserShouldBeAbleToInvalidAnd(String usname, String passwrd) {
        loginPage.username_loc.sendKeys(usname);
        loginPage.password_loc.sendKeys(passwrd);
        loginPage.submitButton_loc.click();
    }
    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
        System.out.println("expectedMessage = " + expectedMessage);
        String actualMesaj=loginPage.warningMessage_loc.getText();
        System.out.println("actualMesaj = " + actualMesaj);

        Assert.assertEquals(expectedMessage, actualMesaj);

    }
}
