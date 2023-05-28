package clarusway.tests.Day01_DriverExample;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class deneme {
    @Test
    public void testName() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://n11.com");
        WebElement cookieAccept = driver.findElement(By.cssSelector("div.banner__accept-button"));
        cookieAccept.click();
        driver.quit();
    }
}
