package junits;

import java.time.Month;
import java.util.Date;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitParameterizationExample {

	
	@ParameterizedTest
	@ValueSource(strings = {"mom","dad","malayalam","radar","madam"})
	
	public void PalindromeCheck(String str) {
	
		Assertions.assertTrue(StringFunctions.isPalindrome(str));
		
				
	}
	
	@ParameterizedTest
	@ValueSource( ints = { 2,32,24,56})
	public void EvenNumberCheck(int num) {
		Assertions.assertTrue(num % 2 == 0);
	}
	
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month monthname) {
		System.out.println(monthname.name() + " " + monthname.length(false));
	
		Assertions.assertTrue(monthname.length(false) == 30 || monthname.length(false) == 31 || monthname.length(false)== 28);
	
	}

	@ParameterizedTest
	@MethodSource("DataProvider")
	public void PalindromCheck1(String str) {
		
	}
	static Stream<String>DataProvider(){
		return Stream.of("racecasr","radar","mom","dad");
	}
	//static List<String> DataProvider(){
		
		//return List.of("malayalam", "madam", "mom", "dad");
		
	//}
	}
 	
	
	

