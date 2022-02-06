package software.sigma.training.po.survey.data.domain.transformer;

import java.util.Map;

public interface EntityTransformer<T> {
    T transform(Map<String, String> csvData);
}
