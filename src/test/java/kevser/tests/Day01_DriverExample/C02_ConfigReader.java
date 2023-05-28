package clarusway.tests.Day01_DriverExample;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigReader {
    @Test
    public void readConfig() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();
    }
}
