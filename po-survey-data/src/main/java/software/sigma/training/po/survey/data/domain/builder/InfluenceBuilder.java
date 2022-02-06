package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Influence;

public class InfluenceBuilder implements EntityBuilder<Influence> {

    private final Influence influence;

    public InfluenceBuilder() {
        this.influence = new Influence();
    }

    @Override
    public Influence build() {
        return getInfluence();
    }

    public Influence getInfluence() {
        return influence;
    }

    public InfluenceBuilder setInfluenceInternet(String influenceInternet) {
        getInfluence().setInfluenceInternet(influenceInternet);
        return this;
    }

    public InfluenceBuilder setInfluenceWorkstation(String influenceWorkstation) {
        getInfluence().setInfluenceWorkstation(influenceWorkstation);
        return this;
    }

    public InfluenceBuilder setInfluenceHardware(String influenceHardware) {
        getInfluence().setInfluenceHardware(influenceHardware);
        return this;
    }

    public InfluenceBuilder setInfluenceServers(String influenceServers) {
        getInfluence().setInfluenceServers(influenceServers);
        return this;
    }

    public InfluenceBuilder setInfluenceTechStack(String influenceTechStack) {
        getInfluence().setInfluenceTechStack(influenceTechStack);
        return this;
    }

    public InfluenceBuilder setInfluenceDeptTech(String influenceDeptTech) {
        getInfluence().setInfluenceDeptTech(influenceDeptTech);
        return this;
    }

    public InfluenceBuilder setInfluenceVizTools(String influenceVizTools) {
        getInfluence().setInfluenceVizTools(influenceVizTools);
        return this;
    }

    public InfluenceBuilder setInfluenceDatabase(String influenceDatabase) {
        getInfluence().setInfluenceDatabase(influenceDatabase);
        return this;
    }

    public InfluenceBuilder setInfluenceCloud(String influenceCloud) {
        getInfluence().setInfluenceCloud(influenceCloud);
        return this;
    }

    public InfluenceBuilder setInfluenceConsultants(String influenceConsultants) {
        getInfluence().setInfluenceConsultants(influenceConsultants);
        return this;
    }

    public InfluenceBuilder setInfluenceRecruitment(String influenceRecruitment) {
        getInfluence().setInfluenceRecruitment(influenceRecruitment);
        return this;
    }

    public InfluenceBuilder setInfluenceCommunication(String influenceCommunication) {
        getInfluence().setInfluenceCommunication(influenceCommunication);
        return this;
    }

}
