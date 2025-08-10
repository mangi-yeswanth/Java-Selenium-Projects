package pkg_comparator;

public class Student {
	private int age;
	private String name;
	public Student(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id=" + age + ", name=" + name + "]";
	}
}
