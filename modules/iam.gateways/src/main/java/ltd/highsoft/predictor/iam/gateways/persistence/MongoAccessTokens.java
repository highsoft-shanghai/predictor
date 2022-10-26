package ltd.highsoft.predictor.iam.gateways.persistence;

import ltd.highsoft.frameworks.persistence.mongo.MongoAggregates;
import ltd.highsoft.predictor.iam.domain.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoAccessTokens extends MongoAggregates<MongoAccessToken, AccessToken> implements AccessTokens {

    public MongoAccessTokens(MongoTemplate mongoTemplate) {
        super(mongoTemplate, MongoAccessToken.class, MongoAccessToken::new, MongoAccessToken::asDomain, AccessToken::verify);
    }

    @Override
    public void remove(AccessToken accessToken) {
        super.remove(accessToken.token());
    }

}
