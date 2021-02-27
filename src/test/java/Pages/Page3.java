package Pages;

import Utils.DriverMenager;
import Utils.Methods;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 {

    @FindBy(xpath = "//h4[@class='_18vat _9a071_U7GFO _1djie']")
    private WebElement iphoneNameText;

    private WebDriver driver = DriverMenager.getDriver();
    private Methods methods = new Methods(driver);
    private Logger log = Logger.getLogger(Page3.class);

    public Page3() {
        PageFactory.initElements(driver, this);
        this.methods = methods;
    }
    public String getTextNameIphone(){
        log.info("Get the title of an advertisement as text");
        methods.waitUntilElementVisible(iphoneNameText);
        String text2 = iphoneNameText.getText();
        return text2;

    }
}
