package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment")
public class Equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
    private String equipmentSatisfiedMonitors;
	
	@Column
    private String equipmentSatisfiedCpu;
	
	@Column
    private String equipmentSatisfiedRam;
	
	@Column
    private String equipmentSatisfiedStorage;
	
	@Column
    private String equipmentSatisfiedRw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentSatisfiedMonitors() {
        return equipmentSatisfiedMonitors;
    }

    public void setEquipmentSatisfiedMonitors(String equipmentSatisfiedMonitors) {
        this.equipmentSatisfiedMonitors = equipmentSatisfiedMonitors;
    }

    public String getEquipmentSatisfiedCpu() {
        return equipmentSatisfiedCpu;
    }

    public void setEquipmentSatisfiedCpu(String equipmentSatisfiedCpu) {
        this.equipmentSatisfiedCpu = equipmentSatisfiedCpu;
    }

    public String getEquipmentSatisfiedRam() {
        return equipmentSatisfiedRam;
    }

    public void setEquipmentSatisfiedRam(String equipmentSatisfiedRam) {
        this.equipmentSatisfiedRam = equipmentSatisfiedRam;
    }

    public String getEquipmentSatisfiedStorage() {
        return equipmentSatisfiedStorage;
    }

    public void setEquipmentSatisfiedStorage(String equipmentSatisfiedStorage) {
        this.equipmentSatisfiedStorage = equipmentSatisfiedStorage;
    }

    public String getEquipmentSatisfiedRw() {
        return equipmentSatisfiedRw;
    }

    public void setEquipmentSatisfiedRw(String equipmentSatisfiedRw) {
        this.equipmentSatisfiedRw = equipmentSatisfiedRw;
    }

    @Override
    public String toString() {
        return "Equipment [id=" + id + ", equipmentSatisfiedMonitors=" + equipmentSatisfiedMonitors
                + ", equipmentSatisfiedCPU=" + equipmentSatisfiedCpu + ", equipmentSatisfiedRAM="
                + equipmentSatisfiedRam + ", equipmentSatisfiedStorage=" + equipmentSatisfiedStorage
                + ", equipmentSatisfiedRW=" + equipmentSatisfiedRw + "]";
    }

}
