package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class DCEntity {

	@Id
	private Integer app_ID;
	
	private Integer case_Number;
	
	private String plan_Names;
	
	private Double monthly_Income;
	
	private Double property_Income;
	
	private Double rent_Income;
	
	private String highest_Degree;
	
	private String university_Name;
	
	private String kid_Name;
	
	private Integer kid_Age;
	
	private Integer kid_Ssn;
	
}
