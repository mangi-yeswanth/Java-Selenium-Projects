package customerdetails;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("customer menu");
			System.out.println("1. Insert Customer");
			System.out.println("2. Insert Product");
			System.out.println("3. Buy Product");
			System.out.println("4. Display Customer Purchases");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1: {
				System.out.print("Enter Customer Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Contact: ");
				String contact = sc.nextLine();
				System.out.print("Enter Gender: ");
				String gender = sc.nextLine();
				System.out.print("Enter Address: ");
				String address = sc.nextLine();
				System.out.print("Enter City: ");
				String city = sc.nextLine();
				System.out.print("Enter Zipcode: ");
				String zipcode = sc.nextLine();

				InsertCustomer ic = new InsertCustomer();
				boolean inserted = ic.insert(name, contact, gender, address, city, zipcode);
				System.out.println(inserted ? "Customer inserted successfully!" : "Failed to insert customer.");
				break;
			}
			case 2: {
				System.out.print("Enter Customer ID: ");
				int custId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Product Code: ");
				String code = sc.nextLine();
				System.out.print("Enter Description: ");
				String desc = sc.nextLine();
				System.out.print("Enter Price: ");
				double price = sc.nextDouble();
				System.out.print("Enter Quantity: ");
				int qty = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Expiry Date: ");
				String expDate = sc.nextLine();

				InsertProduct ip = new InsertProduct();
				boolean inserted = ip.insert(custId, code, desc, price, qty, expDate);
				System.out.println(inserted ? "Product inserted successfully!" : "Failed to insert product.");
				break;
			}
			case 3: {
				System.out.print("Enter Customer ID: ");
				int custId = sc.nextInt();
				System.out.print("Enter Product ID: ");
				int prodId = sc.nextInt();
				System.out.print("Enter Quantity to Buy: ");
				int qty = sc.nextInt();

				BuyProduct bp = new BuyProduct();
				boolean bought = bp.buy(custId, prodId, qty);
				System.out.println(bought ? "Purchase completed!" : "Purchase failed.");
				break;
			}
			case 4: {
				System.out.print("Enter Customer ID: ");
				int custId = sc.nextInt();

				DisplayDetails dd = new DisplayDetails();
				boolean found = dd.display(custId);
				if (!found) {
					System.out.println("No purchases found for this customer.");
				}
				break;
			}
			case 5: {
				System.out.println("Exiting... Thank you!");
				running = false;
				break;
			}
			default:
				System.out.println("Invalid choice! Try again.");
			}
		}

		sc.close();
	}
}