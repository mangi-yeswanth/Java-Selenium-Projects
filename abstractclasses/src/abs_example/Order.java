package abs_example;
abstract class Order {
    protected String order_id;

    public Order(String order_id) {
        this.order_id = order_id;
    }

    public abstract void process_order();

    public void print_order_summary() {
        System.out.println("Order " + order_id + " summary printed.");
    }
}

// Subclass for physical product order
class PhysicalProductOrder extends Order {
    public PhysicalProductOrder(String order_id) {
        super(order_id);
    }

    @Override
    public void process_order() {
        System.out.println("Shipping physical product for order " + order_id + ".");
    }
}

// Subclass for digital product order
class DigitalProductOrder extends Order {
    public DigitalProductOrder(String order_id) {
        super(order_id);
    }

    @Override
    public void process_order() {
        System.out.println("Sending download link for order " + order_id + ".");
    }
}

// Subclass for service order
class ServiceOrder extends Order {
    public ServiceOrder(String order_id) {
        super(order_id);
    }

    @Override
    public void process_order() {
        System.out.println("Scheduling service for order " + order_id + ".");
    }
}
