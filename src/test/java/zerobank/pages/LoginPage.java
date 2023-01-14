package zerobank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import zerobank.utilities.ConfigurationReader;
import zerobank.utilities.Driver;

public class LoginPage extends BasePage{



    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement username_loc;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement password_loc;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    public WebElement submitButton_loc;

    public void loginMethod(){
        //String username=ConfigurationReader.get("userName");
        //String password=ConfigurationReader.get("passWord");

        username_loc.sendKeys(ConfigurationReader.get("userName"));
        password_loc.sendKeys(ConfigurationReader.get("passWord"));
        submitButton_loc.click();
    }

    @FindBy(css = ".alert.alert-error")
    public WebElement warningMessage_loc;


}
