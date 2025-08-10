package pkg_employe;

public class Emp1 {

	public static void main(String[] args) {

		Employe empl1 = new Employe(101, "m.yeswanth", "ECE", 18000);
		System.out.println(empl1);
		Employe empl2 = new Employe(102, "T.Shelby", "CSE", 15000);
		System.out.println(empl2);
		Employe empl3 = new Employe(103, "L.Harsha", "ECE", 28000);
		System.out.println(empl3);
		Employe empl4 = new Employe(104, "R.Yaswanth", "ECE", 30000);
		System.out.println(empl4);
		Employe empl5 = new Employe(105, "P.Likith", "IT", 25000);
		System.out.println(empl5);
		empl1.setId(106);
		empl2.setId(107);
		empl3.setId(108);
		empl4.setId(109);
		empl5.setId(110);
		empl1.setName("m.yeswanth");
		empl2.setName("T.Shelby");
		empl3.setName("L.Harsha");
		empl4.setName("R.Yaswanth");
		empl5.setName("P.Likith");
		empl1.setDepartment("ECE");
		empl2.setDepartment("CSE");
		empl3.setDepartment("ECE");
		empl4.setDepartment("ECE");
		empl5.setDepartment("IT");
		empl1.setSalary(20000);
		empl2.setSalary(25000);
		empl3.setSalary(28000);
		empl4.setSalary(16000);
		empl5.setSalary(18000);
		System.out.println("Employee id " + empl1.getId() + " name " + empl1.getName() + " Department: "
				+ empl1.getDepartment() + " salary :" + empl1.getSalary());
		System.out.println("Employee id " + empl2.getId() + " name " + empl2.getName() + " Department: "
				+ empl2.getDepartment() + " salary :" + empl2.getSalary());
		System.out.println("Employee id " + empl3.getId() + " name " + empl3.getName() + " Department: "
				+ empl3.getDepartment() + " salary :" + empl3.getSalary());
		System.out.println("Employee id " + empl4.getId() + " name " + empl4.getName() + " Department: "
				+ empl4.getDepartment() + " salary :" + empl4.getSalary());
		System.out.println("Employee id " + empl5.getId() + " name " + empl5.getName() + " Department: "
				+ empl5.getDepartment() + " salary :" + empl5.getSalary());

	}

}
