package clarusway.tests;

import clarusway.pages.AmazonHomePageV1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day02_C03_OPTIONALPageClassV2 {

    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://amazon.com.tr");

        AmazonHomePageV1 homePage=new AmazonHomePageV1(driver);

        homePage.searchFor("modem");
        homePage.navigateToOrders();
    }
}
