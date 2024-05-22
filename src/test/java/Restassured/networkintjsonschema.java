package Restassured;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class networkintjsonschema {
    @Test
    public void validateschema() throws IOException {

        ObjectMapper map = new ObjectMapper();
        JsonSchemaFactory json =JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
        File inputfile =new File("src/test/resources/input.json");
        InputStream strea = new FileInputStream("src/test/resources/inputschema.json");
        JsonNode node=map.readTree(inputfile);
        JsonSchema schema= json.getSchema(strea);
        Set<ValidationMessage> result =schema.validate(node);
        if(result.isEmpty()){
            System.out.println("Validation message is not empty");
        }

        else {
            for (ValidationMessage val:result
                 ) {
                System.out.println("value"+val);
            }
        }

    }
}
