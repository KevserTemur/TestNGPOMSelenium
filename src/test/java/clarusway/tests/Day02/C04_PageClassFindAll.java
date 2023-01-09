package clarusway.tests.Day02;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C04_PageClassFindAll {
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoLoginPage lp = new SauceDemoLoginPage();
        System.out.println("lp.inputElements.size() = " + lp.inputElements.size());
        Driver.closeDriver();

    }
}
