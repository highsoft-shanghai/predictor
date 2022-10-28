package ltd.highsoft.predictor.test.persistence;

import ltd.highsoft.frameworks.test.mongo.GeneralCriteria;
import ltd.highsoft.predictor.IntegrationTest;
import ltd.highsoft.predictor.ping.Pong;
import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.mongodb.core.query.Query.query;

public class PongTest extends IntegrationTest {

    private @Resource MongoTemplate mongoTemplate;

    @Test
    void should_return_pong_when_ping() {
        Pong pong = mongoTemplate.findOne(query(GeneralCriteria.idIs("ping")), Pong.class);
        assertNotNull(pong);
        assertEquals("pong", pong.getPong());
    }

}
