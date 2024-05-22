package Restassured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class getemployees {

    @Test
 public void getemp(){
     RestAssured.baseURI= "https://reqres.in/";

     RequestSpecification requestspe = RestAssured.given();
     Response response=requestspe.request(Method.GET,"/api/users/2");
     System.out.println(response.asPrettyString());
     System.out.println(response.statusCode());
 }
}
