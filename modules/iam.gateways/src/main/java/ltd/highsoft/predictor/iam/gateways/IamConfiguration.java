package ltd.highsoft.predictor.iam.gateways;

import ltd.highsoft.frameworks.security.core.ContextProvider;
import ltd.highsoft.predictor.iam.domain.*;
import org.springframework.context.annotation.*;

@Configuration
public class IamConfiguration {

    @Bean
    public ContextProvider contextProvider(AccessTokens accessTokens) {
        return new AccessTokenContextProvider(accessTokens);
    }

}
