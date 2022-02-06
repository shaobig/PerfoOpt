package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Assess;

public class AssessBuilder implements EntityBuilder<Assess> {

    private final Assess assess;

    public AssessBuilder() {
        this.assess = new Assess();
    }

    @Override
    public Assess build() {
        return getAssess();
    }

    public Assess getAssess() {
        return assess;
    }

    public AssessBuilder setAssessJobIndustry(String assessJobIndustry) {
        getAssess().setAssessJobIndustry(assessJobIndustry);
        return this;
    }

    public AssessBuilder setAssessJobRole(String assessJobRole) {
        getAssess().setAssessJobRole(assessJobRole);
        return this;
    }

    public AssessBuilder setAssessJobExp(String assessJobExp) {
        getAssess().setAssessJobExp(assessJobExp);
        return this;
    }

    public AssessBuilder setAssessJobDept(String assessJobDept) {
        getAssess().setAssessJobDept(assessJobDept);
        return this;
    }

    public AssessBuilder setAssessJobTech(String assessJobTech) {
        getAssess().setAssessJobTech(assessJobTech);
        return this;
    }

    public AssessBuilder setAssessJobProjects(String assessJobProjects) {
        getAssess().setAssessJobProjects(assessJobProjects);
        return this;
    }

    public AssessBuilder setAssessJobCompensation(String assessJobCompensation) {
        getAssess().setAssessJobCompensation(assessJobCompensation);
        return this;
    }

    public AssessBuilder setAssessJobOffice(String assessJobOffice) {
        getAssess().setAssessJobOffice(assessJobOffice);
        return this;
    }

    public AssessBuilder setAssessJobCommute(String assessJobCommute) {
        getAssess().setAssessJobCommute(assessJobCommute);
        return this;
    }

    public AssessBuilder setAssessJobRemote(String assessJobRemote) {
        getAssess().setAssessJobRemote(assessJobRemote);
        return this;
    }

    public AssessBuilder setAssessJobLeaders(String assessJobLeaders) {
        getAssess().setAssessJobLeaders(assessJobLeaders);
        return this;
    }

    public AssessBuilder setAssessJobProfDevel(String assessJobProfDevel) {
        getAssess().setAssessJobProfDevel(assessJobProfDevel);
        return this;
    }

    public AssessBuilder setAssessJobDiversity(String assessJobDiversity) {
        getAssess().setAssessJobDiversity(assessJobDiversity);
        return this;
    }

    public AssessBuilder setAssessJobProduct(String assessJobProduct) {
        getAssess().setAssessJobProduct(assessJobProduct);
        return this;
    }

    public AssessBuilder setAssessJobFinances(String assessJobFinances) {
        getAssess().setAssessJobFinances(assessJobFinances);
        return this;
    }

}
