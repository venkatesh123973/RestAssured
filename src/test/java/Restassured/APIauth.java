package Restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class APIauth {
    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
    @Test
    public void APIauthvalidation() {
        given().queryParam("city", "California").queryParam("appid","16bc0bd97f6c0439d77f31fa6aa7ff94").
                when().get("https://api.openweathermap.org/data/2.5/weather").then().log().body();
    }

}