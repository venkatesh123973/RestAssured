package Restassured;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import org.testng.annotations.Test;

public class blacklistheaders {

    @Test
    public void blacklist(){
        RestAssured.given().config(RestAssuredConfig.config().logConfig(LogConfig.logConfig().blacklistHeader("Accept"))).
                baseUri("https://reqres.in/").log().all().when().get("/api/users/2").prettyPrint();

    }
}
