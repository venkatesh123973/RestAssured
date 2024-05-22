package Restassured;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.Arrays;

public class employeeaddpojo {

    @Test
    public void addemployee() throws JsonProcessingException {
        POJO addemp = new POJO();
        addemp.setFirstname("venk");
        addemp.setLastname("esh");
        addemp.setEmail("gh@gmail.com");
        addemp.setSkills(Arrays.asList("java","jscript"));

        System.out.println(addemp.getFirstname());
        System.out.println(addemp.getLastname());
        System.out.println(addemp.getEmail());
        System.out.println(addemp.getSkills());

        ObjectMapper mapper = new ObjectMapper();
        String emp =mapper.writerWithDefaultPrettyPrinter().writeValueAsString(addemp);
        System.out.println(emp);
    }
}
