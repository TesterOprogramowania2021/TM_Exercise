package stepsAPI;

import Utils.AllBodyTableA;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class ApiNBPsteps {
    RequestSpecification spec;

    @Before
    public void setUp() {
        spec = new RequestSpecBuilder()
                .setBaseUri("http://api.nbp.pl")
                .setBasePath("/api/exchangerates/rates/A/")
                .build();

    }


    @Given("^User sets content search parameters in URL path to \"([^\"]*)\"$")
    public void userSetsContentSearchParametersInURLPathTo(String parameter) throws Throwable {


        String body = "{\"table\":\"A\",\"currency\":\"dolar amerykański\",\"code\":\"USD\",\"rates\":[{\"no\":\"039/A/NBP/2021\",\"effectiveDate\":\"2021-02-26\",\"mid\":3.7247}]}";
        given()
                .spec(spec)
                .log()
                .all()
                .queryParam("code", parameter)
                .accept(ContentType.JSON)
                .when()
                .get(parameter)
                .then()
                .log()
                .all()
                .statusCode(200)
                .body(Matchers.equalTo(body));
    }

    @Given("^The user downloads information about all exchange rates using \"([^\"]*)\"$")
    public void theUserDownloadsInformationAboutAllExchangeRatesUsing(String table) throws Throwable {
        RestAssured.baseURI = "http://api.nbp.pl";
        RestAssured.basePath = "/api/exchangerates/tables";

        given()
                .log()
                .all()
                .accept(ContentType.JSON)
                .when()
                .get(table)
                .then()
                .log()
                .all()
                .statusCode(200)
                .body(Matchers.equalTo(AllBodyTableA.boody));

    }

    @Given("^Download using the \"([^\"]*)\" parameter$")
    public void downloadUsingTheParameter(String arg0) throws Throwable {
        RestAssured.baseURI = "http://api.nbp.pl";
        RestAssured.basePath = "/api/exchangerates/tables";

        given()
                .log()
                .all()
                .accept(ContentType.JSON)
                .when()
                .get(arg0)
                .then()
                .log()
                .all()
                .statusCode(200);


    }

    @When("^Sending a query to the server using parameters$")
    public void sendingAQueryToTheServerUsingParameters() {
    }

    @Then("^Receiving respone from the server$")
    public void receivingResponeFromTheServer() {
    }
}
