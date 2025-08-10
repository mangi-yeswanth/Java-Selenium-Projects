package pkg_wrapperclasses;

public class WrapperExample {

	public static void main(String[] args) {
		boolean booleanvalue = Boolean.parseBoolean("TruE");
		boolean booleanvalue1 = Boolean.parseBoolean("false");
		Boolean boolean1 = Boolean.valueOf("TRUE");
		Boolean boolean2 = Boolean.valueOf("0");
		boolean primiBoolean1 = boolean1.booleanValue();
		boolean primiBoolean2 = boolean2.booleanValue();
		System.out.println("using parseboolean: "+booleanvalue); 
		System.out.println("using parseboolean: "+booleanvalue1);
		System.out.println("using valueOf(): " + boolean1);
		System.out.println("using valueOf(): " + boolean2); 
		
		System.out.println("using booleanValue(): " + primiBoolean1);
		System.out.println("using booleanValue(): " + primiBoolean2);

	}

}
