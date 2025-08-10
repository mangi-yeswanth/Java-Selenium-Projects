package pkg_Hashset;

import java.util.HashSet;

public class HashCodeDemo {
   public static void main(String[] args) {
      HashSet<Person> people = new HashSet<>();
 
       Person p1 = new Person("Harry", 25);
       Person p2 = new Person("Steven", 30);
       Person p3 = new Person("Harry", 25); // Same as p1
 
      people.add(p1);   // p1 is sharing a different memory loc
      people.add(p2);
      people.add(p3); // Will NOT be added (duplicate) // // p3 is sharing a different memory loc
 
      System.out.println("People in HashSet:");
       for (Person p : people) {
          System.out.println(p + " - hashCode: " + p.hashCode());
       }
   }
}
