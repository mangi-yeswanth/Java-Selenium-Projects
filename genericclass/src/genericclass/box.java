package genericclass;
class Box<T> {
	private T item;

	public void set(T item0) {
		this.item = item;
	}

	public T get() {
		return item;
	}

}

class main {
	public static void main(String[] args) {
		// Box for Integer
		Box<Integer> intBox = new Box<>();
		intBox.set(100);
		System.out.println("Integer value: " + intBox.get());
		// Box for String
		Box<String> strBox = new Box<>();
		strBox.set("Implementing Generics");
		System.out.println("String value: " + strBox.get());
		// Box for Double
		Box<Double> dVar = new Box<>();
		dVar.set(3543.33);
		System.out.println("Double value: " + dVar.get());
	}
}