package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.HaveWorkedAndWantBuilder;
import software.sigma.training.po.survey.data.domain.HaveWorkedAndWant;

import java.util.Map;

public class HaveWorkedAndWantTransformer implements EntityTransformer<HaveWorkedAndWant> {

    private static final String HAVE_WORKED_LANGUAGE_KEY = "HaveWorkedLanguage";
    private static final String WANT_WORK_LANGUAGE_KEY = "WantWorkLanguage";
    private static final String HAVE_WORKED_FRAMEWORK_KEY = "HaveWorkedFramework";
    private static final String WANT_WORK_FRAMEWORK_KEY = "WantWorkFramework";
    private static final String HAVE_WORKED_DATABASE_KEY = "HaveWorkedDatabase";
    private static final String WANT_WORK_DATABASE_KEY = "WantWorkDatabase";
    private static final String HAVE_WORKED_PLATFORM_KEY = "HaveWorkedDatabase";
    private static final String WANT_WORK_PLATFORM_KEY = "WantWorkDatabase";

    @Override
    public HaveWorkedAndWant transform(Map<String, String> csvData) {
        return new HaveWorkedAndWantBuilder()
                .setHaveWorkedLanguage(csvData.get(HAVE_WORKED_LANGUAGE_KEY))
                .setWantWorkLanguage(csvData.get(WANT_WORK_LANGUAGE_KEY))
                .setHaveWorkedFramework(csvData.get(HAVE_WORKED_FRAMEWORK_KEY))
                .setWantWorkFramework(csvData.get(WANT_WORK_FRAMEWORK_KEY))
                .setHaveWorkedDatabase(csvData.get(HAVE_WORKED_DATABASE_KEY))
                .setWantWorkDatabase(csvData.get(WANT_WORK_DATABASE_KEY))
                .setHaveWorkedPlatform(csvData.get(HAVE_WORKED_PLATFORM_KEY))
                .setWantWorkPlatform(csvData.get(WANT_WORK_PLATFORM_KEY))
                .build();
    }

}
