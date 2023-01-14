package zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(css = ".board-header")
    public List<WebElement> accountTypes_loc;

    @FindBy(xpath = "(//table)[3]//th")
    public List<WebElement> creditAccountColumn_loc;


}
