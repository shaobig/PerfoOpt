package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.*;

import java.util.Map;

public class TotalRespondentTransformer implements EntityTransformer<Respondent> {

    private final EntityTransformer<Respondent> respondentTransformer;
    private final EntityTransformer<Assess> assessTransformer;
    private final EntityTransformer<Education> educationTransformer;
    private final EntityTransformer<Employment> employmentTransformer;
    private final EntityTransformer<Equipment> equipmentTransformer;
    private final EntityTransformer<ExCoder> exCoderTransformer;
    private final EntityTransformer<HaveWorkedAndWant> haveWorkedAndWantTransformer;
    private final EntityTransformer<ImportantHiring> importantHiringTransformer;
    private final EntityTransformer<Influence> influenceTransformer;
    private final EntityTransformer<JobInfo> jobInfoTransformer;
    private final EntityTransformer<RespondentDetails> respondentDetailsTransformer;
    private final EntityTransformer<StackOverflowInfo> stackOverflowInfoTransformer;
    private final EntityTransformer<TechnicalDetails> technicalDetailsTransformer;

    public TotalRespondentTransformer() {
        this.respondentTransformer = new RespondentTransformer();
        this.assessTransformer = new AssessTransformer();
        this.educationTransformer = new EducationTransformer();
        this.employmentTransformer = new EmploymentTransformer();
        this.equipmentTransformer = new EquipmentTransformer();
        this.exCoderTransformer = new ExCoderTransformer();
        this.haveWorkedAndWantTransformer = new HaveWorkedAndWantTransformer();
        this.importantHiringTransformer = new ImportantHiringTransformer();
        this.influenceTransformer = new InfluenceTransformer();
        this.jobInfoTransformer = new JobInfoTransformer();
        this.respondentDetailsTransformer = new RespondentDetailsTransformer();
        this.stackOverflowInfoTransformer = new StackOverflowInfoTransformer();
        this.technicalDetailsTransformer = new TechnicalDetailsTransformer();
    }

    @Override
    public Respondent transform(Map<String, String> csvData) {
        Respondent respondent = getRespondentTransformer().transform(csvData);

        respondent.setAssesses(getAssessTransformer().transform(csvData));
        respondent.setEducationInfo(getEducationTransformer().transform(csvData));
        respondent.setEmploymentInfo(getEmploymentTransformer().transform(csvData));
        respondent.setEquipmentInfo(getEquipmentTransformer().transform(csvData));
        respondent.setExCoderInfo(getExCoderTransformer().transform(csvData));
        respondent.setHaveWorkedAndWantInfo(getHaveWorkedAndWantTransformer().transform(csvData));
        respondent.setImportantHiringInfo(getImportantHiringTransformer().transform(csvData));
        respondent.setInfluenceInfo(getInfluenceTransformer().transform(csvData));
        respondent.setJob(getJobInfoTransformer().transform(csvData));
        respondent.setRespondentDetailsInfo(getRespondentDetailsTransformer().transform(csvData));
        respondent.setStackOverflow(getStackOverflowInfoTransformer().transform(csvData));
        respondent.setTechnicalDetailsInfo(getTechnicalDetailsTransformer().transform(csvData));

        return respondent;
    }

    public EntityTransformer<Respondent> getRespondentTransformer() {
        return respondentTransformer;
    }

    public EntityTransformer<Assess> getAssessTransformer() {
        return assessTransformer;
    }

    public EntityTransformer<Education> getEducationTransformer() {
        return educationTransformer;
    }

    public EntityTransformer<Employment> getEmploymentTransformer() {
        return employmentTransformer;
    }

    public EntityTransformer<Equipment> getEquipmentTransformer() {
        return equipmentTransformer;
    }

    public EntityTransformer<ExCoder> getExCoderTransformer() {
        return exCoderTransformer;
    }

    public EntityTransformer<HaveWorkedAndWant> getHaveWorkedAndWantTransformer() {
        return haveWorkedAndWantTransformer;
    }

    public EntityTransformer<ImportantHiring> getImportantHiringTransformer() {
        return importantHiringTransformer;
    }

    public EntityTransformer<Influence> getInfluenceTransformer() {
        return influenceTransformer;
    }

    public EntityTransformer<JobInfo> getJobInfoTransformer() {
        return jobInfoTransformer;
    }

    public EntityTransformer<RespondentDetails> getRespondentDetailsTransformer() {
        return respondentDetailsTransformer;
    }

    public EntityTransformer<StackOverflowInfo> getStackOverflowInfoTransformer() {
        return stackOverflowInfoTransformer;
    }

    public EntityTransformer<TechnicalDetails> getTechnicalDetailsTransformer() {
        return technicalDetailsTransformer;
    }

}
