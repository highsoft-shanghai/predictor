package db.migration;

import io.mongock.api.annotations.*;
import ltd.highsoft.predictor.ping.Pong;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeUnit(id = "V202109251646", order = "V202109251646", author = "Neil Wang")
public class V202109251646PongInitialChange {

    @Execution
    public void changeSet(MongoTemplate mongoTemplate) {
        mongoTemplate.save(new Pong("ping", "archegos"));
    }

}
