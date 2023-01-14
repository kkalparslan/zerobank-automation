package zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import zerobank.utilities.Driver;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy(css = "#aa_accountId")
    public WebElement dropDownElement_loc;

    @FindBy(xpath = "//table//tr//th")
    public List<WebElement> rowHeader_loc;

    public void navigateToAccountMtd(String account){
        Driver.get().findElement(By.linkText(account)).click();
    }


}
