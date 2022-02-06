package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.ExCoderBuilder;
import software.sigma.training.po.survey.data.domain.ExCoder;

import java.util.Map;

public class ExCoderTransformer implements EntityTransformer<ExCoder>  {

    private static final String EX_CODER_RETURN_KEY = "ExCoderReturn";
    private static final String EX_CODER_NOT_FOR_ME_KEY = "ExCoderNotForMe";
    private static final String EX_CODER_BALANCE_KEY = "ExCoderBalance";
    private static final String EX_CODER_10_YEARS_KEY = "ExCoder10Years";
    private static final String EX_CODER_BELONGED_KEY = "ExCoderBelonged";
    private static final String EX_CODER_SKILLS_KEY = "ExCoderSkills";
    private static final String EX_CODER_WILL_NOT_CODE_KEY = "ExCoderWillNotCode";
    private static final String EX_CODER_ACTIVE_KEY = "ExCoderWillNotCode";

    @Override
    public ExCoder transform(Map<String, String> csvData) {
        return new ExCoderBuilder()
                .setExCoderReturn(csvData.get(EX_CODER_RETURN_KEY))
                .setExCoderNotForMe(csvData.get(EX_CODER_NOT_FOR_ME_KEY))
                .setExCoderBalance(csvData.get(EX_CODER_BALANCE_KEY))
                .setExCoder10Years(csvData.get(EX_CODER_10_YEARS_KEY))
                .setExCoderBelonged(csvData.get(EX_CODER_BELONGED_KEY))
                .setExCoderSkills(csvData.get(EX_CODER_SKILLS_KEY))
                .setExCoderSkills(csvData.get(EX_CODER_SKILLS_KEY))
                .setExCoderWillNotCode(csvData.get(EX_CODER_WILL_NOT_CODE_KEY))
                .setExCoderActive(csvData.get(EX_CODER_ACTIVE_KEY))
                .build();
    }
}
