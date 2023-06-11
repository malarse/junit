package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	
	public void test1()
	{
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(result, 9);
		
		
	}
	@Test
	@Tag("sanity")
	public void test2()
	{
		int result = Calculator.sub(14, 5);
		Assertions.assertEquals(result, 9);
		
		
	}

}
