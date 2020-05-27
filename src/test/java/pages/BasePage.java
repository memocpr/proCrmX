package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {





    @FindBy(css = "pagetitle-item")
    protected WebElement pageSubtitle;

    @FindBy(css = "#user-name")
    protected WebElement username;

    @FindBy(xpath = "//span[.='Log out']")
    protected WebElement logout;

    @FindBy(xpath = "//span[.='My Profile']")
    protected WebElement myProfile;


    public BasePage(){ PageFactory.initElements(Driver.get(),this); }


    public String getPageName(){

        return pageSubtitle.getText();
    }




}
