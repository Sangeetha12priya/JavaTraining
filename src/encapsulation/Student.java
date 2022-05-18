package encapsulation;

class Student {
	
	private int admissionId,phoneNumber;
	private String name,email;
	
	public void setAdmissionId(int admissionId){
		this.admissionId = admissionId;
	}
	
	public int getAdmissionId() {
		return admissionId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

}
