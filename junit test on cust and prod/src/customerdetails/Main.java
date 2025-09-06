package customerdetails;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InsertCustomer insertCustomer = new InsertCustomer();
        InsertProduct insertProduct = new InsertProduct();
        DisplayDetails displayDetails = new DisplayDetails();
        BuyProduct buyProduct = new BuyProduct();

        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Display Customer Details");
            System.out.println("4. Buy Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer ID: ");
                    int cid = sc.nextInt(); sc.nextLine();

                    System.out.println("Enter Customer Name: ");
                    String cname = sc.nextLine();

                    System.out.println("Enter Contact: ");
                    String contact = sc.nextLine();

                    System.out.println("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.println("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.println("Enter City: ");
                    String city = sc.nextLine();

                    System.out.println("Enter Zipcode: ");
                    String zip = sc.nextLine();

                    Customer cust = new Customer(cid, cname, contact, gender, address, city, zip);
                    if (insertCustomer.insert(cust)) {
                        System.out.println("Customer inserted successfully!");
                    } else {
                        System.out.println("Failed to insert customer!");
                    }
                    break;

                case 2:
                    System.out.println("Enter Customer ID (who owns product): ");
                    int custIdForProd = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Product ID: ");
                    int pid = sc.nextInt(); sc.nextLine();

                    System.out.println("Enter Product Code: ");
                    String pcode = sc.nextLine();

                    System.out.println("Enter Product Description: ");
                    String pdesc = sc.nextLine();

                    System.out.println("Enter Product Price: ");
                    double price = sc.nextDouble();

                    System.out.println("Enter Product Quantity: ");
                    int qty = sc.nextInt(); sc.nextLine();

                    System.out.println("Enter Expiry Date (yyyy-mm-dd): ");
                    String expdate = sc.nextLine();

                    Product prod = new Product(pid, pcode, pdesc, price, qty, expdate);
                    if (insertProduct.insert(custIdForProd, prod)) {
                        System.out.println(" Product inserted successfully!");
                    } else {
                        System.out.println(" Failed to insert product!");
                    }
                    break;

                case 3:
                    System.out.println("Enter Customer ID to display details: ");
                    int custIdDisplay = sc.nextInt();
                    sc.nextLine();

                    Customer displayCust = new Customer(custIdDisplay, "", "", "", "", "", "");
                    if (!displayDetails.display(displayCust)) {
                        System.out.println(" No details found for customer!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Customer ID: ");
                    int custIdBuy = sc.nextInt();

                    System.out.println("Enter Product ID: ");
                    int prodIdBuy = sc.nextInt();

                    System.out.println("Enter Quantity to Buy: ");
                    int buyQty = sc.nextInt();
                    sc.nextLine();

                    Customer buyCust = new Customer(custIdBuy, "", "", "", "", "", "");
                    Product buyProd = new Product(prodIdBuy, "", "", 0, 0, "");

                    buyProduct.buy(buyCust, buyProd, buyQty);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
