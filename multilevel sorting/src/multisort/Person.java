package multisort;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
 
	public int getAge() {
		return age;
	}

	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name + " " + this.age;
	}
}
 
class PersonMain{
	public static void main(String[] args){
		List<Person> person = Arrays.asList(
			new Person("Brian",30),
			new Person("Harry",23),
			new Person("Brian",25)
		);
		System.out.println("Original List");
		System.out.println(person);
		person.sort(Comparator.comparing((Person p)->p.getName()).thenComparing(p->p.getAge()));
		System.out.println("Sorted list by name then by age: ");
		for(Person p:person){
			System.out.println(p);
		}	
		System.out.println(person);
	}
}	