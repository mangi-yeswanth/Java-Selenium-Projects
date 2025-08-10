package reversoarray;
import java.util.Arrays;
public class ReverseArray {
	public static void Reverse(int[] arr) {
		int[] reverse = new int[arr.length];

        // Copy in reverse order
        for (int i = 0; i < arr.length; i++) {
            reverse[i] = arr[arr.length - 1 - i];
        }
	    
	System.out.println("the reversed array is"+Arrays.toString(reverse));
	
}
	
	public static void main(String[] args) {
		ReverseArray array=new ReverseArray();
		int arraytoreverse[]= {2,4,6,8,9,10};
		array.Reverse(arraytoreverse);
	}
}
