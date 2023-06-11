package junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExamples {

	
	//Runtime we can create 
	@TestFactory
	public Collection<DynamicTest> testcases() {
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("positive Testcase to check Palindrome",
						
						() ->Assertions.assertTrue(StringFunctions.isPalindrome("madam"))),
				
				DynamicTest.dynamicTest("negative Testcase to check Palindrome",
						() ->Assertions.assertTrue(StringFunctions.isPalindrome("malar")))
						
				
				
				);
					
	}
	



	
	
}
