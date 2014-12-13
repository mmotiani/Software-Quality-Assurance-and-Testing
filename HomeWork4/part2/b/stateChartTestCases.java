import static org.junit.Assert.*;

import org.junit.Test;


public class stateChartTestCases {

	public windshieldWiper testCase;
	
	//****SenseLeverUp****

	@Test
	public void test1() {
	testCase = new windshieldWiper(0, "OFF", 1);
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 6, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test2() {
	testCase = new windshieldWiper(0, "OFF", 2);  
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 12, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test3() {
	testCase = new windshieldWiper(0, "OFF", 3);  
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 20, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	
	@Test
	public void test4() {
	testCase = new windshieldWiper(6, "INT", 1); 
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "LOW", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 30, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	
	}
	@Test
	public void test5() {
	testCase = new windshieldWiper(12, "INT", 2); 
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "LOW", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 30, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	
	}
	@Test
	public void test6() {
	testCase = new windshieldWiper(20, "INT", 3); 
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "LOW", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 30, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	
	}
	
	
	@Test
	public void test7() {
	testCase = new windshieldWiper(30, "LOW", 3); 
	try {
	testCase.senseLeverUp();
	assertEquals("Lever up error: ", "HIGH", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 60, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test8() {
	testCase = new windshieldWiper(60, "HIGH", 1); 
	try {
	testCase.senseLeverUp();
	fail("Expected LeverErrorException");
	} catch (LeverErrorException e) {
	// Exception test succeeded
	}
	}
	
	//****SenseLeverDown****

	@Test
	public void test9() {
	testCase = new windshieldWiper(0, "OFF", 1); 
	try {
	testCase.senseLeverDown();
	fail("Expected LeverErrorException");
	} catch (LeverErrorException e) {
	// Exception test succeeded
	}
	}
	
	@Test
	public void test10() {
	testCase = new windshieldWiper(6, "INT", 1); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "OFF", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 0, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}

	@Test
	public void test11() {
	testCase = new windshieldWiper(12, "INT", 2); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "OFF", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 0, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test12() {
	testCase = new windshieldWiper(20, "INT", 3); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "OFF", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 0, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}

	@Test
	public void test13() {
	testCase = new windshieldWiper(30, "LOW", 1); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 6, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test14() {
	testCase = new windshieldWiper(30, "LOW", 2); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 12, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test15() {
	testCase = new windshieldWiper(30, "LOW", 3); 
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "INT", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 20, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	@Test
	public void test16() {
	testCase = new windshieldWiper(60, "HIGH", 1);
	try {
	testCase.senseLeverDown();
	assertEquals("Lever down error: ", "LOW", testCase.getLeverPosition());
	assertEquals("Wiper speed error: ", 30, testCase.getWiperSpeed());
	} catch (LeverErrorException e) {
	fail("LeverErrorException not expected");
	}
	}
	
	//****SenseDialUp****

	@Test
	public void test17() {
	testCase = new windshieldWiper(20, "INT", 3); 
	try {
	testCase.senseDialUp();
	fail("Expected LeverErrorException");  //Already on highest
	} catch (DialErrorException e) {
	// Exception test succeeded
	}
	}
	
	@Test
	public void test18() {
	testCase = new windshieldWiper(6, "INT", 1); 
	try {
	testCase.senseDialUp();
	assertEquals("Dial up error: ", 2, testCase.getDialPosition());
	assertEquals("Wiper speed error: ", 12, testCase.getWiperSpeed());
	} catch (DialErrorException e) {
	fail("DialErrorException not expected");
	}
	}
	
	@Test
	public void test19() {
	testCase = new windshieldWiper(12, "INT", 2); 
	try {
	testCase.senseDialUp();
	assertEquals("Dial up error: ", 3, testCase.getDialPosition());
	assertEquals("Wiper speed error: ", 20, testCase.getWiperSpeed());
	} catch (DialErrorException e) {
	fail("DialErrorException not expected");
	}
	}
	
	// ****SenseDialDown****

	@Test
	public void test20() {
	testCase = new windshieldWiper(6, "INT", 1); 
	try {
	testCase.senseDialDown();
	fail("Expected LeverErrorException");  //Already on Lowest
	} catch (DialErrorException e) {
	// Exception test succeeded
	}
	}
	
	@Test
	public void test21() {
	testCase = new windshieldWiper(12, "INT", 2); 
	try {
	testCase.senseDialDown();
	assertEquals("Dial up error: ", 1, testCase.getDialPosition());
	assertEquals("Wiper speed error: ", 6, testCase.getWiperSpeed());
	} catch (DialErrorException e) {
	fail("DialErrorException not expected");
	}
	}
	
	@Test
	public void test22() {
	testCase = new windshieldWiper(20, "INT", 3); 
	try {
	testCase.senseDialDown();
	assertEquals("Dial up error: ", 2, testCase.getDialPosition());
	assertEquals("Wiper speed error: ", 12, testCase.getWiperSpeed());
	} catch (DialErrorException e) {
	fail("DialErrorException not expected");
	}
	}
}


