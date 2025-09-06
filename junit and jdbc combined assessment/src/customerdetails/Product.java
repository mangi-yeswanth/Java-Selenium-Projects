package customerdetails;
public class Product {
    private int product_id;
    private String product_code;
    private String product_description;
    private double product_price;
    private int product_quantity;
    private String product_expdate;

    public Product(int product_id, String product_code, String product_description, double product_price,
                   int product_quantity, String product_expdate) {
        this.product_id = product_id;
        this.product_code = product_code;
        this.product_description = product_description;
        this.product_price = product_price;
        this.product_quantity = product_quantity;
        this.product_expdate = product_expdate;
    }

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getProduct_description() {
		return product_description;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public String getProduct_expdate() {
		return product_expdate;
	}

	public void setProduct_expdate(String product_expdate) {
		this.product_expdate = product_expdate;
	}

    
}
