package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.RespondentBuilder;
import software.sigma.training.po.survey.data.domain.Respondent;

import java.util.Map;

public class RespondentTransformer implements EntityTransformer<Respondent> {

    private static final String RESPONDENT_NAME_KEY = "Respondent";
    private static final String PROFESSIONAL_KEY = "Professional";
    private static final String PROGRAM_HOBBY_KEY = "ProgramHobby";
    private static final String COUNTRY_KEY = "Country";
    private static final String GENDER_KEY = "Gender";
    private static final String RACE_KEY = "Race";
    private static final String SALARY_KEY = "Salary";
    private static final String EXPECTED_SALARY_KEY = "ExpectedSalary";
    private static final String SURVEY_LONG_KEY = "SurveyLong";
    private static final String QUESTIONS_INTERESTING_KEY = "QuestionsInteresting";
    private static final String QUESTIONS_CONFUSING_KEY = "QuestionsConfusing";
    private static final String INTERESTED_ANSWERS_KEY = "InterestedAnswers";

    @Override
    public Respondent transform(Map<String, String> csvData) {
        return new RespondentBuilder()
                .setRespondentName(csvData.get(RESPONDENT_NAME_KEY))
                .setProfessional(csvData.get(PROFESSIONAL_KEY))
                .setProgramHobby(csvData.get(PROGRAM_HOBBY_KEY))
                .setCountry(csvData.get(COUNTRY_KEY))
                .setGender(csvData.get(GENDER_KEY))
                .setRace(csvData.get(RACE_KEY))
                .setSalary(csvData.get(SALARY_KEY))
                .setExpectedSalary(csvData.get(EXPECTED_SALARY_KEY))
                .setSurveyLong(csvData.get(SURVEY_LONG_KEY))
                .setQuestionsInteresting(csvData.get(QUESTIONS_INTERESTING_KEY))
                .setQuestionsConfusing(csvData.get(QUESTIONS_CONFUSING_KEY))
                .setInterestedAnswers(csvData.get(INTERESTED_ANSWERS_KEY))
                .build();
    }

}
