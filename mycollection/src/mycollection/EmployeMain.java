package mycollection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Employee{
private int id;
private String name,department;
public Employee(int id, String name, String department) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getDepartment() {
	return department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
}

}
class EmployeMain{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Employee>employelist = new ArrayList<>();
		employelist.add(new Employee(101,"Yesh","ECE"));
		employelist.add(new Employee(102,"Resh","CSE"));
		employelist.add(new Employee(103,"Harsh","EEE"));
		employelist.add(new Employee(104,"Tara","IT"));
		System.out.println("the total list is :");
		for(Employee emp:employelist) {
			
		}
		System.out.println(employelist);
		System.out.println("enter emp id to search");
		int search=sc.nextInt();
		boolean found=false;
		
		
		
		
		
		
		
	}
	
}

