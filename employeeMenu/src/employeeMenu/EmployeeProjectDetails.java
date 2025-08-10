package employeeMenu;

import java.util.ArrayList;

public class EmployeeProjectDetails {
	private int numberofprojects;
	private String projecttype;
	
	
	public EmployeeProjectDetails(int numberofprojects, String projecttype) {
		super();
		this.numberofprojects = numberofprojects;
		this.projecttype = projecttype;
	}
	public String toString() {
        return "Number of Projects: " + numberofprojects + ", Project Type: " + projecttype;
    }

	ArrayList<EmployeeProjectDetails> projectDetails = new ArrayList<>();

    EmployeeProjectDetails() {
        projectDetails.add(new EmployeeProjectDetails(4,"IT project"));
        
    }

    void display() {
        System.out.println("Project Details:");
        for (EmployeeProjectDetails detail : projectDetails) {
            System.out.println(detail);
        }
    }
}
