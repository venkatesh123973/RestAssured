package complexPOJO;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class storerunner {

    public static void main(String[] args) throws IOException {

        bicycle bicyc = new bicycle();
        bicyc.setColor("red");
        bicyc.setPrice(19.95);
       List<book> allbooks = new ArrayList<>();
        book bo1 = new book();
        bo1.setCategory("reference");
        bo1.setAuthor("Nigel Rees");
        bo1.setTitle("Sayings of the Century");
        bo1.setPrice(8.98);
        allbooks.add(bo1);
        book bo2 = new book();
        bo2.setCategory("fiction");
        bo2.setAuthor("Evelyn Waugh");
        bo2.setTitle("Sword of Honour");
        bo2.setPrice(12.98);
        allbooks.add(bo2);
        store st= new store();
        st.setExpensive(10);
        st.setBicycle(bicyc);
        st.setBooks(allbooks);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        File superfile = new File("complex.json");
        mapper.writerWithDefaultPrettyPrinter().writeValue(superfile,st);

    }
}
