package ltd.highsoft.frameworks.application.spring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import ltd.highsoft.frameworks.domain.core.ValueSink;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class ValueSinkSerializer extends JsonSerializer<ValueSink> {

    @Override
    public void serialize(ValueSink value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeObject(value.toMap());
    }

}
