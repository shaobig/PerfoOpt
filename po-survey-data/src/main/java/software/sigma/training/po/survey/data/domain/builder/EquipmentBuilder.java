package software.sigma.training.po.survey.data.domain.builder;

import software.sigma.training.po.survey.data.domain.Equipment;

public class EquipmentBuilder implements EntityBuilder<Equipment> {

    private final Equipment equipment;

    public EquipmentBuilder() {
        this.equipment = new Equipment();
    }

    @Override
    public Equipment build() {
        return getEquipment();
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public EquipmentBuilder setEquipmentSatisfiedMonitors(String equipmentSatisfiedMonitors) {
        getEquipment().setEquipmentSatisfiedMonitors(equipmentSatisfiedMonitors);
        return this;
    }

    public EquipmentBuilder setEquipmentSatisfiedCpu(String equipmentSatisfiedCpu) {
        getEquipment().setEquipmentSatisfiedCpu(equipmentSatisfiedCpu);
        return this;
    }

    public EquipmentBuilder setEquipmentSatisfiedRam(String equipmentSatisfiedRam) {
        getEquipment().setEquipmentSatisfiedRam(equipmentSatisfiedRam);
        return this;
    }

    public EquipmentBuilder setEquipmentSatisfiedStorage(String equipmentSatisfiedStorage) {
        getEquipment().setEquipmentSatisfiedStorage(equipmentSatisfiedStorage);
        return this;
    }

    public EquipmentBuilder setEquipmentSatisfiedRw(String equipmentSatisfiedRw) {
        getEquipment().setEquipmentSatisfiedRw(equipmentSatisfiedRw);
        return this;
    }

}
