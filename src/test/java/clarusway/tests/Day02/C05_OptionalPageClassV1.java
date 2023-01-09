package clarusway.tests.Day02;

import clarusway.pages.AmazonPageV1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C05_OptionalPageClassV1 {
    @Test
    public void testName() {
        //Driver objemiz static değil ise page classımızda kullanmak adına cons kullanırız
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amazon.com");
        AmazonPageV1 ap = new AmazonPageV1(driver);
        ap.writeSearchBox("modem");

        ap.navigateOrders();

        driver.close();


    }
}
