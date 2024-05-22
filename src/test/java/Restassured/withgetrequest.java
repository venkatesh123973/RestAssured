package Restassured;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class withgetrequest {

    RequestSpecification requestSpecification;
   @BeforeSuite
    public void withRequest(){
        requestSpecification = given().baseUri("https://reqres.in/").basePath("/api/users/");
    }


    @Test
    public void usingwithrequest(){

        ValidatableResponse response=given().spec(requestSpecification).when().get("2").then().log().all();
    }
}
