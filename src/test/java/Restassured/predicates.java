package Restassured;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class predicates {
    File jsonfile = new File("src/test/resources/store.json");

    public  void inlinepredicates() throws IOException {
        List<Object> pre=JsonPath.parse(jsonfile).read("$.store.book[?(@.price<10 && @.category=='fiction')]");
        System.out.println(pre);
    }
    public static void main(String[] args) throws IOException {
        predicates pre1=new predicates();
        pre1.inlinepredicates();
    }
}
