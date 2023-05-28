package clarusway.tests.Day02;

import clarusway.pages.HtmlGoodiesHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C03_PageClass {
//    Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
//    Fill in capitals by country.

    @Test
    public void testName() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        HtmlGoodiesHomePage homePage = new HtmlGoodiesHomePage();
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(homePage.Rome, homePage.Italy)
                .dragAndDrop(homePage.Seoul, homePage.SouthKorea)
                .dragAndDrop(homePage.Copenhag, homePage.Denmark)
                .dragAndDrop(homePage.Madrid, homePage.Spain)
                .dragAndDrop(homePage.Oslo, homePage.Norway)
                .dragAndDrop(homePage.Stockholm, homePage.Sweden)
                .dragAndDrop(homePage.Washington, homePage.UnitedStades)
                .perform();


    }
}