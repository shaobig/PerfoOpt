package software.sigma.training.po.survey.data.domain.transformer;

import software.sigma.training.po.survey.data.domain.builder.EquipmentBuilder;
import software.sigma.training.po.survey.data.domain.Equipment;

import java.util.Map;

public class EquipmentTransformer implements EntityTransformer<Equipment> {

    private static final String EQUIPMENT_SATISFIED_MONITORS_KEY = "EquipmentSatisfiedMonitors";
    private static final String EQUIPMENT_SATISFIED_CPU_KEY = "EquipmentSatisfiedCPU";
    private static final String EQUIPMENT_SATISFIED_RAM_KEY = "EquipmentSatisfiedRAM";
    private static final String EQUIPMENT_SATISFIED_STORAGE_KEY = "EquipmentSatisfiedStorage";
    private static final String EQUIPMENT_SATISFIED_RW_KEY = "EquipmentSatisfiedRW";

    @Override
    public Equipment transform(Map<String, String> csvData) {
        return new EquipmentBuilder()
                .setEquipmentSatisfiedMonitors(csvData.get(EQUIPMENT_SATISFIED_MONITORS_KEY))
                .setEquipmentSatisfiedCpu(csvData.get(EQUIPMENT_SATISFIED_CPU_KEY))
                .setEquipmentSatisfiedRam(csvData.get(EQUIPMENT_SATISFIED_RAM_KEY))
                .setEquipmentSatisfiedStorage(csvData.get(EQUIPMENT_SATISFIED_STORAGE_KEY))
                .setEquipmentSatisfiedRw(csvData.get(EQUIPMENT_SATISFIED_RW_KEY))
                .build();
    }

}
