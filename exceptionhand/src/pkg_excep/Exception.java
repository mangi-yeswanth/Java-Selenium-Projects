package pkg_excep;

public class Exception {
	

	public static void checkMoney(int money)throws IllegalArgumentException {
		if (money>=350) {
			throw new IllegalArgumentException("not enough money to purchase");
		}
		else {
			System.out.println("available for purchase:");
		}
	}
	    public static void main(String[] args) {

	try {
		checkMoney(500);
	}
	catch(IllegalArgumentException iae){
				System.out.println(iae.getMessage());
	}
	}
}
