package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.RespondentDetails;

public class RespondentDetailsBuilder implements EntityBuilder<RespondentDetails> {

    private final RespondentDetails respondentDetails;

    public RespondentDetailsBuilder() {
        this.respondentDetails = new RespondentDetails();
    }

    @Override
    public RespondentDetails build() {
        return getRespondentDetails();
    }

    public RespondentDetails getRespondentDetails() {
        return respondentDetails;
    }

    public RespondentDetailsBuilder setPronounceGif(String pronounceGif) {
        getRespondentDetails().setPronounceGif(pronounceGif);
        return this;
    }

    public RespondentDetailsBuilder setProblemSolving(String problemSolving) {
        getRespondentDetails().setProblemSolving(problemSolving);
        return this;
    }

    public RespondentDetailsBuilder setBuildingThings(String buildingThings) {
        getRespondentDetails().setBuildingThings(buildingThings);
        return this;
    }

    public RespondentDetailsBuilder setLearningNewTech(String learningNewTech) {
        getRespondentDetails().setLearningNewTech(learningNewTech);
        return this;
    }

    public RespondentDetailsBuilder setBoringDetails(String boringDetails) {
        getRespondentDetails().setBoringDetails(boringDetails);
        return this;
    }

    public RespondentDetailsBuilder setJobSecurity(String jobSecurity) {
        getRespondentDetails().setJobSecurity(jobSecurity);
        return this;
    }

    public RespondentDetailsBuilder setDiversityImportant(String diversityImportant) {
        getRespondentDetails().setDiversityImportant(diversityImportant);
        return this;
    }

    public RespondentDetailsBuilder setAnnoyingUi(String annoyingUi) {
        getRespondentDetails().setAnnoyingUi(annoyingUi);
        return this;
    }

    public RespondentDetailsBuilder setFriendsDevelopers(String friendsDevelopers) {
        getRespondentDetails().setFriendsDevelopers(friendsDevelopers);
        return this;
    }

    public RespondentDetailsBuilder setRightWrongWay(String rightWrongWay) {
        getRespondentDetails().setRightWrongWay(rightWrongWay);
        return this;
    }

    public RespondentDetailsBuilder setUnderstandComputers(String understandComputers) {
        getRespondentDetails().setUnderstandComputers(understandComputers);
        return this;
    }

    public RespondentDetailsBuilder setSeriousWork(String seriousWork) {
        getRespondentDetails().setSeriousWork(seriousWork);
        return this;
    }

    public RespondentDetailsBuilder setInvestTimeTools(String investTimeTools) {
        getRespondentDetails().setInvestTimeTools(investTimeTools);
        return this;
    }

    public RespondentDetailsBuilder setWorkPayCare(String workPayCare) {
        getRespondentDetails().setWorkPayCare(workPayCare);
        return this;
    }

    public RespondentDetailsBuilder setKinshipDevelopers(String kinshipDevelopers) {
        getRespondentDetails().setKinshipDevelopers(kinshipDevelopers);
        return this;
    }

    public RespondentDetailsBuilder setChallengeMyself(String challengeMyself) {
        getRespondentDetails().setChallengeMyself(challengeMyself);
        return this;
    }

    public RespondentDetailsBuilder setCompetePeers(String competePeers) {
        getRespondentDetails().setCompetePeers(competePeers);
        return this;
    }

    public RespondentDetailsBuilder setChangeWorld(String changeWorld) {
        getRespondentDetails().setChangeWorld(changeWorld);
        return this;
    }

}
