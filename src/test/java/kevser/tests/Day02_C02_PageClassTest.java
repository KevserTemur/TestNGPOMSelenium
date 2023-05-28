package clarusway.tests;

import clarusway.pages.SauceDemoHomePage;
import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C02_PageClassTest {

    @Test
    public void test() {

        // Navigate to https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage loginPage=new SauceDemoLoginPage();

        loginPage.txtUsername.sendKeys("standard_user");
        loginPage.txtPassword.sendKeys("secret_sauce");
        loginPage.btnLogin.click();

        SauceDemoHomePage homePage=new SauceDemoHomePage();

        Select select=new Select(homePage.filterDropdown);
        select.selectByValue("lohi");

        homePage.products.forEach(x-> System.out.println(x.getText()));

        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));

        Driver.closeDriver();
    }
}
