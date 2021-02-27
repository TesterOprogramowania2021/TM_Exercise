package Pages;

import Utils.DriverMenager;
import Utils.Methods;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Page2 {

    @FindBy(xpath = "//select[@id='allegro.listing.sort']")
    private WebElement sortBySelect;
    @FindBy(xpath = "//span[text()='używane']")
    private WebElement checboxSecendHand;
    @FindBy(xpath = "//section/article/*[1]")
    private WebElement  firstIphoneFromList;
    @FindBy(xpath ="/html/body/div[2]/div[4]/div/div/div/div/div/div[2]/div[1]/div[5]/div/div/div/div[2]/div/section[1]/article[1]/div/div[2]/div[1]/h2/a" )
    private WebElement firstElementText;

    private WebDriver driver = DriverMenager.getDriver();
    private Methods methods = new Methods(driver);
    private Logger log = Logger.getLogger(Page2.class);


    public Page2() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }

    public void setSortSelect(String highestPrice) {
        log.info("Choosing a search criteria from selecta");
        methods.waitUntilElementVisible(sortBySelect);
        Select select = new Select(sortBySelect);
        select.selectByVisibleText(highestPrice);
//        methods.refreshPage();
    }

    public void setCheckboxSecendHendItem() throws InterruptedException {
        log.info("Marking the checkbox about the criterion used");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        methods.scrolDown();
        methods.waitUntilElementClicable(checboxSecendHand);
        methods.clickByJs(checboxSecendHand);

    }

    public void choseFirstElementFromList(){
        log.info("Selecting the first iPhone from the list");
        methods.refreshPage();
        methods.waitUntilElementVisible(firstIphoneFromList);
        methods.waitUntilElementVisible(firstIphoneFromList);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        firstIphoneFromList.click();

    }

}
