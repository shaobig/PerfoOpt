package software.sigma.training.po.survey.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ex_coder")
public class ExCoder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column
	private String exCoderReturn;
	
	@Column
	private String exCoderNotForMe;
	
	@Column
	private String exCoderBalance;
	
	@Column
	private String exCoder10Years;
	
	@Column
	private String exCoderBelonged;
	
	@Column
	private String exCoderSkills;
	
	@Column
	private String exCoderWillNotCode;
	
	@Column
	private String exCoderActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExCoderReturn() {
		return exCoderReturn;
	}

	public void setExCoderReturn(String exCoderReturn) {
		this.exCoderReturn = exCoderReturn;
	}

	public String getExCoderNotForMe() {
		return exCoderNotForMe;
	}

	public void setExCoderNotForMe(String exCoderNotForMe) {
		this.exCoderNotForMe = exCoderNotForMe;
	}

	public String getExCoderBalance() {
		return exCoderBalance;
	}

	public void setExCoderBalance(String exCoderBalance) {
		this.exCoderBalance = exCoderBalance;
	}

	public String getExCoder10Years() {
		return exCoder10Years;
	}

	public void setExCoder10Years(String exCoder10Years) {
		this.exCoder10Years = exCoder10Years;
	}

	public String getExCoderBelonged() {
		return exCoderBelonged;
	}

	public void setExCoderBelonged(String exCoderBelonged) {
		this.exCoderBelonged = exCoderBelonged;
	}

	public String getExCoderSkills() {
		return exCoderSkills;
	}

	public void setExCoderSkills(String exCoderSkills) {
		this.exCoderSkills = exCoderSkills;
	}

	public String getExCoderWillNotCode() {
		return exCoderWillNotCode;
	}

	public void setExCoderWillNotCode(String exCoderWillNotCode) {
		this.exCoderWillNotCode = exCoderWillNotCode;
	}

	public String getExCoderActive() {
		return exCoderActive;
	}

	public void setExCoderActive(String exCoderActive) {
		this.exCoderActive = exCoderActive;
	}

}
