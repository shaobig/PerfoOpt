package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Employment;

public class EmploymentBuilder implements EntityBuilder<Employment> {

    private final Employment employment;

    public EmploymentBuilder() {
        this.employment = new Employment();
    }

    @Override
    public Employment build() {
        return getEmployment();
    }

    public Employment getEmployment() {
        return employment;
    }

    public EmploymentBuilder setEmploymentStatus(String employmentStatus) {
        getEmployment().setEmploymentStatus(employmentStatus);
        return this;
    }

    public EmploymentBuilder setHomeRemote(String homeRemote) {
        getEmployment().setHomeRemote(homeRemote);
        return this;
    }

    public EmploymentBuilder setCompanySize(String companySize) {
        getEmployment().setCompanySize(companySize);
        return this;
    }

    public EmploymentBuilder setCompanyType(String companyType) {
        getEmployment().setCompanyType(companyType);
        return this;
    }

    public EmploymentBuilder setYearsProgram(String yearsProgram) {
        getEmployment().setYearsProgram(yearsProgram);
        return this;
    }

    public EmploymentBuilder setYearsCodedJob(String yearsCodedJob) {
        getEmployment().setYearsCodedJob(yearsCodedJob);
        return this;
    }

    public EmploymentBuilder setYearsCodedJobPast(String yearsCodedJobPast) {
        getEmployment().setYearsCodedJobPast(yearsCodedJobPast);
        return this;
    }

    public EmploymentBuilder setDeveloperType(String developerType) {
        getEmployment().setDeveloperType(developerType);
        return this;
    }

    public EmploymentBuilder setWebDeveloperType(String webDeveloperType) {
        getEmployment().setWebDeveloperType(webDeveloperType);
        return this;
    }

    public EmploymentBuilder setMobileDeveloperType(String mobileDeveloperType) {
        getEmployment().setMobileDeveloperType(mobileDeveloperType);
        return this;
    }

    public EmploymentBuilder setNonDeveloperType(String nonDeveloperType) {
        getEmployment().setNonDeveloperType(nonDeveloperType);
        return this;
    }

    public EmploymentBuilder setCareerSatisfaction(String careerSatisfaction) {
        getEmployment().setCareerSatisfaction(careerSatisfaction);
        return this;
    }

    public EmploymentBuilder setJobSatisfaction(String jobSatisfaction) {
        getEmployment().setJobSatisfaction(jobSatisfaction);
        return this;
    }

}
