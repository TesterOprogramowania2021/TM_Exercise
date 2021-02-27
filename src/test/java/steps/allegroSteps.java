package steps;

import Pages.Page1;
import Pages.Page2;
import Pages.Page3;
import Utils.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class allegroSteps {




    @Before
    public void setUP(){
        System.out.println("Open and set browser");
        BaseTest.setUP();
    }
    @Given("The user enters the given URL  https://allegro.pl")
    public void userSetAllegroURL(){
        Page1 page1 = new Page1();
        page1.getAllegroMainPage();

    }
    @When("The user enters the iphon item in the search field and clicks the search button")
    public void userSetItemAndSearch(){
        Page1 page1 = new Page1();
        page1.acceptPrivatyInfo();
        page1.setSearchItemAndFind("iphone");

    }
    @And("The user selects the search criteria")
    public void userSelectSortPrice() throws InterruptedException {
        Page2 page2 = new Page2();
        page2.setSortSelect("cena: od najwyższej");
        page2.setCheckboxSecendHendItem();

    }
    @And("The user selects the first product from the list")
    public void userClickCheckboxSecendHand(){
        Page2 page2 = new Page2();
        page2.choseFirstElementFromList();

    }
    @Then("The user verifies whether the name in the offer matches the name of the first item on the list")

    public void assertIphonName(){
        Page3 page3 = new Page3();
        String TX = "Smartfon Apple iPhone XS Max 4 GB / 64 GB czarny";
        String textIphon = page3.getTextNameIphone();
        Assert.assertEquals(TX,textIphon);

        }

    @After
    public void thearDown() throws IOException {
        System.out.println("Quit all open pages");
        BaseTest.thearDown();
    }
    }


