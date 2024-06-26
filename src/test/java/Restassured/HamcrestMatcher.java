package Restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class HamcrestMatcher {

    @Test
    public void HamcrestMatchervalidation(){

        RestAssured.given().baseUri("https://reqres.in/").when().get("/api/users/2")
                .then().body("data.id",equalTo(2)).body("data.email",startsWith("j")).
                body("data.first_name",equalToIgnoringCase("Janet")).
                body("data.last_name",is(notNullValue())).
                body("support",hasKey("text")).assertThat().statusCode(200);
    }
}
