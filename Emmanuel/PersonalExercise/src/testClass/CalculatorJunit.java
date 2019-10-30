package testClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorJunit {
	
	Calculator calculate = new Calculator();

	@Test
	void testAdd() {
		assertEquals(4,calculate.add(1, 2));
		
	}
	
	@Test
	void testDivision() {
		assertEquals(2,calculate.division(4, 3));
		
	}


}
