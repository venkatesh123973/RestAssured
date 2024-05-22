package JSONserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.Arrays;
import java.util.List;

public class Jsonserializecustom {
    public static void main(String[] args) throws JsonProcessingException {
        JSONserlist ser = new JSONserlist();
        ser.setFirstName("venkat");
        ser.setLastName("esh");
        List<String> skillslatest = Arrays.asList("Java", "Selenium");
        ser.setSkills(skillslatest);
        device dev = new device();
        dev.setLaptop("HP");
        dev.setMobile("Iphone");
        ser.setDevices(dev);

        ObjectMapper mapper = new ObjectMapper();
//        SimpleModule simpleModule = new SimpleModule();
//
//        simpleModule.addSerializer(JSONserlist.class,new customser());
//        mapper.registerModule(simpleModule);
       String serialize=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ser);
        System.out.println(serialize);
    }

}
