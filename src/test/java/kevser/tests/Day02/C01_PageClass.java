package clarusway.tests.Day02;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class C01_PageClass {
//    Navigate to https://www.saucedemo.com/
//    Enter the user name as standard_user
//    Enter the password as secret_sauce
//    Click on login button.
//    - Choose price low to high with soft Assert.
//    - Verify item prices are sorted from low to high with hard Assert.

    @Test
    public void test() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        WebElement username = Driver.getDriver().findElement(By.id("user-name"));
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        WebElement loginButton = Driver.getDriver().findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        Select select = new Select(Driver.getDriver().findElement(By.className("product_sort_container")));
        select.selectByValue("lohi");
        List<WebElement> itemPrices = Driver.getDriver().findElements(By.className("inventory_item_price"));
        itemPrices.forEach(x-> System.out.println(x.getText()));
        List<Double> urunFiyatlari = itemPrices.stream().map(x-> x.getText().substring(1)).
                map(x->Double.parseDouble(x)).collect(Collectors.toList());
        System.out.println("urunFiyatlari = " + urunFiyatlari);
        for (int i = 0; i < urunFiyatlari.size()-1; i++) {
            Assert.assertTrue(urunFiyatlari.get(i) <= urunFiyatlari.get(i+1));
        }
        Driver.closeDriver();


    }
}
