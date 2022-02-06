package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.StackOverflowInfo;

public class StackOverflowInfoBuilder implements EntityBuilder<StackOverflowInfo> {

    private final StackOverflowInfo stackOverflowInfo;

    public StackOverflowInfoBuilder() {
        this.stackOverflowInfo = new StackOverflowInfo();
    }

    @Override
    public StackOverflowInfo build() {
        return getStackOverflowInfo();
    }

    public StackOverflowInfo getStackOverflowInfo() {
        return stackOverflowInfo;
    }

    public StackOverflowInfoBuilder setStackOverflowDescribes(String stackOverflowDescribes) {
        getStackOverflowInfo().setStackOverflowDescribes(stackOverflowDescribes);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowSatisfaction(String stackOverflowSatisfaction) {
        getStackOverflowInfo().setStackOverflowSatisfaction(stackOverflowSatisfaction);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowDevices(String stackOverflowDevices) {
        getStackOverflowInfo().setStackOverflowDevices(stackOverflowDevices);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowFoundAnswer(String stackOverflowFoundAnswer) {
        getStackOverflowInfo().setStackOverflowFoundAnswer(stackOverflowFoundAnswer);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowCopiedCode(String stackOverflowCopiedCode) {
        getStackOverflowInfo().setStackOverflowCopiedCode(stackOverflowCopiedCode);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowJobListing(String stackOverflowJobListing) {
        getStackOverflowInfo().setStackOverflowJobListing(stackOverflowJobListing);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowCompanyPage(String stackOverflowCompanyPage) {
        getStackOverflowInfo().setStackOverflowCompanyPage(stackOverflowCompanyPage);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowJobSearch(String stackOverflowJobSearch) {
        getStackOverflowInfo().setStackOverflowJobSearch(stackOverflowJobSearch);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowNewQuestion(String stackOverflowNewQuestion) {
        getStackOverflowInfo().setStackOverflowNewQuestion(stackOverflowNewQuestion);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowAnswer(String stackOverflowAnswer) {
        getStackOverflowInfo().setStackOverflowAnswer(stackOverflowAnswer);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowMetaChat(String stackOverflowDescribes) {
        getStackOverflowInfo().setStackOverflowMetaChat(stackOverflowDescribes);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowAdsRelevant(String stackOverflowAdsRelevant) {
        getStackOverflowInfo().setStackOverflowAdsRelevant(stackOverflowAdsRelevant);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowAdsDistracting(String stackOverflowAdsDistracting) {
        getStackOverflowInfo().setStackOverflowAdsDistracting(stackOverflowAdsDistracting);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowModeration(String stackOverflowModeration) {
        getStackOverflowInfo().setStackOverflowModeration(stackOverflowModeration);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowCommunity(String stackOverflowCommunity) {
        getStackOverflowInfo().setStackOverflowCommunity(stackOverflowCommunity);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowHelpful(String stackOverflowHelpful) {
        getStackOverflowInfo().setStackOverflowHelpful(stackOverflowHelpful);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowBetter(String stackOverflowBetter) {
        getStackOverflowInfo().setStackOverflowBetter(stackOverflowBetter);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowWhatDo(String stackOverflowWhatDo) {
        getStackOverflowInfo().setStackOverflowWhatDo(stackOverflowWhatDo);
        return this;
    }

    public StackOverflowInfoBuilder setStackOverflowMakeMany(String stackOverflowMakeMany) {
        getStackOverflowInfo().setStackOverflowMakeMoney(stackOverflowMakeMany);
        return this;
    }

}
