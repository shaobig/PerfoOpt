package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.TechnicalDetails;

public class TechnicalDetailsBuilder implements EntityBuilder<TechnicalDetails> {

    private TechnicalDetails technicalDetails;

    public TechnicalDetailsBuilder() {
        this.technicalDetails = new TechnicalDetails();
    }

    @Override
    public TechnicalDetails build() {
        return getTechnicalDetails();
    }

    public TechnicalDetails getTechnicalDetails() {
        return technicalDetails;
    }

    public TechnicalDetailsBuilder setIde(String ide) {
        getTechnicalDetails().setIde(ide);
        return this;
    }

    public TechnicalDetailsBuilder setAuditoryEnvironment(String auditoryEnvironment) {
        getTechnicalDetails().setAuditoryEnvironment(auditoryEnvironment);
        return this;
    }

    public TechnicalDetailsBuilder setMethodology(String methodology) {
        getTechnicalDetails().setMethodology(methodology);
        return this;
    }

    public TechnicalDetailsBuilder setVersionControl(String versionControl) {
        getTechnicalDetails().setVersionControl(versionControl);
        return this;
    }

    public TechnicalDetailsBuilder setCheckInCode(String checkInCode) {
        getTechnicalDetails().setCheckInCode(checkInCode);
        return this;
    }

    public TechnicalDetailsBuilder setShipIt(String shipIt) {
        getTechnicalDetails().setShipIt(shipIt);
        return this;
    }

    public TechnicalDetailsBuilder setOtherPeoplesCode(String otherPeoplesCode) {
        getTechnicalDetails().setOtherPeoplesCode(otherPeoplesCode);
        return this;
    }

    public TechnicalDetailsBuilder setProjectManagement(String projectManagement) {
        getTechnicalDetails().setProjectManagement(projectManagement);
        return this;
    }

    public TechnicalDetailsBuilder setEnjoyDebugging(String enjoyDebugging) {
        getTechnicalDetails().setEnjoyDebugging(enjoyDebugging);
        return this;
    }

    public TechnicalDetailsBuilder setInTheZone(String inTheZone) {
        getTechnicalDetails().setInTheZone(inTheZone);
        return this;
    }

    public TechnicalDetailsBuilder setDifficultCommunication(String difficultCommunication) {
        getTechnicalDetails().setDifficultCommunication(difficultCommunication);
        return this;
    }

    public TechnicalDetailsBuilder setCollaborateRemote(String collaborateRemote) {
        getTechnicalDetails().setCollaborateRemote(collaborateRemote);
        return this;
    }

    public TechnicalDetailsBuilder setMetricAssess(String metricAssess) {
        getTechnicalDetails().setMetricAssess(metricAssess);
        return this;
    }

    public TechnicalDetailsBuilder setTabsSpaces(String tabsSpaces) {
        getTechnicalDetails().setTabsSpaces(tabsSpaces);
        return this;
    }

}
