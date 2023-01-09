package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoLoginPage {

    //initElements methodu Page Class i initialize etmek adina kullanılır
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver() , this);
    }
    /*
    @FindBy anatosyanu elementleri locate ederken kullandığımız ve
    initElements methodu ile elementlerin bulunmasını sağlayan bir annotation dur.
     */
    @FindBy (id = "user-name")
    public WebElement txtUsername;
    @FindBy(id = "password")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id ='login-button']")
    public WebElement btnLogin;
    @FindAll({
            @FindBy(id = "user-name"),
            @FindBy(id = "password"),
            @FindBy(id = "login-button")
    })
    public List<WebElement> inputElements;


}