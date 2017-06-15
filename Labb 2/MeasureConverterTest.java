package se.iths;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeasureConverterTest {

	@Test
	public void metricConvert() {
		MeasureConverter converter = new MeasureConverter();
		int mResult = converter.convertWeight(15, true);
		assertEquals(5, mResult);
	}
	@Test
	public void poundConvert() {
		MeasureConverter converter = new MeasureConverter();
		int pResult = converter.convertWeight(7, false);
		assertEquals(18, pResult);
	}
	@Test
	public void feetConvert() {
		MeasureConverter converter = new MeasureConverter();
		int fResult = converter.convertToFeet(300);
		assertEquals(10, fResult);
	}

}

