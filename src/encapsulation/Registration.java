package encapsulation;

import java.util.Scanner;

public class Registration {
	Scanner scan = new Scanner(System.in);
	
	
	public void display() {
		
		Student oStudent = new Student();
		
		oStudent.setAdmissionId(scan.nextInt());
		oStudent.setName(scan.next());
		oStudent.setPhoneNumber(scan.nextInt());
		oStudent.setEmail(scan.next());
		System.out.println("AdmissionId: "+oStudent.getAdmissionId()+"\nName: "+oStudent.getName()+"\nPhoneNumber: "+oStudent.getPhoneNumber()+"\nEmailID: "+oStudent.getEmail());
	}
		
	

	public static void main(String[] args) {
		
		
		Registration oRegistration = new Registration();
		oRegistration.display();
	}

}
