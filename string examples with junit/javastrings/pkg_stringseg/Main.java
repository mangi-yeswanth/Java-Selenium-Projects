package pkg_stringseg;
public class Main {
    public static void main(String[] args) {
        StringExampleCodes example = new StringExampleCodes();

        // highestFrequency
        String input1 = "successes";
        char highestFreqChar = example.highestFrequency(input1);
        System.out.println("Highest frequency character in " + input1 + " " + highestFreqChar);

        // replaceFirstVowel
        String input2 = "Hello World";
        String replacedVowel = example.replaceFirstVowel(input2);
        System.out.println("After replacing first vowel in " + input2 +" "+ replacedVowel);

        // countCharTypes
        String input3 = "!a2f3g58@";
        int[] counts = example.countCharTypes(input3);
        System.out.println("Letters: " + counts[0] + ", Digits: " + counts[1] + ", Special characters: " + counts[2]);

        // removeSpaces
        String input4 = "Java Is Tooo Goood To        Learn     ";
        String noSpaces = example.removeSpaces(input4);
        System.out.println("Without spaces: " + noSpaces);

        //concatenate
        String s1 = "Hello, ";
        String s2 = "World!";
        String concatenated = example.concatenate(s1, s2);
        System.out.println("Concatenated string: " + concatenated);
    }
}
