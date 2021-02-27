package Utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.sql.DriverManager;

public class BaseTest {
    @Before
    public static void setUP() {
        DriverMenager.createInstance("chrome");
        WebDriver driver = DriverMenager.getDriver();
        driver.manage().window().maximize();


    }

    @After
    public static void thearDown() throws IOException {
        DriverMenager.getDriver().quit();

    }
}
