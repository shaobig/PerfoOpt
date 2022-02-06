package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.JobInfo;

public class JobInfoBuilder implements EntityBuilder<JobInfo> {

    private final JobInfo jobInfo;

    public JobInfoBuilder() {
        this.jobInfo = new JobInfo();
    }

    @Override
    public JobInfo build() {
        return getJobInfo();
    }

    public JobInfo getJobInfo() {
        return jobInfo;
    }

    public JobInfoBuilder setJobSeekingStatus(String jobSeekingStatus) {
        getJobInfo().setJobSeekingStatus(jobSeekingStatus);
        return this;
    }

    public JobInfoBuilder setHoursPerWeek(String hoursPerWeek) {
        getJobInfo().setHoursPerWeek(hoursPerWeek);
        return this;
    }

    public JobInfoBuilder setWorkStart(String workStart) {
        getJobInfo().setWorkStart(workStart);
        return this;
    }

    public JobInfoBuilder setLastNewJob(String lastNewJob) {
        getJobInfo().setLastNewJob(lastNewJob);
        return this;
    }

    public JobInfoBuilder setImportantBenefits(String importantBenefits) {
        getJobInfo().setImportantBenefits(importantBenefits);
        return this;
    }

    public JobInfoBuilder setClickyKeys(String clickyKeys) {
        getJobInfo().setClickyKeys(clickyKeys);
        return this;
    }

    public JobInfoBuilder setJobProfile(String jobProfile) {
        getJobInfo().setJobProfile(jobProfile);
        return this;
    }

    public JobInfoBuilder setResumePrompted(String resumePrompted) {
        getJobInfo().setResumePrompted(resumePrompted);
        return this;
    }

    public JobInfoBuilder setCurrency(String currency) {
        getJobInfo().setCurrency(currency);
        return this;
    }

    public JobInfoBuilder setOverpaid(String overpaid) {
        getJobInfo().setOverpaid(overpaid);
        return this;
    }

}
