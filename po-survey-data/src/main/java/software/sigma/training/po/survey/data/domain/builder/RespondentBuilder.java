package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Respondent;

public class RespondentBuilder implements EntityBuilder<Respondent> {

    private final Respondent respondent;

    public RespondentBuilder() {
        this.respondent = new Respondent();
    }

    @Override
    public Respondent build() {
        return getRespondent();
    }

    public Respondent getRespondent() {
        return respondent;
    }

    public RespondentBuilder setRespondentName(String respondentName) {
        getRespondent().setRespondentName(respondentName);
        return this;
    }

    public RespondentBuilder setProfessional(String professional) {
        getRespondent().setProfessional(professional);
        return this;
    }

    public RespondentBuilder setProgramHobby(String programHobby) {
        getRespondent().setProgramHobby(programHobby);
        return this;
    }

    public RespondentBuilder setCountry(String country) {
        getRespondent().setCountry(country);
        return this;
    }

    public RespondentBuilder setGender(String gender) {
        getRespondent().setGender(gender);
        return this;
    }

    public RespondentBuilder setRace(String race) {
        getRespondent().setRace(race);
        return this;
    }

    public RespondentBuilder setSalary(String salary) {
        getRespondent().setSalary(salary);
        return this;
    }

    public RespondentBuilder setExpectedSalary(String expectedSalary) {
        getRespondent().setExpectedSalary(expectedSalary);
        return this;
    }

    public RespondentBuilder setSurveyLong(String surveyLong) {
        getRespondent().setSurveyLong(surveyLong);
        return this;
    }

    public RespondentBuilder setQuestionsInteresting(String questionsInteresting) {
        getRespondent().setQuestionsInteresting(questionsInteresting);
        return this;
    }

    public RespondentBuilder setQuestionsConfusing(String questionsConfusing) {
        getRespondent().setQuestionsConfusing(questionsConfusing);
        return this;
    }

    public RespondentBuilder setInterestedAnswers(String interestedAnswers) {
        getRespondent().setInterestedAnswers(interestedAnswers);
        return this;
    }

}
