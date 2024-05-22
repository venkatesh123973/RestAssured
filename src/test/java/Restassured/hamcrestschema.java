package Restassured;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class hamcrestschema {

    @Test
    public void hamcrestvalidate() throws IOException {
        File inputfile =new File("src/test/resources/input.json");
        File inputschema = new File ("src/test/resources/inputschema.json");
        String input=FileUtils.readFileToString(inputfile);
        MatcherAssert.assertThat(input, JsonSchemaValidator.matchesJsonSchema(inputschema));
    }
}
