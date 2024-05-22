package Restassured;

import static io.restassured.RestAssured.*;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

public class schemavalidation {
   @Test (enabled = false)
   public void schemavalidationusingschemaclass(){
      File inputfile =new File("src/test/resources/input.json");
       given().baseUri("https://reqres.in/")
               .header("Content-type","application/json").body(inputfile).when()
               .post("/api/users").then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("inputschema.json"));
   }

   @Test
   public void schemavalidationmatchesjsonschema(){
       File inputfile =new File("src/test/resources/input.json");
       File inputschema = new File ("src/test/resources/inputschema.json");

       given().baseUri("https://reqres.in/")
               .header("Content-type","application/json").body(inputfile).when()
               .post("/api/users").then().body(JsonSchemaValidator.matchesJsonSchema(inputschema));
   }
}
