package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.ImportantHiring;

public class ImportantHiringBuilder implements EntityBuilder<ImportantHiring> {

    private final ImportantHiring importantHiring;

    public ImportantHiringBuilder() {
        this.importantHiring = new ImportantHiring();
    }

    @Override
    public ImportantHiring build() {
        return getImportantHiring();
    }

    public ImportantHiring getImportantHiring() {
        return importantHiring;
    }

    public ImportantHiringBuilder setLearnedHiring(String learnedHiring) {
        getImportantHiring().setLearnedHiring(learnedHiring);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringAlgorithms(String importantHiringAlgorithms) {
        getImportantHiring().setImportantHiringAlgorithms(importantHiringAlgorithms);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringTechExp(String importantHiringTechExp) {
        getImportantHiring().setImportantHiringTechExp(importantHiringTechExp);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringCommunication(String importantHiringCommunication) {
        getImportantHiring().setImportantHiringCommunication(importantHiringCommunication);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringOpenSource(String importantHiringOpenSource) {
        getImportantHiring().setImportantHiringOpenSource(importantHiringOpenSource);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringPMExp(String importantHiringPMExp) {
        getImportantHiring().setImportantHiringPMExp(importantHiringPMExp);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringCompanies(String importantHiringCompanies) {
        getImportantHiring().setImportantHiringCompanies(importantHiringCompanies);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringTitles(String importantHiringTitles) {
        getImportantHiring().setImportantHiringTitles(importantHiringTitles);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringEducation(String importantHiringEducation) {
        getImportantHiring().setImportantHiringEducation(importantHiringEducation);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringRep(String importantHiringRep) {
        getImportantHiring().setImportantHiringRep(importantHiringRep);
        return this;
    }

    public ImportantHiringBuilder setImportantHiringGettingThingsDone(String importantHiringGettingThingsDone) {
        getImportantHiring().setImportantHiringGettingThingsDone(importantHiringGettingThingsDone);
        return this;
    }

}
