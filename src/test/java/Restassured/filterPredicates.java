package Restassured;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.*;
import java.util.List;

public class filterPredicates {
    InputStream jsonfile;

    {
        try {
            jsonfile = new FileInputStream("src/test/resources/store.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Object parseddoc;

    {
        try {
            parseddoc = Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void filpredicates() throws IOException {
//        File jsonfile = new File("src/test/resources/store.json");
       Filter priceless= Filter.filter(Criteria.where("price").lt(10));
        List<Object> filpre=JsonPath.parse(parseddoc).read("$.store.book[?]",priceless);
        System.out.println(filpre);
    }
    @Test
    public void categoryfilter(){
        Filter priceless1=Filter.filter(Criteria.where("price").lt(10).and("category").eq("fiction"));
        List<Object> filpre1=JsonPath.parse(parseddoc).read("$.store.book[?]",priceless1);
        System.out.println(filpre1);
    }
}
