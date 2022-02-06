package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.EducationBuilder;
import software.sigma.training.po.survey.data.domain.Education;

import java.util.Map;

public class EducationTransformer implements EntityTransformer<Education> {

    private static final String UNIVERSITY_KEY = "University";
    private static final String FORMAL_EDUCATION_KEY = "FormalEducation";
    private static final String MAJOR_UNDERGRAD_KEY = "MajorUndergrad";
    private static final String EDUCATION_IMPORTANT_KEY = "EducationImportant";
    private static final String EDUCATION_TYPES_KEY = "EducationTypes";
    private static final String SELF_TAUGHT_TYPES_KEY = "SelfTaughtTypes";
    private static final String TIME_AFTER_BOOTCAMP_KEY = "TimeAfterBootcamp";
    private static final String COUSIN_EDUCATION_KEY = "CousinEducation";
    private static final String HIGHEST_EDUCATION_PARENTS_KEY = "HighestEducationParents";

    @Override
    public Education transform(Map<String, String> csvData) {
        return new EducationBuilder()
                .setUniversity(csvData.get(UNIVERSITY_KEY))
                .setFormalEducation(csvData.get(FORMAL_EDUCATION_KEY))
                .setMajorUndergrad(csvData.get(MAJOR_UNDERGRAD_KEY))
                .setEducationImportant(csvData.get(EDUCATION_IMPORTANT_KEY))
                .setEducationTypes(csvData.get(EDUCATION_TYPES_KEY))
                .setSelfTaughtTypes(csvData.get(SELF_TAUGHT_TYPES_KEY))
                .setTimeAfterBootcamp(csvData.get(TIME_AFTER_BOOTCAMP_KEY))
                .setCousinEducation(csvData.get(COUSIN_EDUCATION_KEY))
                .setHighestEducationParents(csvData.get(HIGHEST_EDUCATION_PARENTS_KEY))
                .build();
    }

}
