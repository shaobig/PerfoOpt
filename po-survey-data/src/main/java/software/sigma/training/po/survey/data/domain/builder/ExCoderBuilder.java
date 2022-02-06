package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.ExCoder;

public class ExCoderBuilder implements EntityBuilder<ExCoder> {

    private final ExCoder exCoder;

    public ExCoderBuilder() {
        this.exCoder = new ExCoder();
    }

    @Override
    public ExCoder build() {
        return getExCoder();
    }

    public ExCoder getExCoder() {
        return exCoder;
    }

    public ExCoderBuilder setExCoderReturn(String exCoderReturn) {
        getExCoder().setExCoderReturn(exCoderReturn);
        return this;
    }

    public ExCoderBuilder setExCoderNotForMe(String exCoderNotForMe) {
        getExCoder().setExCoderNotForMe(exCoderNotForMe);
        return this;
    }

    public ExCoderBuilder setExCoderBalance(String exCoderBalance) {
        getExCoder().setExCoderBalance(exCoderBalance);
        return this;
    }

    public ExCoderBuilder setExCoder10Years(String exCoder10Years) {
        getExCoder().setExCoder10Years(exCoder10Years);
        return this;
    }

    public ExCoderBuilder setExCoderBelonged(String exCoderBelonged) {
        getExCoder().setExCoderBelonged(exCoderBelonged);
        return this;
    }

    public ExCoderBuilder setExCoderSkills(String exCoderSkills) {
        getExCoder().setExCoderSkills(exCoderSkills);
        return this;
    }

    public ExCoderBuilder setExCoderWillNotCode(String exCoderWillNotCode) {
        getExCoder().setExCoderWillNotCode(exCoderWillNotCode);
        return this;
    }

    public ExCoderBuilder setExCoderActive(String exCoderActive) {
        getExCoder().setExCoderActive(exCoderActive);
        return this;
    }

}
