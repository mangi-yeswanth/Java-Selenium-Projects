package customerdetails;
public class Customer {
    private int cust_id;
    private String cust_name;
    private String cust_contact;
    private String cust_gender;
    private String cust_address;
    private String cust_city;
    private String cust_zipcode;

    // Constructor
    public Customer(int cust_id, String cust_name, String cust_contact, String cust_gender,
                    String cust_address, String cust_city, String cust_zipcode) {
        this.cust_id = cust_id;
        this.cust_name = cust_name;
        this.cust_contact = cust_contact;
        this.cust_gender = cust_gender;
        this.cust_address = cust_address;
        this.cust_city = cust_city;
        this.cust_zipcode = cust_zipcode;
    }

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_contact() {
		return cust_contact;
	}

	public void setCust_contact(String cust_contact) {
		this.cust_contact = cust_contact;
	}

	public String getCust_gender() {
		return cust_gender;
	}

	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCust_city() {
		return cust_city;
	}

	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}

	public String getCust_zipcode() {
		return cust_zipcode;
	}

	public void setCust_zipcode(String cust_zipcode) {
		this.cust_zipcode = cust_zipcode;
	}
    
    
}