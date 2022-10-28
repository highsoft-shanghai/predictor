package ltd.highsoft.frameworks.test.mongo;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;

import static ltd.highsoft.frameworks.test.mongo.GeneralCriteria.FieldName.ID;
import static org.springframework.data.mongodb.core.query.Criteria.where;

public final class GeneralCriteria {

    private GeneralCriteria() {
    }

    public static Criteria idIs(String id) {
        return where(ID).is(id);
    }

    public static Sort.Order descById() {
        return Sort.Order.desc(ID);
    }

    public static Sort.Order descByCreatedAt() {
        return Sort.Order.desc(FieldName.CREATED_AT);
    }

    public static Sort.Order descByUpdatedAt() {
        return Sort.Order.desc(FieldName.UPDATED_AT);
    }

    public static final class FieldName {

        private FieldName() {
        }

        public static final String ID = "_id";
        public static final String CREATED_AT = "created_at";
        public static final String UPDATED_AT = "updated_at";

    }

}
