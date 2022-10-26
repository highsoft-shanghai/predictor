package ltd.highsoft.predictor;

import ltd.highsoft.frameworks.application.spring.ApplicationSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationSpringConfiguration.class)
public class PredictorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredictorApplication.class, args);
    }

}
