package Quizzes;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Quiz2Test {
	
	@Test
	public void testEmpty() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testOneEven() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testOneOdd() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testTwoEvens() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testTwoOdds() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testManyOdds() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(5);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(3);
		expected.add(5);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testManyEvens() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	


	@Test
	public void testMixture1() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testMixture2() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(2);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}
	
	@Test
	public void testMixture3() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(1);
		
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		
		ArrayList<Integer> actual = Quiz2.getOdds(list);
		
		Collections.sort(expected);
		Collections.sort(actual);
		
		assertEquals("Incorrect Result.", expected, actual);
	}

}