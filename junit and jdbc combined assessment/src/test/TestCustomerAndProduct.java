package test;

import customerdetails.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class TestCustomerAndProduct {
	BuyProduct bp=new BuyProduct();
	DisplayDetails dd=new DisplayDetails();
	InsertCustomer ic=new InsertCustomer();
	InsertProduct ip=new InsertProduct();
	
	
	private Connection connect;
    private String url = "jdbc:mysql://localhost:3306/customer";
    private String username = "root";
    private String password = "Yesh@66543211";
	

    @BeforeEach
    public void setup() {
        try {
            connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void tearDown() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @DisplayName("test on inserting customer")
   	@Test
   	public void testInsertCustomer() {
   		boolean result = ic.insert("giyu","2234466387","male ","urokodaki","DS","535422");
   		assertTrue(result,"Customer insertion failed");
    }
    @DisplayName("test on inserting products")
   	@Test
   	public void testInsertproduct() {
   		boolean result = ip.insert(4,"444","urban game",600d,15,"2027-04-29");
   		assertTrue(result,"product insertion failed!");
    }
    @DisplayName("Test on displaying customer purchases")
    @Test
    void testDisplayDetails() {
        boolean result = dd.display(2);
        assertTrue(result, "Customer purchases were not displayed ,maybe no product exists?");
    }
    @DisplayName("Test on buying product")
    @Test
    void testBuyProduct() {

        boolean result = bp.buy(3, 1, 2);
        assertTrue(result, "Product purchase failed!");
    }
    
    
    
    
    
    
}