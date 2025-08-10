package assessmentongenerics;

public class Main {
	public static void main(String[] args) {
	// Box for Integer
	Box1<Integer> intBox = new Box1<>();
	intBox.set(100);
	System.out.println("Integer value: " + intBox.get());
	// Box for String
	Box1<String> strBox = new Box1<>();
	strBox.set("Implementing Generics");
	System.out.println("String value: " + strBox.get());
	// Box for Double
	Box1<Double> dVar = new Box1<>();
	dVar.set(3543.33);
	System.out.println("Double value: " + dVar.get());
}

}
