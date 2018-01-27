package in.avalara;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StudentTest {
	
	@Mock
	CalcServiceIntf calcService;

	@Test
	public void testGetDetails() {
		Student student = new Student("mehul", 10, 'm');
		String a = student.getDetails();
		assertEquals("Name : mehul\nRoll : 10\nGender : m", a);
	}
	
	@Test
	public void testGetDetailsWithMarks() {
		Student student = new Student("mehul", 10, 'm', 90, calcService);
		String a = student.getDetails();
		assertEquals("Name : mehul\nRoll : 10\nGender : m\nMarks : 90.00", a);
	}
	
	@Test
	public void testGetGradeDetails() {
		Student student = new Student("mehul", 10, 'm', 90, calcService);
		when(calcService.calcGrade(90)).thenReturn("A");
		String a = student.getGradeDetails();
		assertEquals("Name : mehul\nGrade : A", a);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testGradeDetailsWithNoMarks() {
		Student student = new Student("mehul", 10, 'm');
		student.getGradeDetails();
	}

}
