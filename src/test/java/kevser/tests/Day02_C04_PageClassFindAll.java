package clarusway.tests;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static clarusway.utilities.Driver.getDriver;

public class Day02_C04_PageClassFindAll {


    @Test
    public void test(){

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.saucedemo.com/");

        SauceDemoLoginPage lp = new SauceDemoLoginPage();

        Assert.assertEquals(3, lp.inputElements.size());

        Driver.closeDriver();
    }



}
