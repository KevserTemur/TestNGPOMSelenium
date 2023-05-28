package clarusway.tests;

import clarusway.pages.HtmlGoodiesHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day02_C03_PageClassExample {

    @Test
    public void test() {

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        HtmlGoodiesHomePage hp= new HtmlGoodiesHomePage();

        Actions actions=new Actions(Driver.getDriver());

        actions.dragAndDrop(hp.copenhag, hp.Denmark)
                .dragAndDrop(hp.seoul, hp.Korea)
                .dragAndDrop(hp.washington,hp.Usa)
                .dragAndDrop(hp.rome,hp.Italy)
                .dragAndDrop(hp.madrid,hp.Spain)
                .dragAndDrop(hp.oslo,hp.Norway)
                .dragAndDrop(hp.stockholm,hp.Sweden)
                .perform();
    }
}
