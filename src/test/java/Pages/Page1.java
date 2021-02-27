package Pages;

import Utils.DriverMenager;
import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

    private By buttonAccept = By.xpath("//button[text()='Ok, zgadzam się']");
    private By inputSearch = By.xpath("//input[contains(@name,'string') and contains(@role,'combobox')]");
    private By buttonSearch = By.xpath("//button[@class='_13q9y _8tsq7 _1q2ua mr3m_0 mli2_0 mh85_0 mh85_56_m msbw_0 mtag_0 _d25db_3gMDr']");

    private WebDriver driver = DriverMenager.getDriver();
    private Methods methods = new Methods(driver);


    public Page1(){
        PageFactory.initElements(driver,this);
        this.methods = methods;
    }
    public void getAllegroMainPage(){
        driver.get("https://allegro.pl");
    }
    public void acceptPrivatyInfo(){
        methods.waitUntilElementClicableBy(buttonAccept);
        driver.findElement(buttonAccept).click();

    }
    public void setSearchItemAndFind(String item){
        methods.waitUntilElementClicableBy(inputSearch);
        driver.findElement(inputSearch).clear();
        driver.findElement(inputSearch).sendKeys(item);
        methods.waitUntilElementClicableBy(buttonSearch);
        driver.findElement(buttonSearch).click();
    }


}
