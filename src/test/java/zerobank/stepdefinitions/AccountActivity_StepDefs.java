package zerobank.stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import zerobank.pages.AccountActivityPage;
import zerobank.pages.AccountSummaryPage;
import zerobank.utilities.BrowserUtils;

import java.util.Arrays;
import java.util.List;

public class AccountActivity_StepDefs {
    AccountActivityPage accountActivityPage=new AccountActivityPage();
    @When("The user should navigate to {string}")
    public void the_user_should_navigate_to(String accountType) {
        accountActivityPage.navigateToAccountMtd(accountType);
    }
    @When("The user should see the {string} as default type")
    public void the_user_should_see_the_as_default_type(String expectedOption) {
        Select select=new Select(accountActivityPage.dropDownElement_loc);
        String actualOption=select.getFirstSelectedOption().getText();
        System.out.println("expectedOption = " + expectedOption);
        System.out.println("actualOption = " + actualOption);
        Assert.assertEquals(expectedOption, actualOption);
    }
    @When("The user should be see the following Accounts")
    public void the_user_should_be_see_the_following_accounts(List<String>expectedAccountTypes) {
        Select select=new Select(accountActivityPage.dropDownElement_loc);
        //List<WebElement>options=select.getOptions();
        List<WebElement> actual=select.getOptions();
        List<String>actualAccountTypes=BrowserUtils.getElementsText(actual);
        System.out.println("expectedAccountTypes = " + expectedAccountTypes);
        System.out.println("actualAccountTypes = " + actualAccountTypes);


//        boolean match=false;
//        for (WebElement option:options){
//            System.out.println("option.getText() = " + option.getText());
//            for (int i = 0; i < expectedAccountTypes.size(); i++) {
//                if (option.getText().equals(expectedAccountTypes.get(i))){
//                    match=true;
//                }
//            }
//            Assert.assertTrue(match);
//        }
    }
    @When("The user should be see the following options")
    public void the_user_should_be_see_the_following_options(List<String>expectedOptions) {
        List<String>actualOptions= BrowserUtils.getElementsText(accountActivityPage.rowHeader_loc);
        System.out.println("expectedOptions = " + expectedOptions);
        System.out.println("actualOptions = " + actualOptions);
        Assert.assertEquals(expectedOptions, actualOptions);

    }
}
