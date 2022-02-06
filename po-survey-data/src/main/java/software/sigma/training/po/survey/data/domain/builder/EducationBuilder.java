package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Education;

public class EducationBuilder implements EntityBuilder<Education> {

    private final Education education;

    public EducationBuilder() {
        this.education = new Education();
    }

    @Override
    public Education build() {
        return getEducation();
    }

    public Education getEducation() {
        return education;
    }

    public EducationBuilder setUniversity(String university) {
        getEducation().setUniversity(university);
        return this;
    }

    public EducationBuilder setFormalEducation(String formalEducation) {
        getEducation().setFormalEducation(formalEducation);
        return this;
    }

    public EducationBuilder setMajorUndergrad(String majorUndergrad) {
        getEducation().setMajorUndergrad(majorUndergrad);
        return this;
    }

    public EducationBuilder setEducationImportant(String educationImportant) {
        getEducation().setEducationImportant(educationImportant);
        return this;
    }

    public EducationBuilder setEducationTypes(String educationTypes) {
        getEducation().setEducationTypes(educationTypes);
        return this;
    }

    public EducationBuilder setSelfTaughtTypes(String selfTaughtTypes) {
        getEducation().setSelfTaughtTypes(selfTaughtTypes);
        return this;
    }

    public EducationBuilder setTimeAfterBootcamp(String timeAfterBootcamp) {
        getEducation().setTimeAfterBootcamp(timeAfterBootcamp);
        return this;
    }

    public EducationBuilder setCousinEducation(String cousinEducation) {
        getEducation().setCousinEducation(cousinEducation);
        return this;
    }

    public EducationBuilder setHighestEducationParents(String highestEducationParents) {
        getEducation().setHighestEducationParents(highestEducationParents);
        return this;
    }

}
