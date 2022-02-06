package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.JobInfo;
import software.sigma.training.po.survey.data.domain.builder.JobInfoBuilder;

import java.util.Map;

public class JobInfoTransformer implements EntityTransformer<JobInfo> {

    private static final String JOB_SEEKING_STATUS_KEY = "JobSeekingStatus";
    private static final String HOURS_PER_WEEK_KEY = "HoursPerWeek";
    private static final String WORK_START_KEY = "WorkStart";
    private static final String LAST_NEW_JOB_KEY = "LastNewJob";
    private static final String IMPORTANT_BENEFITS_KEY = "ImportantBenefits";
    private static final String CLICKY_KEYS_KEY = "ClickyKeys";
    private static final String JOB_PROFILE_KEY = "JobProfile";
    private static final String RESUME_PROMPTED_KEY = "ResumePrompted";
    private static final String CURRENCY_KEY = "Currency";
    private static final String OVERPAID_KEY = "Overpaid";

    @Override
    public JobInfo transform(Map<String, String> csvData) {
        return new JobInfoBuilder()
                .setJobSeekingStatus(JOB_SEEKING_STATUS_KEY)
                .setHoursPerWeek(HOURS_PER_WEEK_KEY)
                .setWorkStart(WORK_START_KEY)
                .setLastNewJob(LAST_NEW_JOB_KEY)
                .setImportantBenefits(IMPORTANT_BENEFITS_KEY)
                .setClickyKeys(CLICKY_KEYS_KEY)
                .setJobProfile(JOB_PROFILE_KEY)
                .setResumePrompted(RESUME_PROMPTED_KEY)
                .setCurrency(CURRENCY_KEY)
                .setOverpaid(OVERPAID_KEY)
                .build();
    }

}
