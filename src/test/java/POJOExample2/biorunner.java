package POJOExample2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class biorunner {

    public static void main(String[] args) throws IOException {

        bio biodetails = new bio();
        biodetails.setName("Baeldung");
        biodetails.setAuthor("Eugen");
        biodetails.setArea("tech blogs");
        biodetails.setId(10);
        List<String> alltopics = Arrays.asList("Java","Kotlin","cs","Linux");
        biodetails.setTopics(alltopics);
        address addr = new address();
        addr.setCity("california");
        addr.setCountry("USA");
        biodetails.setAddress(addr);
        ObjectMapper mapper = new ObjectMapper();
        File biofile = new File("biofile.json");
        mapper.writerWithDefaultPrettyPrinter().writeValue(biofile,biodetails);

    }
}
