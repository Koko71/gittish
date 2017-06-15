package se.iths;

import static org.junit.Assert.*;

import org.junit.Test;

public class AmericanizerTest {

	@Test
	public void convertTimeWithoutConverter() {
		Americanizer american = new Americanizer();
		String Time = american.convertTime(10);
		assertEquals(Time, "");
		
	}	
	@Test
	public void convertTimeWithConverterAM() {
		Americanizer american = new Americanizer();
		american.setTimeConverter(new TimeConverter());
		String Time = american.convertTime(6);
		String expected = "6 AM";
		assertEquals(Time, expected);
		System.out.println(american.convertTime(6));
	}
	
	@Test
	public void convertTimeWithConverterPM() {
		Americanizer american = new Americanizer();
		american.setTimeConverter(new TimeConverter());
		String Time = american.convertTime(20);
		String expected = "8 PM";
		assertEquals(Time, expected);
		System.out.println(american.convertTime(20));
		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void convertPoundWithoutConverter() {
		Americanizer american = new Americanizer();
		int pound = american.convertToPound(10);
	}
	
	@Test
	public void convertPoundWithConverter() {
		Americanizer american = new Americanizer();
		american.setWeightConverter(new MeasureConverter());
		int pound = american.convertToPound(27);
		assertEquals(10, pound);
		System.out.println(american.convertToPound(27));
	}
	
	@Test
	public void convertSpeachWithNull() {
		Americanizer american = new Americanizer();
		String speach = american.convertSpeach(null);
		assertEquals("yo dude!" + null + ", you know?", speach);
	}
	
	@Test
	public void convertSpeach() {
		Americanizer american = new Americanizer();
		String speach = american.convertSpeach("Hi");
		assertEquals("yo dude!Hi, you know?", speach);
		System.out.println(american.convertSpeach(speach));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void convertFeetWithoutConverter() {
		Americanizer american = new Americanizer();
		int feet = american.convertToFeet(20);
		
	}
	
	@Test
	public void convertFeetWithConverter() {
		Americanizer american = new Americanizer();
		american.setWeightConverter(new MeasureConverter());
		int feet = american.convertToFeet(30);
		assertEquals(1, feet);
		System.out.println(american.convertToFeet(30));
	}

}