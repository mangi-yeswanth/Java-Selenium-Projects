package assessmentArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CustomerInformation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Customer>customerlist = new ArrayList<>();
		customerlist.add(new Customer(101,"Yesh",9441619860l,"Hyderabad"));
		customerlist.add(new Customer(102,"resh",9878685843l,"Bangalore"));
		customerlist.add(new Customer(103,"Harsh",6309766543l,"Mumbai"));
		customerlist.add(new Customer(104,"kiiki",9398421510l,"New Delhi"));
		//Collections.sort(customerlist);
		System.out.println("the list of Customers is: ");
		Iterator<Customer> iterate = customerlist.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        customerlist.remove(3);
        
        System.out.println("the list after removing 3rd index ");
        iterate = customerlist.iterator(); 
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        System.out.print("Enter Customer ID to get : ");
        int customerId = sc.nextInt();
        for (Customer customer : customerlist) {
            if (customer.getId() == customerId) {
                System.out.println("found the customer");
                System.out.println("the customer name is: "+customer.getName()+" the lacation is: "+customer.getLocation());
                break;
            }
            else {
            	System.out.println("Customer "+customerId+" not found in the list!!!...");
            	break;
            }
        }
        sc.close();
        

	}

}
