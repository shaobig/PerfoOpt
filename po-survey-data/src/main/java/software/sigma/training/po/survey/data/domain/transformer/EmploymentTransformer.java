package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.EmploymentBuilder;
import software.sigma.training.po.survey.data.domain.Employment;

import java.util.Map;

public class EmploymentTransformer implements EntityTransformer<Employment> {

    private static final String EMPLOYMENT_STATUS_KEY = "EmploymentStatus";
    private static final String HOME_REMOTE_KEY = "HomeRemote";
    private static final String COMPANY_SIZE_KEY = "CompanySize";
    private static final String COMPANY_TYPE_KEY = "CompanyType";
    private static final String YEARS_PROGRAM_KEY = "YearsProgram";
    private static final String YEARS_CODED_JOB_KEY = "YearsCodedJob";
    private static final String YEARS_CODED_JOB_PAST_KEY = "YearsCodedJobPast";
    private static final String DEVELOPER_TYPE_KEY = "DeveloperType";
    private static final String WEB_DEVELOPER_TYPE_KEY = "WebDeveloperType";
    private static final String MOBILE_DEVELOPER_TYPE_KEY = "MobileDeveloperType";
    private static final String NON_DEVELOPER_TYPE_KEY = "NonDeveloperType";
    private static final String CAREER_SATISFACTION_KEY = "CareerSatisfaction";
    private static final String JOB_SATISFACTION_KEY = "JobSatisfaction";

    @Override
    public Employment transform(Map<String, String> csvData) {
        return new EmploymentBuilder()
                .setEmploymentStatus(csvData.get(EMPLOYMENT_STATUS_KEY))
                .setHomeRemote(csvData.get(HOME_REMOTE_KEY))
                .setCompanySize(csvData.get(COMPANY_SIZE_KEY))
                .setCompanyType(csvData.get(COMPANY_TYPE_KEY))
                .setYearsProgram(csvData.get(YEARS_PROGRAM_KEY))
                .setYearsCodedJob(csvData.get(YEARS_CODED_JOB_KEY))
                .setYearsCodedJobPast(csvData.get(YEARS_CODED_JOB_PAST_KEY))
                .setDeveloperType(csvData.get(DEVELOPER_TYPE_KEY))
                .setWebDeveloperType(csvData.get(WEB_DEVELOPER_TYPE_KEY))
                .setMobileDeveloperType(csvData.get(MOBILE_DEVELOPER_TYPE_KEY))
                .setNonDeveloperType(csvData.get(NON_DEVELOPER_TYPE_KEY))
                .setCareerSatisfaction(csvData.get(CAREER_SATISFACTION_KEY))
                .setJobSatisfaction(csvData.get(JOB_SATISFACTION_KEY))
                .build();
    }
}
