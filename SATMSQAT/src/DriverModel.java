import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class DriverModel {
	model model1 = new model();
	view view1 =  new view();
	customer cust = new customer("MOHIT MOTIANI","4802785779", "1991", 0,0, 5000, 5000);
	customer cust1 = new customer("BASAVAPRASAD CHANDU","0123456789", "1990", 0,0, 5000, 5000);
	controller control = new controller(view1, model1);
	@Test
	public void testmodel1()
	{
		ArrayList arr = model1.getListCustomer();
		 customer str = (customer) arr.get(0);
		 assertEquals("BASAVAPRASAD CHANDU",str.getFirstName());
		 assertEquals("0123456789",str.getPan());
		 assertEquals("1990",str.getPin());
		 assertEquals(0,str.getTransactionCountWithdrawal());
		 assertEquals(0,str.getTransactionCountDeposit());
		 assertEquals(5000,str.getCheckingAmount());
		 assertEquals(5000,str.getSavingsAmount());
	}
	@Test
	public void testmodel2()
	{
		ArrayList arr = model1.getListCustomer();
		 customer str = (customer) arr.get(1);
		 assertEquals("MOHIT MOTIANI",str.getFirstName());
		 assertEquals("4802785779",str.getPan());
		 assertEquals("1991",str.getPin());
		 assertEquals(0,str.getTransactionCountWithdrawal());
		 assertEquals(0,str.getTransactionCountDeposit());
		 assertEquals(5000,str.getCheckingAmount());
		 assertEquals(5000,str.getSavingsAmount());
	}
	@Test
	public void testmodel3()
	{
		ArrayList arr = model1.getListCustomer();
		 customer str = (customer) arr.get(2);
		 assertEquals("SAI SASHANK GOPARAJU",str.getFirstName());
		 assertEquals("1234567890",str.getPan());
		 assertEquals("1989",str.getPin());
		 assertEquals(0,str.getTransactionCountWithdrawal());
		 assertEquals(0,str.getTransactionCountDeposit());
		 assertEquals(5000,str.getCheckingAmount());
		 assertEquals(5000,str.getSavingsAmount());
	}
	@Test
	public void testmodel4()
	{
		ArrayList arr = model1.getListCustomer();
		 customer str = (customer) arr.get(3);
		 assertEquals("CHHATRAPAL SISODIYA",str.getFirstName());
		 assertEquals("9876543210",str.getPan());
		 assertEquals("1992",str.getPin());
		 assertEquals(0,str.getTransactionCountWithdrawal());
		 assertEquals(0,str.getTransactionCountDeposit());
		 assertEquals(5000,str.getCheckingAmount());
		 assertEquals(5000,str.getSavingsAmount());
	}
	
	
	@Test
	public void testCustomer()
	{
		
	}
	@Test
	public void testgetisCashDispenserDoorReadygetter()
	{
		//model1.setisCashDispenserDoorReady(true);
		boolean expected_result = model1.getisCashDispenserDoorReady();
		assertEquals(true,expected_result);
	}
	@Test
	public void testgetisCashDispenserDoorReadysetter()
	{
		model1.setisCashDispenserDoorReady(true);
		boolean expected_result = model1.getisCashDispenserDoorReady();
		assertEquals(true,expected_result);
	}
	@Test
	public void testgetAvailableBalaceInMachine()
	{
		int i = (int) model1.getAvailableBalaceInMachine();
		assertEquals(100000,i);
	}
	@Test
	public void testsetAvailableBalaceInMachine()
	{
		int i = (int) model1.getAvailableBalaceInMachine();
		model1.setAvailableBalaceInMachine(100000);
		assertEquals(100000,i);
	}
	@Test
	public void testsetDepositEnvelopedoorReady()
	{
		boolean str = model1.isDepositEnvelopedoorReady();
		assertEquals(true,str);
	}
}
