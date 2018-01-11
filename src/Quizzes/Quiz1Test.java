package Quizzes;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quiz1Test {

	@Test
	public void testEmpty() {
		int[] test = {};
		double expected = 0.0;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testOnePositive() {
		int[] test = {5};
		double expected = 5.0;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testOneNegative() {
		int[] test = {-13};
		double expected = 0.0;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testOneZero() {
		int[] test = {0};
		double expected = 0.0;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testMultPos() {
		int[] test = {5,18,7,3};
		double expected = 8.25;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testMultMix1() {
		int[] test = {5,-18,8,-2,-3};
		double expected = 6.5;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testMultMix2() {
		int[] test = {5,-18,0,2,-3,4,6};
		double expected = 4.25;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}
	
	@Test
	public void testMultMix3() {
		int[] test = {5,-18,8,0,3};
		double expected = 5.333333;
		double actual = Quiz1.getPositiveAverage(test);
		assertEquals("Incorrect Result.", expected, actual, 0.001);
	}

}