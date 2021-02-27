package steps;

import Pages.Page1;
import Utils.BaseTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
    public void cossd(){

    }
    @And("The user selects the first product from the list")
    public void coss2d(){

    }
    @Then("The user verifies whether the name in the offer matches the name of the first item on the list")

        public void coss2d2(){
        System.out.println("cos");
        }
    }


