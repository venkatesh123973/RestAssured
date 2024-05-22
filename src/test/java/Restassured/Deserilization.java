package Restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import org.testng.annotations.Test;

public class Deserilization {

   String json = "{\n" +
           "  \"firstname\" : \"venk\",\n" +
           "  \"lastname\" : \"esh\",\n" +
           "  \"email\" : \"gh@gmail.com\",\n" +
           "  \"skills\" : [ \"java\", \"jscript\" ]\n" +
           "}";
   @Test
   public void deser() throws JsonProcessingException {
       ObjectMapper mapper =new ObjectMapper();
       POJO deserilizationpojo=mapper.readValue(json,POJO.class);
       System.out.println(deserilizationpojo.getFirstname());
       System.out.println(deserilizationpojo.getLastname());
       System.out.println(deserilizationpojo.getEmail());
       System.out.println(deserilizationpojo.getSkills());
   }
   @Test
   public void usingJsonpath(){
       JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
       Configuration configuration=Configuration.builder().mappingProvider(mappingProvider).build();
       POJO context=JsonPath.using(configuration).parse(json).read("$",POJO.class);
       System.out.println(context.getFirstname());
       System.out.println(context.getLastname());
       System.out.println(context.getEmail());
       System.out.println(context.getSkills());
   }
}
