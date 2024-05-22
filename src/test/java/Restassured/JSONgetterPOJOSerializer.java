package Restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONgetterPOJOSerializer {

    public static void main(String[] args) throws JsonProcessingException {
        JSONgetterPOJO jsoNgetterPOJO = new JSONgetterPOJO();
        jsoNgetterPOJO.setId(10);
        jsoNgetterPOJO.setFirstName("venk");
        jsoNgetterPOJO.setLastName("esh");
        jsoNgetterPOJO.setEmail("g@gmail.com");

        ObjectMapper mapper = new ObjectMapper();
        String value =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsoNgetterPOJO);
        System.out.println(value);
}}
