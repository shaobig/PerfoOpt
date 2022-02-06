package software.sigma.training.po.survey.services.transform;

import java.util.Map;

public class TransformerFactoryImpl implements TransformerFactory {

    private static final Transformer<String> STRING_TRANSFORMER = Map::get;

    private static final Transformer<?> EMPTY_TRANSFORMER = (Transformer<Object>) (source, propertyName) -> null;

    private final Configuration configuration;
    
    public TransformerFactoryImpl(Configuration configuration) {
        this.configuration = configuration;
    }
    
    @Override
    public <T> Transformer<T> getTransformer(Class<T> clazz) {
        if (String.class.equals(clazz)) {
            return (Transformer<T>) STRING_TRANSFORMER;
        }
        if (configuration.getConfiguredClasses().contains(clazz)) {
            return new MapToBeanTransformer<>(this, configuration.getConfiguration(clazz), clazz);
        }

        return (Transformer<T>) EMPTY_TRANSFORMER;
    }

}
