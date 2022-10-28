package ltd.highsoft.predictor.ping;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class Pong {

    private @Id final String id;
    private final String pong;

    public Pong(String id, String pong) {
        this.id = id;
        this.pong = pong;
    }

}
