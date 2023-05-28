package clarusway.tests.Day02;

import clarusway.pages.AmazonHomePageV1;
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
        AmazonHomePageV1 ap = new AmazonHomePageV1(driver);


        driver.close();


    }
}
