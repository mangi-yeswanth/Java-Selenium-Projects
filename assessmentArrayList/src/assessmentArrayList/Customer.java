package assessmentArrayList;

class Customer {
	private int id;
	private String name;
	private long contact;
	private String location;
//
	public Customer(int id, String name, long contact, String location) {
		super();
		this.id = id;
		this.contact = contact;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public long getContact() {
		return contact;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", contact=" + contact + ", name=" + name + ", location=" + location + "]";
	}

}
