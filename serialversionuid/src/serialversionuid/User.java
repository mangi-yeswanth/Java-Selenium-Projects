package serialversionuid;
import java.io.Serializable;
public class User implements Serializable {
private static final long serialVersionUID = 1L;
String username;
String email;
int age;
public User(String username, String email,int age) {
	this.username = username;
	this.email = email;
	this.age=age;
	}
public void display() {
    System.out.println("Name: " + username +" email: "+email+" age: "+age);
 }

}
//Serialize This Object
