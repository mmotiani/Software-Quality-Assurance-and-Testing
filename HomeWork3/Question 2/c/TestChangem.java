package change;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestChangem {

		@Test
		public void test1() {
			int[] first=new int[]{0,1,2,0,3};
			assertArrayEquals(first, change.changeCalc(4, 3.52));
		}	
		
		@Test
		public void test2() {
			int[] second=new int[]{0,2,0,0,0};
			assertArrayEquals(second, change.changeCalc(10, 9.5));
		}
		
				
		@Test
		public void test3() {
			int[] third=new int[]{0,0,0,0,0};
			assertArrayEquals(third, change.changeCalc(5, 10));
		}
		
		@Test
		public void test4() {
			int[] first=new int[]{1,3,0,1,0};
			assertArrayEquals(first, change.changeCalc(10, 8.2));
		}	
		
		@Test
		public void test5() {
			int[] first=new int[]{1,2,0,0,0};
			assertArrayEquals(first, change.changeCalc(3, 1.5));
		}	
		
		@Test
		public void test6() {
			int[] first=new int[]{1,3,0,0,0};
			assertArrayEquals(first, change.changeCalc(10, 8.25));
		}	
		
		@Test
		public void test7() {
			int[] first=new int[]{1,1,2,0,3};
			assertArrayEquals(first, change.changeCalc(5, 3.52));
		}	
		
		@Test
		public void test8() {
			int[] first=new int[]{1,0,0,0,0};
			assertArrayEquals(first, change.changeCalc(4, 3.00));
		}	
	
		@Test
		public void test9() {
			int[] first=new int[]{0,1,0,0,0};
			assertArrayEquals(first, change.changeCalc(4, 3.75));
		}	
		
		@Test
		public void test10() {
			int[] first=new int[]{0,0,0,0,0};
			assertArrayEquals(first, change.changeCalc(3, 3.52));
		}	
		
		@Test
		public void test11() {
			int[] first=new int[]{6,1,2,0,3};
			assertArrayEquals(first, change.changeCalc(10, 3.52));
		}	
		
		@Test
		public void test12() {
			int[] first=new int[]{8,1,2,0,3};
			assertArrayEquals(first, change.changeCalc(12, 3.52));
		}	
		
		@Test
		public void test13() {
			int[] first=new int[]{1,1,2,0,3};
			assertArrayEquals(first, change.changeCalc(12, 0.52));
		}	
		
		@Test
		public void test14() {
			int[] first=new int[]{1,1,2,0,0};
			assertArrayEquals(first, change.changeCalc(5, 3.55));
		}	


}
