package test;

import java.util.List;
import javacollections.CollectionsExamples;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class TestCollectionsExamples {
	CollectionsExamples ce=new CollectionsExamples();
	@Test
	public void testExtractPortion() {
		List<String> input= Arrays.asList("Banana","Apple","Orange","Pear","Grapes","Kiwi");
		List<String> expected= Arrays.asList("Apple","Orange","Pear");
		assertEquals(expected,ce.extractPortion(input,1,4));
	}
}
