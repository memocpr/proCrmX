package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "input[type='text']")
    public WebElement userInput;

    @FindBy(css = "input[type='password']")
    public WebElement passwordInput;


    @FindBy(css = "input[type='submit']")
    public WebElement loginBtn;


    public void login(String usernameStr,String passwordStr){

        userInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }

    public void loginAsHelpdesk(){

        userInput.sendKeys(ConfigurationReader.get("helpdesk_username1"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginBtn.click();

    }



}
