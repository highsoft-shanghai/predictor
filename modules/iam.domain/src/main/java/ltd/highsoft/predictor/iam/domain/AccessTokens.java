package ltd.highsoft.predictor.iam.domain;

import java.util.Optional;

public interface AccessTokens {

    Optional<AccessToken> getOptional(String id);

    void add(AccessToken accessToken);

    void remove(AccessToken accessToken);

}
