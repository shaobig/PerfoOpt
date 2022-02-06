package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.RespondentDetails;
import software.sigma.training.po.survey.data.domain.builder.RespondentDetailsBuilder;

import java.util.Map;

public class RespondentDetailsTransformer implements EntityTransformer<RespondentDetails> {

    private static final String PRONOUNCE_GIF_KEY = "PronounceGIF";
    private static final String PROBLEM_SOLVING_KEY = "ProblemSolving";
    private static final String BUILDING_THINGS_KEY = "BuildingThings";
    private static final String LEARNING_NEW_TECH_KEY = "LearningNewTech";
    private static final String BORING_DETAILS_KEY = "BoringDetails";
    private static final String JOB_SECURITY_KEY = "JobSecurity";
    private static final String DIVERSITY_IMPORTANT_KEY = "DiversityImportant";
    private static final String ANNOYING_UI_KEY = "AnnoyingUI";
    private static final String FRIEND_DEVELOPERS_KEY = "FriendsDevelopers";
    private static final String RIGHT_WRONG_WAY_KEY = "RightWrongWay";
    private static final String UNDERSTAND_COMPUTERS_KEY = "UnderstandComputers";
    private static final String SERIOUS_WORK_KEY = "SeriousWork";
    private static final String INVEST_TIME_TOOLS_KEY = "InvestTimeTools";
    private static final String WORK_PAY_CARE_KEY = "WorkPayCare";
    private static final String KINSHIP_DEVELOPERS_KEY = "KinshipDevelopers";
    private static final String CHALLENGE_MYSELF_KEY = "ChallengeMyself";
    private static final String COMPETE_PEERS_KEY = "CompetePeers";
    private static final String CHANGE_WORLD_KEY = "ChangeWorld";

    @Override
    public RespondentDetails transform(Map<String, String> csvData) {
        return new RespondentDetailsBuilder()
                .setPronounceGif(csvData.get(PRONOUNCE_GIF_KEY))
                .setProblemSolving(csvData.get(PROBLEM_SOLVING_KEY))
                .setBuildingThings(csvData.get(BUILDING_THINGS_KEY))
                .setLearningNewTech(csvData.get(LEARNING_NEW_TECH_KEY))
                .setBoringDetails(csvData.get(BORING_DETAILS_KEY))
                .setJobSecurity(csvData.get(JOB_SECURITY_KEY))
                .setDiversityImportant(csvData.get(DIVERSITY_IMPORTANT_KEY))
                .setAnnoyingUi(csvData.get(ANNOYING_UI_KEY))
                .setFriendsDevelopers(csvData.get(FRIEND_DEVELOPERS_KEY))
                .setRightWrongWay(csvData.get(RIGHT_WRONG_WAY_KEY))
                .setUnderstandComputers(csvData.get(UNDERSTAND_COMPUTERS_KEY))
                .setSeriousWork(csvData.get(SERIOUS_WORK_KEY))
                .setInvestTimeTools(csvData.get(INVEST_TIME_TOOLS_KEY))
                .setWorkPayCare(csvData.get(WORK_PAY_CARE_KEY))
                .setKinshipDevelopers(csvData.get(KINSHIP_DEVELOPERS_KEY))
                .setChallengeMyself(csvData.get(CHALLENGE_MYSELF_KEY))
                .setCompetePeers(csvData.get(COMPETE_PEERS_KEY))
                .setChangeWorld(csvData.get(CHANGE_WORLD_KEY))
                .build();
    }

}
