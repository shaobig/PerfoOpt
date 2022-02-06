package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.StackOverflowInfo;
import software.sigma.training.po.survey.data.domain.builder.StackOverflowInfoBuilder;

import java.util.Map;

public class StackOverflowInfoTransformer implements EntityTransformer<StackOverflowInfo> {

    private static final String STACK_OVERFLOW_DESCRIBES_KEY = "StackOverflowDescribes";
    private static final String STACK_OVERFLOW_SATISFACTION_KEY = "StackOverflowSatisfaction";
    private static final String STACK_OVERFLOW_DEVICES_KEY = "StackOverflowDevices";
    private static final String STACK_OVERFLOW_FOUND_ANSWER_KEY = "StackOverflowFoundAnswer";
    private static final String STACK_OVERFLOW_COPIED_CODE_KEY = "StackOverflowCopiedCode";
    private static final String STACK_OVERFLOW_JOB_LISTING_KEY = "StackOverflowJobListing";
    private static final String STACK_OVERFLOW_COMPANY_PAGE_KEY = "StackOverflowCompanyPage";
    private static final String STACK_OVERFLOW_JOB_SEARCH_KEY = "StackOverflowJobSearch";
    private static final String STACK_OVERFLOW_NEW_QUESTION_KEY = "StackOverflowNewQuestion";
    private static final String STACK_OVERFLOW_ANSWER_KEY = "StackOverflowAnswer";
    private static final String STACK_OVERFLOW_META_CHAT_KEY = "StackOverflowMetaChat";
    private static final String STACK_OVERFLOW_ADS_RELEVANT_KEY = "StackOverflowAdsRelevant";
    private static final String STACK_OVERFLOW_ADS_DISTRACTING_KEY = "StackOverflowAdsDistracting";
    private static final String STACK_OVERFLOW_MODERATION_KEY = "StackOverflowModeration";
    private static final String STACK_OVERFLOW_COMMUNITY_KEY = "StackOverflowCommunity";
    private static final String STACK_OVERFLOW_HELPFUL_KEY = "StackOverflowHelpful";
    private static final String STACK_OVERFLOW_BETTER_KEY = "StackOverflowBetter";
    private static final String STACK_OVERFLOW_WHAT_DO_KEY = "StackOverflowWhatDo";
    private static final String STACK_OVERFLOW_MAKE_MONEY_KEY = "StackOverflowMakeMoney";

    @Override
    public StackOverflowInfo transform(Map<String, String> csvData) {
        return new StackOverflowInfoBuilder()
                .setStackOverflowDescribes(csvData.get(STACK_OVERFLOW_DESCRIBES_KEY))
                .setStackOverflowSatisfaction(csvData.get(STACK_OVERFLOW_SATISFACTION_KEY))
                .setStackOverflowDevices(csvData.get(STACK_OVERFLOW_DEVICES_KEY))
                .setStackOverflowFoundAnswer(csvData.get(STACK_OVERFLOW_FOUND_ANSWER_KEY))
                .setStackOverflowCopiedCode(csvData.get(STACK_OVERFLOW_COPIED_CODE_KEY))
                .setStackOverflowJobListing(csvData.get(STACK_OVERFLOW_JOB_LISTING_KEY))
                .setStackOverflowCompanyPage(csvData.get(STACK_OVERFLOW_COMPANY_PAGE_KEY))
                .setStackOverflowJobSearch(csvData.get(STACK_OVERFLOW_JOB_SEARCH_KEY))
                .setStackOverflowNewQuestion(csvData.get(STACK_OVERFLOW_NEW_QUESTION_KEY))
                .setStackOverflowAnswer(csvData.get(STACK_OVERFLOW_ANSWER_KEY))
                .setStackOverflowMetaChat(csvData.get(STACK_OVERFLOW_META_CHAT_KEY))
                .setStackOverflowAdsRelevant(csvData.get(STACK_OVERFLOW_ADS_RELEVANT_KEY))
                .setStackOverflowAdsDistracting(csvData.get(STACK_OVERFLOW_ADS_DISTRACTING_KEY))
                .setStackOverflowModeration(csvData.get(STACK_OVERFLOW_MODERATION_KEY))
                .setStackOverflowCommunity(csvData.get(STACK_OVERFLOW_COMMUNITY_KEY))
                .setStackOverflowHelpful(csvData.get(STACK_OVERFLOW_HELPFUL_KEY))
                .setStackOverflowBetter(csvData.get(STACK_OVERFLOW_BETTER_KEY))
                .setStackOverflowWhatDo(csvData.get(STACK_OVERFLOW_WHAT_DO_KEY))
                .setStackOverflowMakeMany(csvData.get(STACK_OVERFLOW_MAKE_MONEY_KEY))
                .build();
    }

}
