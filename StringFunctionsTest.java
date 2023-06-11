package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	@DisplayName("Positive Tese case")
	public void test1() {
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
		
	}

	@Test
	@DisplayName("Negative Tese case")
	public void test2() {
		Assertions.assertFalse(StringFunctions.isPalindrome("mon"));
	}
	
	@Test
	@DisplayName("Case Sensitive Tese case")
	public void test3() {
		Assertions.assertTrue(StringFunctions.isPalindrome("Dad"));;
	}
}
