package Restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class jsonanygetterserializer {
    public static void main(String[] args) throws JsonProcessingException {
        JSONGetter getter = new JSONGetter();
        Map<String,Object> serializevalues = new HashMap<String,Object>();
        serializevalues.put("firstName","Venkat");
        serializevalues.put("lastName","Esh");
        serializevalues.put("email","g@gmail.com");
        serializevalues.put("skills", Arrays.asList("java","selenium"));

        getter.setEmp(serializevalues);

        ObjectMapper mapper = new ObjectMapper();
        String serival=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getter);
        System.out.println(serival);
    }

}
