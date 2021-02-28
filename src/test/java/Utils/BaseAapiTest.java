package Utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Before;


public class BaseAapiTest {
    protected RequestSpecification reqSpec;
    protected ResponseSpecification respSpec;

    public void setUp(){
        reqSpec = new RequestSpecBuilder().setBaseUri("http://api.nbp.pl")
                                            .setBasePath("api/exchangerates/tables/A")
                                            .setContentType(ContentType.JSON)
                                            .build();
        respSpec = new ResponseSpecBuilder().expectStatusCode(200)
                                            .expectContentType(ContentType.JSON)
                                            .build();
        RequestLoggingFilter reqLog = new RequestLoggingFilter();
        ResponseLoggingFilter respLog = new ResponseLoggingFilter();
        RestAssured.filters(reqLog,respLog);
    }

}
