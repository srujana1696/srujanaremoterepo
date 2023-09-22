package com.staragile;

import junit.framework.Assert;
import org.junit.Test;


public class calculatortest {

@Test
	public void testSum() {
		// Given
		calculator calculator = new calculator();
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		calculator calculator = new calculator();
		Assert.assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		calculator calculator = new calculator();
		Assert.assertEquals(2, calculator.divide(6, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		calculator calculator = new calculator();
		calculator.divide(6, 0);
	}
	
}





}

