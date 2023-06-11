package junits;

public class StringFunctions {

	public static boolean isPalindrome(String str) {
		String reversestring ="";
		for ( int i = str.length()-1;i>=0;i--) {
			reversestring = reversestring + str.charAt(i);
		}
		if(reversestring.equalsIgnoreCase(str)) {
			return true;
			
		}
		else {
			return false;
		}
		}
	}

