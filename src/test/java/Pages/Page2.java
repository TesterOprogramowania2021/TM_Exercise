package Pages;

import Utils.DriverMenager;
import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page2 {

    @FindBy(xpath = "//select[@id='allegro.listing.sort']")
    private WebElement sortBySelect;
//    private By sortSelect = By.xpath("//select[@id='allegro.listing.sort']");


    private WebDriver driver = DriverMenager.getDriver();
    private Methods methods = new Methods(driver);


    public Page2(){
        PageFactory.initElements(driver,this);
        this.methods = methods;
    }
    public void setSortSelect(String highestPrice){
        methods.waitUntilElementVisible(sortBySelect);
        Select select = new Select( sortBySelect);
        select.selectByVisibleText(highestPrice);
    }

}
