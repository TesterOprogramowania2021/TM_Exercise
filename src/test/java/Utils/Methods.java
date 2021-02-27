package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Methods {

    private WebDriver driver = DriverMenager.getDriver();

    public Methods(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntilElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementVisibleBy(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf((WebElement) element));
    }

    public void waitUntilElementClicable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waintUntilListVisible(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(driver -> elementList.size() > 0);

    }

    public void waitUntilElementClicableBy(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void moveToElementByJsEx(WebElement elment) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elment);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void scrolDown() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("javascript:window.scrollBy(250,350)");
    }

    public void clickByJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}