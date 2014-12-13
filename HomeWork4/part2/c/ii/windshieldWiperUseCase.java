import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class windshieldWiperUseCase {

private static windshieldWiper testCase;
	
	@BeforeClass
	public   static void setUpObjects()
	{
		testCase = new windshieldWiper(0, "OFF", 1);
	}
	
	@Test
	public  void UseCasetest1()
	{
		try{
		testCase.senseLeverUp();
		assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
		assertEquals("Result:", 6, testCase.getWiperSpeed());
		}catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
		}

		try{
		testCase.senseDialUp();
		assertEquals("Dial up error: ", 2, testCase.getDialPosition());
		assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
		assertEquals("Result:", 12, testCase.getWiperSpeed());
		}catch (DialErrorException e) {
			fail("DialErrorException not expected");
		}

		try{
		testCase.senseDialUp();
		assertEquals("Dial up error: ", 3, testCase.getDialPosition());
		assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
		assertEquals("Result:", 20, testCase.getWiperSpeed());
		}catch (DialErrorException e) {
			fail("DialErrorException not expected");
		}

		try{
		testCase.senseLeverUp();
		assertEquals("Lever up error: ", "LOW", testCase.getLeverPosition());
		assertEquals("Result:", 30, testCase.getWiperSpeed());
		}catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
		}

		try{
		testCase.senseLeverDown();
		assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
		assertEquals("Dial up error: ", 3, testCase.getDialPosition());
		assertEquals("Result:", 20, testCase.getWiperSpeed());
		}catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
		}

		try{
		testCase.senseLeverDown();
		assertEquals("Lever up error: ", "OFF", testCase.getLeverPosition());
		assertEquals("Dial up error: ", 3, testCase.getDialPosition());
		assertEquals("Result:", 0, testCase.getWiperSpeed());
		}catch (LeverErrorException e) {
			fail("LeverErrorException not expected");
		}
	}
	

}

