package se.iths;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Lab1Test {
	
	static Lab1 lab;

	
	@Before
	public void start(){
		lab = new Lab1();
	}

	
	
	@Test
	public void testAdd() {
		int result = lab.add(5, 10);
		assertEquals(15, result);
		
	}
	
	@Test
	public void testSubtract() {
		int result = lab.subtract(10, 5);
		assertEquals(5, result);
		
	}

	@Test
	public void testMultiply() {
		int result = lab.multiply(5, 5);
		assertEquals(25, result);
		
	}
	
	@Test
	public void testDivide() {
		int result = lab.divide(20, 5);
		assertEquals(4, result);
		
	}
	
	@Test
	public void testReverse(){
		String original = "Konstantin";
		String result = lab.reverse(original);
		assertNotEquals(result, original);
		assertEquals(result, "nitnatsnoK");
	
	}
	
	
	
	@Test 
	public void testQuote() {
		Lab1 Random = new Lab1();
		
		boolean firstFound = false;
		boolean secondFound = false;
		boolean thirdFound = false;
		boolean fourthFound = false;
		boolean fifthFound = false;
		boolean sixthFound = false;
		boolean seventhFound = false;
		boolean eighthFound = false;
		
		
		for (int i=0; i<100; i++) {
			String result = Random.quote();
			System.out.println(result);
			if(result.equals("You must be the change you wish to see in the world. - Mahatma Gandhi")){
				firstFound = true;
			}else if(result.equals("Choose a job you love, and you will never have to work a day in your life. - Confucius")){
				secondFound = true;
			}else if(result.equals("To expect the unexpected shows a thoroughly modern intellect. - Oscar Wilde")){
				thirdFound = true;
			}else if(result.equals("In the End, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King, Jr.")){
				fourthFound = true;
			}else if(result.equals("We cannot solve our problems with the same thinking we used when we created them. - Albert Einstein")){
				fifthFound = true;
			}else if(result.equals("Without music, life would be a mistake. - Friedrich Nietzsche")){
				sixthFound = true;
			}else if(result.equals("I love deadlines. I like the whooshing sound they make as they fly by. - Douglas Adams")){
				seventhFound = true;
			}else if(result.equals("A fool thinks himself to be wise, but a wise man knows himself to be a fool. - William Shakespeare")){
				eighthFound = true;
			}
					
		}
		assertTrue("Should have found qoute from Gandhi", firstFound);
		assertTrue("Should have found quote from Confucius", secondFound);
		assertTrue("Should have found quote from Oscar Wilde", thirdFound);
		assertTrue("Should have found quote from Martin Luther King, Jr.", fourthFound);
		assertTrue("Should have found quote from Albert Einstein", fifthFound);
		assertTrue("Should have found quote from Friedrich Nietzsche", sixthFound);
		assertTrue("Should have found qoute from Douglas Adams", seventhFound);
		assertTrue("Should have found quote from William Shakespeare", eighthFound);
	}
	
	@Test
	public void getCounterTest() {
		int result = Lab1.getCounter();
		assertEquals(105, result);
		System.out.println(result);
	}
	

	
	
	
}  
	
	
	
	

