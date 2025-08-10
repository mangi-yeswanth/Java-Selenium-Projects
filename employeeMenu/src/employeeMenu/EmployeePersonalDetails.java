package employeeMenu;

import java.util.ArrayList;
class EmployeePersonalDetails {
	
	private String name;
	private int age;
	private String location;
	private long phonenumber;
	
	
	
    public EmployeePersonalDetails(String name, int age, String location, long phonenumber) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "EmployeePersonalDetails name=" + name + ", age=" + age + ", location=" + location + ", phonenumber="
				+ phonenumber + ", personalDetails=" + personalDetails;
	}

	ArrayList<EmployeePersonalDetails> personalDetails = new ArrayList<>();

    EmployeePersonalDetails() {
    	personalDetails.add(new EmployeePersonalDetails("Yesh",22,"hyderabad",9441419870l));
    }

    void display() {
        System.out.println("Personal Details:");
        for (EmployeePersonalDetails detail : personalDetails) {
            System.out.println(detail);
        }
    }
}