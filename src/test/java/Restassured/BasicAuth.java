package Restassured;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BasicAuth {
    @Test
    public void authvalidation(){
     given().auth().basic("postman","password").baseUri("https://postman-echo.com/").when().get("basic-auth").prettyPrint();


    }
}
