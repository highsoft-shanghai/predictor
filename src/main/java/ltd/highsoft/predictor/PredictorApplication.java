package ltd.highsoft.predictor;

import io.mongock.runner.springboot.EnableMongock;
import ltd.highsoft.frameworks.application.spring.ApplicationSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationSpringConfiguration.class)
@EnableMongock
public class PredictorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredictorApplication.class, args);
    }

}
