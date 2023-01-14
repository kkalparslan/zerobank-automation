package zerobank.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import zerobank.pages.AccountSummaryPage;
import zerobank.utilities.BrowserUtils;
import zerobank.utilities.Driver;

import java.util.List;

public class AccountSummary_StepDefs {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @When("The {string} page should be displayed")
    public void the_page_should_be_displayed(String expectedTitle) {
        String actualTitle= Driver.get().getTitle();
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Then("The user should see different Account Types")
    public void the_user_should_see_different_account_types(List<String>expectedAccounts) {
        List<String>actualAccounts= BrowserUtils.getElementsText(accountSummaryPage.accountTypes_loc);
        System.out.println("expectedAccounts = " + expectedAccounts);
        System.out.println("actualAccounts = " + actualAccounts);
        Assert.assertEquals(expectedAccounts, actualAccounts);
    }
    @Then("Credit Account table should have following columns")
    public void credit_account_table_should_have_following_columns(List<String> expectedColumns) {
        List<String> actualColmuns=BrowserUtils.getElementsText(accountSummaryPage.creditAccountColumn_loc);
        System.out.println("expectedColumns = " + expectedColumns);
        System.out.println("actualColmuns = " + actualColmuns);
        Assert.assertEquals(expectedColumns, actualColmuns);
    }

}
