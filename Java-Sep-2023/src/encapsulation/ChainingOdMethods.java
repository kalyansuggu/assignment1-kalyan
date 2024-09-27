package encapsulation;

public class ChainingOdMethods {

	public static void main(String[] args) {
		
		PersonalDetails personalDetails = new PersonalDetails();
		ProfessionalDetails professionalDetails = new ProfessionalDetails(personalDetails.setFirstName("RAM").setLastName("KUMAR"));
		
		professionalDetails.setJobDesignation("Automation Test Engineer")
		.setCompanyName("TCS")
		.getFullDetails(personalDetails.setFirstName("RAM").setLastName("KUMAR"));
		
		System.out.println("----------------------------------------------------------");
		professionalDetails.setJobDesignation("Automation Test Engineer")
		.setCompanyName("TCS")
		.getFullDetails();
		
		
		
	}

}
