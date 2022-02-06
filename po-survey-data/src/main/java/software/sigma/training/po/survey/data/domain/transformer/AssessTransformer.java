package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.AssessBuilder;
import software.sigma.training.po.survey.data.domain.Assess;

import java.util.Map;

public class AssessTransformer implements EntityTransformer<Assess> {

    private static final String ASSESS_JOB_INDUSTRY_KEY = "AssessJobIndustry";
    private static final String ASSESS_JOB_ROLE_KEY = "AssessJobRole";
    private static final String ASSESS_JOB_EXP_KEY = "AssessJobExp";
    private static final String ASSESS_JOB_DEPT_KEY = "AssessJobDept";
    private static final String ASSESS_JOB_TECH_KEY = "AssessJobTech";
    private static final String ASSESS_JOB_PROJECTS_KEY = "AssessJobProjects";
    private static final String ASSESS_JOB_COMPENSATION_KEY = "AssessJobCompensation";
    private static final String ASSESS_JOB_OFFICE_KEY = "AssessJobOffice";
    private static final String ASSESS_JOB_COMMUTE_KEY = "AssessJobCommute";
    private static final String ASSESS_JOB_REMOTE_KEY = "AssessJobRemote";
    private static final String ASSESS_JOB_LEADERS_KEY = "AssessJobLeaders";
    private static final String ASSESS_JOB_PROF_DEVEL_KEY = "AssessJobProfDevel";
    private static final String ASSESS_JOB_DIVERSITY_KEY = "AssessJobDiversity";
    private static final String ASSESS_JOB_PRODUCT_KEY = "AssessJobProduct";
    private static final String ASSESS_JOB_FINANCES_KEY = "AssessJobFinances";

    @Override
    public Assess transform(Map<String, String> csvData) {
        return new AssessBuilder()
                .setAssessJobIndustry(csvData.get(ASSESS_JOB_INDUSTRY_KEY))
                .setAssessJobRole(csvData.get(ASSESS_JOB_ROLE_KEY))
                .setAssessJobExp(csvData.get(ASSESS_JOB_EXP_KEY))
                .setAssessJobDept(csvData.get(ASSESS_JOB_DEPT_KEY))
                .setAssessJobTech(csvData.get(ASSESS_JOB_TECH_KEY))
                .setAssessJobProjects(csvData.get(ASSESS_JOB_PROJECTS_KEY))
                .setAssessJobCompensation(csvData.get(ASSESS_JOB_COMPENSATION_KEY))
                .setAssessJobOffice(csvData.get(ASSESS_JOB_OFFICE_KEY))
                .setAssessJobCommute(csvData.get(ASSESS_JOB_COMMUTE_KEY))
                .setAssessJobRemote(csvData.get(ASSESS_JOB_REMOTE_KEY))
                .setAssessJobLeaders(csvData.get(ASSESS_JOB_LEADERS_KEY))
                .setAssessJobProfDevel(csvData.get(ASSESS_JOB_PROF_DEVEL_KEY))
                .setAssessJobDiversity(csvData.get(ASSESS_JOB_DIVERSITY_KEY))
                .setAssessJobProduct(csvData.get(ASSESS_JOB_PRODUCT_KEY))
                .setAssessJobFinances(csvData.get(ASSESS_JOB_FINANCES_KEY))
                .build();
    }

}
