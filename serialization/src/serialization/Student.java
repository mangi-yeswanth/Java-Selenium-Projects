package serialization;
import java.io.Serializable;
class Student implements Serializable {
	   private String name;
	   private int age;
	 
	   public Student(String name, int age) {
	       this.name = name;
	       this.age = age;
	   }
	 
	   public void display() {
	      System.out.println("Name: " + name + ", Age: " + age);
	   }
	}
