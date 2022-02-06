package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.ImportantHiringBuilder;
import software.sigma.training.po.survey.data.domain.ImportantHiring;

import java.util.Map;

public class ImportantHiringTransformer implements EntityTransformer<ImportantHiring> {

    private static final String LEARNED_HIRING_KEY = "LearnedHiring";
    private static final String IMPORTANT_HIRING_ALGORITHMS_KEY = "ImportantHiringAlgorithms";
    private static final String IMPORTANT_HIRING_TECH_EXP_KEY = "ImportantHiringTechExp";
    private static final String IMPORTANT_HIRING_COMMUNICATION_KEY = "ImportantHiringCommunication";
    private static final String IMPORTANT_HIRING_OPEN_SOURCE_KEY = "ImportantHiringOpenSource";
    private static final String IMPORTANT_HIRING_PM_EXP_KEY = "ImportantHiringPMExp";
    private static final String IMPORTANT_HIRING_COMPANIES_KEY = "ImportantHiringCompanies";
    private static final String IMPORTANT_HIRING_TITLES_KEY = "ImportantHiringTitles";
    private static final String IMPORTANT_HIRING_EDUCATION_KEY = "ImportantHiringEducation";
    private static final String IMPORTANT_HIRING_REP_KEY = "ImportantHiringRep";
    private static final String IMPORTANT_HIRING_GETTING_THINGS_DONE_KEY = "ImportantHiringGettingThingsDone";

    @Override
    public ImportantHiring transform(Map<String, String> csvData) {
        return new ImportantHiringBuilder()
                .setLearnedHiring(csvData.get(LEARNED_HIRING_KEY))
                .setImportantHiringAlgorithms(csvData.get(IMPORTANT_HIRING_ALGORITHMS_KEY))
                .setImportantHiringTechExp(csvData.get(IMPORTANT_HIRING_TECH_EXP_KEY))
                .setImportantHiringCommunication(csvData.get(IMPORTANT_HIRING_COMMUNICATION_KEY))
                .setImportantHiringOpenSource(csvData.get(IMPORTANT_HIRING_OPEN_SOURCE_KEY))
                .setImportantHiringPMExp(csvData.get(IMPORTANT_HIRING_PM_EXP_KEY))
                .setImportantHiringCompanies(csvData.get(IMPORTANT_HIRING_COMPANIES_KEY))
                .setImportantHiringTitles(csvData.get(IMPORTANT_HIRING_TITLES_KEY))
                .setImportantHiringEducation(csvData.get(IMPORTANT_HIRING_EDUCATION_KEY))
                .setImportantHiringRep(csvData.get(IMPORTANT_HIRING_REP_KEY))
                .setImportantHiringGettingThingsDone(csvData.get(IMPORTANT_HIRING_GETTING_THINGS_DONE_KEY))
                .build();
    }

}
