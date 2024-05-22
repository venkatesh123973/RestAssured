package Restassured;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.*;
import java.util.List;

public class readjsonpath {


    public static void readjson() throws IOException {
      File jsonfile = new File("src/test/resources/store.json");
        List<Object> output=JsonPath.read(jsonfile,"$..price");
        System.out.println(output);

        for (Object pricelist:output
             ) {
            System.out.println(pricelist);
        }
    }

    public static void readjson2() throws IOException {
        InputStream jsonfile = new FileInputStream("src/test/resources/store.json");
        Object parseddoc=Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());
        List<Object> output=JsonPath.read(parseddoc,"$..price");
        System.out.println(output);

        for (Object pricelist:output
        ) {
            System.out.println(pricelist);
        }
    }

    public static void readjson3() throws FileNotFoundException {
        InputStream jsonfile = new FileInputStream("src/test/resources/store.json");
        DocumentContext context=JsonPath.parse(jsonfile);
        List<Object> price=context.read("$..price");
        System.out.println(price);
    }
    public static void main(String[] args) throws IOException {
     readjson();
        readjson2();
        readjson3();
    }
}
