package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.TechnicalDetails;
import software.sigma.training.po.survey.data.domain.builder.TechnicalDetailsBuilder;

import java.util.Map;

public class TechnicalDetailsTransformer implements EntityTransformer<TechnicalDetails> {

    private static final String IDE_KEY = "IDE";
    private static final String AUDITORY_ENVIRONMENT_KEY = "AuditoryEnvironment";
    private static final String METHODOLOGY_KEY = "Methodology";
    private static final String VERSION_CONTROL_KEY = "VersionControl";
    private static final String CHECK_IN_CODE_KEY = "CheckInCode";
    private static final String SHIP_IT_KEY = "ShipIt";
    private static final String OTHER_PEOPLES_CODE_KEY = "OtherPeoplesCode";
    private static final String PROJECT_MANAGEMENT_KEY = "ProjectManagement";
    private static final String ENJOY_DEBUGGING_KEY = "EnjoyDebugging";
    private static final String IN_THE_ZONE_KEY = "InTheZone";
    private static final String DIFFICULT_COMMUNICATION_KEY = "DifficultCommunication";
    private static final String COLLABORATE_REMOTE_KEY = "CollaborateRemote";
    private static final String METRIC_ASSESS_KEY = "MetricAssess";
    private static final String TABS_SPACES_KEY = "TabsSpaces";

    @Override
    public TechnicalDetails transform(Map<String, String> csvData) {
        return new TechnicalDetailsBuilder()
                .setIde(csvData.get(IDE_KEY))
                .setAuditoryEnvironment(csvData.get(AUDITORY_ENVIRONMENT_KEY))
                .setMethodology(csvData.get(METHODOLOGY_KEY))
                .setVersionControl(csvData.get(VERSION_CONTROL_KEY))
                .setCheckInCode(csvData.get(CHECK_IN_CODE_KEY))
                .setShipIt(csvData.get(SHIP_IT_KEY))
                .setOtherPeoplesCode(csvData.get(OTHER_PEOPLES_CODE_KEY))
                .setProjectManagement(csvData.get(PROJECT_MANAGEMENT_KEY))
                .setEnjoyDebugging(csvData.get(ENJOY_DEBUGGING_KEY))
                .setInTheZone(csvData.get(IN_THE_ZONE_KEY))
                .setDifficultCommunication(csvData.get(DIFFICULT_COMMUNICATION_KEY))
                .setCollaborateRemote(csvData.get(COLLABORATE_REMOTE_KEY))
                .setMetricAssess(csvData.get(METRIC_ASSESS_KEY))
                .setTabsSpaces(csvData.get(TABS_SPACES_KEY))
                .build();
    }

}
