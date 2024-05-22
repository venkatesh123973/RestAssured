package Restassured;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class custompredicate {

    @Test
    public void custom() throws IOException {
        File jsonfile = new File("src/test/resources/store.json");
        Predicate predicate =new Predicate(){

            @Override
            public boolean apply(PredicateContext predicateContext) {
                boolean predicatepresent = predicateContext.item(Map.class).containsKey("isbn");
                return predicatepresent;
            }
        };
        List<Map<String,Object>> isbnpre = JsonPath.parse(jsonfile).read("$.store.book[?]",List.class,predicate);
        System.out.println(isbnpre.get(0).get("isbn"));

    }
}
