package pkg_oops;

public class obj {

	public static void main(String[] args) {
		// using to string method
		OopsDemo bike1 = new OopsDemo("tvs", 2018);
		System.out.println(bike1);
//using set 
		bike1.setModel("ns200");
		bike1.setYear(2023);
		System.out.println(bike1.getModel());
		System.out.println(bike1.getYear());
	}

}
