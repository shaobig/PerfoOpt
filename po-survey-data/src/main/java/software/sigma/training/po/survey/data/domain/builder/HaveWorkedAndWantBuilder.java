package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.HaveWorkedAndWant;

public class HaveWorkedAndWantBuilder implements EntityBuilder<HaveWorkedAndWant> {

    private final HaveWorkedAndWant haveWorkedAndWant;

    public HaveWorkedAndWantBuilder() {
        this.haveWorkedAndWant = new HaveWorkedAndWant();
    }

    @Override
    public HaveWorkedAndWant build() {
        return getHaveWorkedAndWant();
    }

    public HaveWorkedAndWant getHaveWorkedAndWant() {
        return haveWorkedAndWant;
    }

    public HaveWorkedAndWantBuilder setHaveWorkedLanguage(String haveWorkedLanguage) {
        getHaveWorkedAndWant().setHaveWorkedLanguage(haveWorkedLanguage);
        return this;
    }

    public HaveWorkedAndWantBuilder setWantWorkLanguage(String wantWorkLanguage) {
        getHaveWorkedAndWant().setWantWorkLanguage(wantWorkLanguage);
        return this;
    }

    public HaveWorkedAndWantBuilder setHaveWorkedFramework(String haveWorkedFramework) {
        getHaveWorkedAndWant().setHaveWorkedFramework(haveWorkedFramework);
        return this;
    }

    public HaveWorkedAndWantBuilder setWantWorkFramework(String wantWorkFramework) {
        getHaveWorkedAndWant().setWantWorkFramework(wantWorkFramework);
        return this;
    }

    public HaveWorkedAndWantBuilder setHaveWorkedDatabase(String haveWorkedDatabase) {
        getHaveWorkedAndWant().setHaveWorkedDatabase(haveWorkedDatabase);
        return this;
    }

    public HaveWorkedAndWantBuilder setWantWorkDatabase(String wantWorkDatabase) {
        getHaveWorkedAndWant().setWantWorkDatabase(wantWorkDatabase);
        return this;
    }

    public HaveWorkedAndWantBuilder setHaveWorkedPlatform(String haveWorkedPlatform) {
        getHaveWorkedAndWant().setHaveWorkedPlatform(haveWorkedPlatform);
        return this;
    }

    public HaveWorkedAndWantBuilder setWantWorkPlatform(String wantWorkPlatform) {
        getHaveWorkedAndWant().setWantWorkPlatform(wantWorkPlatform);
        return this;
    }
}
