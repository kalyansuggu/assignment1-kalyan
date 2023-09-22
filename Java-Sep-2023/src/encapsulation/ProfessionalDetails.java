package encapsulation;

public class ProfessionalDetails {
	
	String jobDesignation;
	String companyName;
	
	static PersonalDetails pd;
	
	ProfessionalDetails(PersonalDetails pd){
		ProfessionalDetails.pd = pd;
	}
	
	public ProfessionalDetails setJobDesignation(String jobDesignation) {
		this.jobDesignation = jobDesignation;
		return this;
	}
	
	public String getJobDesignation() {
		return jobDesignation;
	}
	
	public ProfessionalDetails setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void getFullDetails(PersonalDetails pd) {
		
		System.out.println("Designation : "+ this.getJobDesignation());
		
		System.out.println("Company Name: " + this.getCompanyName());
		
		pd.displayFullName();
		
	}
	
	
	public void getFullDetails() {
		
		System.out.println("Designation : "+ this.getJobDesignation());
		
		System.out.println("Company Name: " + this.getCompanyName());
		
		pd.displayFullName();
		
	}
	

}
