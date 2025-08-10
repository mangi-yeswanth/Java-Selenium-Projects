package pkg_stringseg;

public class StringExampleCodes {
	public char highestFrequency(String str) {
        int[] freq = new int[400];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int maxFreq = 0;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                result = c;
            }
        }

        return result;
    }

	public String replaceFirstVowel(String str) {
	    return str.replaceFirst("[aeiouAEIOU]", "-");
	}
	
    public int[] countCharTypes(String str) {
        int letters = 0, digits = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else special++;
        }
        int[] result= {letters,digits,special};
        return result;
    }

    public String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public String concatenate(String s1, String s2) {
        return s1.concat(s2);
    }

}
