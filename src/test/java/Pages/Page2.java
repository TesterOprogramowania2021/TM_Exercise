package Pages;

import Utils.DriverMenager;
import Utils.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page2 {


    private By sortSelect = By.xpath("//select[@id='allegro.listing.sort']");


    private WebDriver driver = DriverMenager.getDriver();
    private Methods methods = new Methods(driver);


    public Page2(){
        PageFactory.initElements(driver,this);
        this.methods = methods;
    }
    public void setSortSelect(){
        methods.waitUntilElementClicableBy();
    }
}
