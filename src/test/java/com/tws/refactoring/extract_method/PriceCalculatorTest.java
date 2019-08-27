package com.tws.refactoring.extract_method;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tws.refactoring.extract_variable.PriceCalculator;


public class PriceCalculatorTest {
	@Test
	public void should_return_correct_result_when_quality_more_than_500() {
		//given
		PriceCalculator priceCalculator = new PriceCalculator();
		//when
		double  result = priceCalculator.getPrice(600,10);
		//then
		assertEquals(6050, result, 0);
	}
	
	@Test
	public void should_return_correct_result_when_quality_less_than_500() {
		//given
		PriceCalculator priceCalculator = new PriceCalculator();
		//when
		double  result = priceCalculator.getPrice(300,10);
		//then
		System.out.println(result);
		assertEquals(3100, result, 0);
	}
	
}
