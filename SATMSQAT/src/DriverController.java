import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;


public class DriverController {
	model model1 = new model();
	view view1 =  new view();
	customer cust = new customer("MOHIT MOTIANI","4802785779", "1991", 0,0, 5000, 5000);
	customer cust1 = new customer("BASAVAPRASAD CHANDU","0123456789", "1990", 0,0, 5000, 5000);
	controller control = new controller(view1, model1);
	
	@Test
	public void testPANSubmit()
	    {
			view1.getTextInput().setText("0123456789");
			control.PANSubmit();
			String str = view1.getCurrentScreen();
			assertEquals("screen2",str);	
		}
	@Test
	public void testPINSubmit()
	{
		control.setCustomer(cust1);		
		view1.getPasswordInput().setText("1990");
		control.PINSubmit();
		String str1 = view1.getCurrentScreen();
		assertEquals("screen5", str1);
	}
	@Test
	public void testgetCheckingBalance()
	{
		control.setCustomer(cust1);
		control.getCheckingBalance();
		String str2 = view1.getCurrentScreen();
		assertEquals("screen14", str2);
	}
	@Test
	public void testgetSavingBalance()
	{
		control.setCustomer(cust1);
		control.getSavingsBalance();
		String str3 = view1.getCurrentScreen();
		assertEquals("screen14", str3);
	}
	@Test
	public void testcheckWithdrawalSlotStatus()
	{
		control.checkWithdrawalSlotStatus();
		String str4 = view1.getCurrentScreen();
		assertEquals("screen7", str4);
		
	}
	@Test
	public void test1withdrawMoneychecking()
	{
		control.setCustomer(cust1);
		view1.setAccount("checking");
		view1.getTextInput().setText("350");
		control.withdrawMoney();
		String str5 = view1.getCurrentScreen();
		assertEquals("screen11", str5);
	}
	@Test
	public void test2withdrawMoneychecking()
	{
		control.setCustomer(cust1);
		view1.setAccount("checking");
		view1.getTextInput().setText("35");
		control.withdrawMoney();
		String str6 = view1.getCurrentScreen();
		assertEquals("screen7", str6);
	}
	@Test
	public void test3withdrawMoneychecking()
	{
		control.setCustomer(cust1);
		view1.setAccount("checking");
		view1.getTextInput().setText("1000000");
		control.withdrawMoney();
		String str7 = view1.getCurrentScreen();
		assertEquals("screen9", str7);
	}
	@Test
	public void test1withdrawMoneysaving()
	{
		control.setCustomer(cust1);
		view1.setAccount("savings");
		view1.getTextInput().setText("350");
		control.withdrawMoney();
		String str8 = view1.getCurrentScreen();
		assertEquals("screen11", str8);
	}
	@Test
	public void test2withdrawMoneysaving()
	{
		control.setCustomer(cust1);
		view1.setAccount("savings");
		view1.getTextInput().setText("35");
		control.withdrawMoney();
		String str6 = view1.getCurrentScreen();
		assertEquals("screen7", str6);
	}
	@Test
	public void test3withdrawMoneysaving()
	{
		control.setCustomer(cust1);
		view1.setAccount("savings");
		view1.getTextInput().setText("1000000");
		control.withdrawMoney();
		String str7 = view1.getCurrentScreen();
		assertEquals("screen9", str7);
	}
	
	@Test
	public void testcheckDepositEnvelopeSlot()
	{
		control.checkDepositEnvelopeSlot();
		String str8 = view1.getCurrentScreen();
		assertEquals("screen13", str8);
	}
//	@Test
//	public void test1checkDepositEnvelopeSlot()
//	{
//		control.checkDepositEnvelopeSlot();
//		String str8 = view1.getCurrentScreen();
//		assertEquals("screen13", str8);
//	}
	@Test
	public void testDepositMoneychecking()
	{
		control.setCustomer(cust1);
		view1.setAccount("checking");
		view1.getTextInput().setText("50");
		control.depositMoney();
		String str9 = view1.getCurrentScreen();
		assertEquals("screen14", str9);
	}
	@Test
	public void testDepositMoneysaving()
	{
		control.setCustomer(cust1);
		view1.setAccount("savings");
		view1.getTextInput().setText("50");
		control.depositMoney();
		String str9 = view1.getCurrentScreen();
		assertEquals("screen14", str9);
	}
	
	
	
	
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	
//	}
}
