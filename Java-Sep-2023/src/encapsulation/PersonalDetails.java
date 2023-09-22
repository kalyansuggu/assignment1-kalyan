package encapsulation;

public class PersonalDetails {

	String firstName;
	String lastName;
	
	public PersonalDetails setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public PersonalDetails setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void displayFullName() {
		
		System.out.println("Fulll Name:" + this.getFirstName() + " " + this.getLastName());;  //RAM KUMAR
		
	}
	
	
	public void displayPersonalDetails() {
			
		System.out.println("Fulll Name:" + this.getFirstName() + " " + this.getLastName());;  //RAM KUMAR	
	}
	
//	public static void main(String[] args) {
//		
////		new PersonalDetails().setFirstName("RAM");
////		
////		new PersonalDetails().setLastName("KUMAR");
//		
////		String firstName = new PersonalDetails().getFirstName();
////		
////		System.out.println("FirstName"+ firstName);
//		
////		System.out.println(new PersonalDetails().getFirstName());
////		
////		System.out.println(new PersonalDetails().getLastName());
//		
//		PersonalDetails pd = new PersonalDetails();
//		
//		pd.setFirstName("RAM").setLastName("KUMAR").displayFullName();
//	}
	
	

}
