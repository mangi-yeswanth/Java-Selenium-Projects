package pkg_oops;

class OopsDemo {
	private String model;
	private int year;

	public OopsDemo(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public void print() {
		System.out.println("model of the bike is: " + model);
		System.out.println("purchase year is: " + year);

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "OopsDemo [model=" + model + ", year=" + year + "]";
	}

}