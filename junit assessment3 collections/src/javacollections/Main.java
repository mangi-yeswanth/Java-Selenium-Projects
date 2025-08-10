package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		CollectionsExamples CE=new CollectionsExamples();
		List<String>input1=Arrays.asList("batman","superman","spiderman","deadpool","Ironman");
		System.out.println("list before shuffle"+input1);
		System.out.println("list after shuffle "+CE.shuffleArrayList(input1));
		System.out.println();
		List<String>input2=Arrays.asList("batman","superman","spiderman","deadpool","Ironman");
		System.out.println("full list"+input2);
		System.out.println("sub portion"+CE.extractPortion((input2),1,4));
		
		List<String> list = Arrays.asList("god of war","tekken","urban","Ratatoullie","san andreas");
        System.out.println("Original List: " + list);
        CE.replaceSecondElement(list, "tekken3");
        System.out.println("After Replacing Second Element: " + list);

        Set<String> originalSet = new HashSet<>(Arrays.asList("Cat", "Elephant", "Dog"));
        Set<String> clonedSet = CE.cloneAHashSet(originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);

       
        Set<String> treeSet = CE.convertToTreeSet(originalSet);
        System.out.println("Converted TreeSet " + treeSet);

        Map<String, String> map = new HashMap<>();
        map.put("1", "raavan");
        map.put("2", "ram");
        map.put("3", "lakshman");
        Set<String> keys = CE.getKeyView(map);
        System.out.println("Keys in Map: " + keys);
    }
	}
	
