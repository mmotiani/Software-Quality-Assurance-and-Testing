package a1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleEquivalentTest 
{
	// Weak Robust Test cases
	
		@Test
		public void test1(){
		assertEquals("Equilateral Triangle", Triangle.Triangle_Test(3,3,3));  }  	// Valid Partition
		@Test
		public void test2(){
			assertEquals("Isosceles triangle", Triangle.Triangle_Test(3,4,4));		}			// Valid Partition
		@Test
		public void test3(){
			assertEquals("Scalene Triangle", Triangle.Triangle_Test(7,8,9));		}			// Valid Partition
		@Test
		public void test4(){
			assertEquals("Right Angled and Scalene Triangle", Triangle.Triangle_Test(6,8,10));	}			// Valid Partition
		@Test
		public void test5(){
			assertEquals("Not a triangle", Triangle.Triangle_Test(2,3,8));}				// Valid Partition
		
		@Test
		public void test6(){
			assertEquals("value of a is out of range", Triangle.Triangle_Test(-2,8,10)); }		// Invalid Partition
		@Test
		public void test7(){
			assertEquals("value of b is out of range", Triangle.Triangle_Test(2,-8,10));	}			// Invalid Partition
		@Test
		public void test8(){
			assertEquals("value of c is out of range", Triangle.Triangle_Test(2,8,-10));	}		// Invalid Partition
		@Test
		public void test9(){assertEquals("value of a is out of range", Triangle.Triangle_Test(210,8,10));	}		// Invalid Partition
		@Test
		public void test10(){
			assertEquals("value of b is out of range", Triangle.Triangle_Test(2,210,8));	}		// Invalid Partition
		@Test
		public void test11(){
			assertEquals("value of c is out of range", Triangle.Triangle_Test(2,8,210));	}		// Invalid Partition
	

}
