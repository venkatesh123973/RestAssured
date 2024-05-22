package Restassured;


import static  io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class serilization {
    @Test
    public void serili(){
        LinkedHashMap<String,Object> jsonbody= new LinkedHashMap<String,Object>();
        List<String> skill = Arrays.asList("java","script");
        jsonbody.put("firs_name","venk");
        jsonbody.put("last_name","esh");
        jsonbody.put("email","ven@gmail.com");
        jsonbody.put("skills",skill);
        System.out.println(jsonbody);

        given().baseUri("https://reqres.in/").header("Content-type","application/json").body(jsonbody).
               log().all().when().post("/api/users").then().log().all();
    }
}
