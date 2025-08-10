package abs_example;

public class MainAbs {

	public static void main(String[] args) {
		Order order1=new PhysicalProductOrder("ID00112");
		order1.process_order();
		order1.print_order_summary();
		Order order2=new DigitalProductOrder("ID00133");
		order2.process_order();
		order2.print_order_summary();
		Order order3 = new ServiceOrder("ID00156");
		order3.process_order();
		order3.print_order_summary();
		Order or=new PhysicalProductOrder("yogianna");
		or.process_order();
	}
}
