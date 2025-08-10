package employeeMenu;

import java.util.ArrayList;

public class EmployeeSalaryDetails {
	private long salary;
	
	public EmployeeSalaryDetails(long salary) {
		super();
		this.salary = salary;
	}
	ArrayList<EmployeeSalaryDetails> salaryDetails = new ArrayList<>();

    @Override
	public String toString() {
		return "EmployeeSalaryDetails salary=" + salary + ", salaryDetails=" + salaryDetails ;
	}
	EmployeeSalaryDetails() {
    	salaryDetails.add(new EmployeeSalaryDetails(30000l));
}
    void display() {
        System.out.println("Salary Details:");
        for (EmployeeSalaryDetails detail : salaryDetails) {
            System.out.println(detail);
        }
}
}
