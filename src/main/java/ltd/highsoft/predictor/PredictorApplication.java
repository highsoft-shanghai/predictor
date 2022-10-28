package ltd.highsoft.predictor;

import com.github.cloudyrock.spring.v5.EnableMongock;
import ltd.highsoft.frameworks.application.spring.ApplicationSpringConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableMongock
@Import(ApplicationSpringConfiguration.class)
public class PredictorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredictorApplication.class, args);
    }

}
