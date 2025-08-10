package employeeMenu;
import java.util.ArrayList;
import java.util.Scanner;
class EmployeeProfessionalDetails {
	private int employeid;
	private String department;
	private String role;
	private String experience;
	
    public EmployeeProfessionalDetails(int employeid, String department, String role, String experience) {
		super();
		this.employeid = employeid;
		this.department = department;
		this.role = role;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmployeeProfessionalDetails employeid=" + employeid + ", department=" + department + ", role=" + role
				+ ", experience=" + experience + ", professionalDetails=" + professionalDetails;
	}

	ArrayList<EmployeeProfessionalDetails> professionalDetails = new ArrayList<>();

    EmployeeProfessionalDetails() {
    	professionalDetails.add(new EmployeeProfessionalDetails(101, "IT", "package app developer", "6 years"));
    	//to add new employee details we can add here with .add 
    }

    void display() {
        System.out.println("Professional Details");
        for (EmployeeProfessionalDetails detail : professionalDetails) {
            System.out.println(detail);
        }
    }
}