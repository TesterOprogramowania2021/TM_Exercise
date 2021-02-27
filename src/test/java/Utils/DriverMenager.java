package Utils;

import Utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class DriverMenager {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return webDriver.get();
    }
    public static void setWebDriver(WebDriver driver){
        webDriver.set(driver);
    }
    public static void createInstance(String browserName){

        setWebDriver(DriverFactory.createWebdriverInstance(browserName));
    }
}
