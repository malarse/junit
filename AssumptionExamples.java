package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionExamples {

	
	//String environment = "dev";
	
	//String environment = "prod";
	
	String environment = "uat";
	
	@Test
	public void test1() {
		int result = Calculator.add(8,80);
		Assumptions.assumeTrue (this.environment.equals("dev"));
		
		Assertions.assertEquals(88, result);
	}
	
	@Test
	public void test2() {
		int result = Calculator.add(18,80);
		Assumptions.assumeFalse(this.environment.equals("dev"));
		
		Assertions.assertEquals(98, result);
	}
}
