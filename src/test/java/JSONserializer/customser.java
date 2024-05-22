package JSONserializer;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class customser extends StdSerializer<JSONserlist> {
    public customser(Class<JSONserlist> t) {
        super(t);
    }

    public customser() {
        this(null);
    }
//
//    public customser(Class <JSONserlist> t){
//    super(t);
//    }

    @Override
    public void serialize(JSONserlist jsoNserlist,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("firstName",jsoNserlist.getFirstName());
        jsonGenerator.writeStringField("lastName",jsoNserlist.getLastName());
        jsonGenerator.writeEndObject();


    }

//    public customser(){
//         this(null);
//    }
}
