package zerobank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zerobank.utilities.Driver;

public class BasePage {
    WebDriver driver;
    public BasePage(){

        PageFactory.initElements(Driver.get(), this);

    }
    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButton_loc;

    public void signinMethod(){
        signinButton_loc.click();
    }
}
