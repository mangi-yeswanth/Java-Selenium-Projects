package pkg_collections;
import java.util.*;
class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
		System.out.println("Original List: " + fruits);
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.set(2, "Blueberry");
        System.out.println("After set: " + fruits);
        fruits.remove("Apple"); // Removes first "Apple"
        System.out.println("After removing 'Apple': " + fruits);
        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));
        System.out.println("Size: " + fruits.size());
        System.out.println("Sublist (0 to 2): " + fruits.subList(0, 2));
        fruits.clear();
		System.out.println("Empty List: "+fruits);
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}