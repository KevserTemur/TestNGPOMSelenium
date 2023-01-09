package clarusway.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPageV1 {
    private WebDriver ldriver;

    public AmazonPageV1(WebDriver ldriver) {
        this.ldriver = ldriver;
        PageFactory.initElements(ldriver , this);
    }
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement accountAndList;

    @FindBy(css = "#nav_prefetch_yourorders span")
    private WebElement orders;

    public void writeSearchBox(String text){
        searchBox.sendKeys(text + Keys.ENTER);
    }
    public void navigateOrders(){
        Actions actions = new Actions(ldriver);
        actions.moveToElement(accountAndList).perform();
        WebDriverWait wait = new WebDriverWait(ldriver , Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(orders)).click();
    }
}

