package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExamples {
	//1.shuffle the taken array using shuffle
	 public List<String> shuffleArrayList(List<String> list) {
	        List<String> shuffledlist = new ArrayList<>(list);
	        Collections.shuffle(shuffledlist);
	        return shuffledlist;
	    }

	    // 2. Extract a portion of an ArrayList 
	    public  List<String> extractPortion(List<String> list, int fromIndex, int toIndex) {
	        return new ArrayList<>(list.subList(fromIndex, toIndex));
	    }

	    // 3. Replace the second element of an ArrayList with newelement.
	    public List<String> replaceSecondElement(List<String> list, String newElement) {
	        if (list.size()>= 2) {
	            list.set(1, newElement);
	        }
	        return list;
	    }

	    // 4. Clone a HashSet to another HashSet
	    public Set<String> cloneAHashSet(Set<String> original) {
	    	Set<String> newHashSet = new HashSet<>(original);
	        return newHashSet;
	    }

	    // 5. Convert a HashSet to a TreeSet
	    public Set<String> convertToTreeSet(Set<String> hashSet) {
	    	Set<String> treeSet=new TreeSet<>(hashSet);
	        return treeSet;
	    }

	    // 6. Get collection view of keys contained in a map
	    public Set<String> getKeyView(Map<String, String> map) {
	        return map.keySet();
	    }
}
