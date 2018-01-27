package in.avalara;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcServiceImplTest {

	@Test
	public void testCalcGrade() {
		CalcServiceImpl calcServiceImpl = new CalcServiceImpl();
		String g = calcServiceImpl.calcGrade(78);
		assertEquals("A", g);
		
		g = calcServiceImpl.calcGrade(62);
		assertEquals("B", g);
		
		g = calcServiceImpl.calcGrade(45);
		assertEquals("C", g);
		
		g = calcServiceImpl.calcGrade(34);
		assertEquals("F", g);
		
		g = calcServiceImpl.calcGrade(-120);
		assertEquals("I", g);
		
		g = calcServiceImpl.calcGrade(1000);
		assertEquals("I", g);
	}

}
