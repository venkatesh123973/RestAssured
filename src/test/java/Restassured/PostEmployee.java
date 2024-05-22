package Restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostEmployee {

    @Test
    public void postEmployee(){

        RestAssured.baseURI = "https://reqres.in/";

        RequestSpecification postreq = RestAssured.given().body("{\n" +
                "    \"name\": \"morpheusking\",\n" +
                "    \"job\": \"leadership\"\n" +
                "}");
        Response respone=postreq.request(Method.POST,"/api/users");
        System.out.println(respone.statusCode());
        System.out.println(respone.asPrettyString());
    }
}
