package com.revature.day5;

public class MathApplication {
	private Calculator calc = new CalculatorImpl();
	
	/**
	 * This method adds one and two together and raises that result to the power of the third input
	 * 
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	public double someAdvancedCalculation(double one, double two, double three) {
		return calc.pow(calc.add(one, two), three);
	}
}
