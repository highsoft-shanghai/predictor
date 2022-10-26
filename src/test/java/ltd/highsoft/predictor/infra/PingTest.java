package ltd.highsoft.predictor.infra;

import ltd.highsoft.frameworks.test.web.PathVariables;
import ltd.highsoft.predictor.IntegrationTest;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.hamcrest.Matchers.is;

public class PingTest extends IntegrationTest {

    @Test
    void should_ping_success() {
        post("/test/ping", PathVariables.variables(Map.of()), Map.of("ping", "pong"), null)
            .statusCode(is(200)).body("pong", is("pong"));
    }

}
