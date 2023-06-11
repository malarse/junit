package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagsExampleTest {

	@Test
	@DisplayName("this is my Tag Example")
	@Tag("sanity")
	@Tag("Regression")
	public void test1() {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("malayalam"));
		
	}
}
