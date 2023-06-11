package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitAnnotations {

	
	@BeforeAll
	public static void method3() {
		System.out.println("This is called before all test cases");
	
	}
	
	
	
	
	@BeforeEach
	public void method1() {
		System.out.println("This is called before each  test cases");
	}
	
	
	
	@Test
	@DisplayName("Positive Tese case")
	public void test1() {
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
		
	}
	
	@Test
	@Disabled
	@DisplayName("Negative Tese case")
	public void test2() {
		Assertions.assertFalse(StringFunctions.isPalindrome("mon"));
	}
	
	@AfterEach
	public void method2() {
		System.out.println("This is called after each test cases");
	}
	@Test
	@Disabled
	@DisplayName("Case Sensitive Tese case")
	public void test3() {
		Assertions.assertTrue(StringFunctions.isPalindrome("Dad"));;
	}
	
	
	@AfterAll
	public static void method4() {
		System.out.println("This is called After all test cases");
	
	}
}
