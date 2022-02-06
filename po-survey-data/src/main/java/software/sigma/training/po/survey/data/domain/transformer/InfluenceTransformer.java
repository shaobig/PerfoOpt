package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.Influence;
import software.sigma.training.po.survey.data.domain.builder.InfluenceBuilder;

import java.util.Map;

public class InfluenceTransformer implements EntityTransformer<Influence> {

    private static final String INFLUENCE_INTERNET_KEY = "InfluenceInternet";
    private static final String INFLUENCE_WORKSTATION_KEY = "InfluenceWorkstation";
    private static final String INFLUENCE_HARDWARE_KEY = "InfluenceHardware";
    private static final String INFLUENCE_SERVERS_KEY = "InfluenceServers";
    private static final String INFLUENCE_TECH_STACK_KEY = "InfluenceTechStack";
    private static final String INFLUENCE_DEPT_TECH_KEY = "InfluenceDeptTech";
    private static final String INFLUENCE_VIZ_TOOLS_KEY = "InfluenceVizTools";
    private static final String INFLUENCE_DATABASE_KEY = "InfluenceInternet";
    private static final String INFLUENCE_CLOUD_KEY = "InfluenceCloud";
    private static final String INFLUENCE_CONSULTANTS_KEY = "InfluenceConsultants";
    private static final String INFLUENCE_RECRUITMENT_KEY = "InfluenceRecruitment";
    private static final String INFLUENCE_COMMUNICATION_KEY = "InfluenceCommunication";

    @Override
    public Influence transform(Map<String, String> csvData) {
        return new InfluenceBuilder()
                .setInfluenceInternet(csvData.get(INFLUENCE_INTERNET_KEY))
                .setInfluenceWorkstation(csvData.get(INFLUENCE_WORKSTATION_KEY))
                .setInfluenceHardware(csvData.get(INFLUENCE_HARDWARE_KEY))
                .setInfluenceServers(csvData.get(INFLUENCE_SERVERS_KEY))
                .setInfluenceTechStack(csvData.get(INFLUENCE_TECH_STACK_KEY))
                .setInfluenceDeptTech(csvData.get(INFLUENCE_DEPT_TECH_KEY))
                .setInfluenceVizTools(csvData.get(INFLUENCE_VIZ_TOOLS_KEY))
                .setInfluenceDatabase(csvData.get(INFLUENCE_DATABASE_KEY))
                .setInfluenceCloud(csvData.get(INFLUENCE_CLOUD_KEY))
                .setInfluenceConsultants(csvData.get(INFLUENCE_CONSULTANTS_KEY))
                .setInfluenceRecruitment(csvData.get(INFLUENCE_RECRUITMENT_KEY))
                .setInfluenceCommunication(csvData.get(INFLUENCE_COMMUNICATION_KEY))
                .build();
    }

}
