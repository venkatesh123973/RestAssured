package Restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class cookies {
    @Test
    public void cookiesvalidation(){
        RestAssured.given().body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}").when().post("https://reqres.in//api/users").then().log().all();
    }
}
