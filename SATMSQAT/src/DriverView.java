import static org.junit.Assert.*;

import javax.security.auth.callback.TextInputCallback;

import org.junit.Test;


public class DriverView {
	model model1 = new model();
	view view1 =  new view();
	customer cust = new customer("MOHIT MOTIANI","4802785779", "1991", 0,0, 5000, 5000);
	customer cust1 = new customer("BASAVAPRASAD CHANDU","0123456789", "1990", 0,0, 5000, 5000);
	controller control = new controller(view1, model1);

	@Test
	public void testScreen1()
	{
//		view1.getTextInput().setText("0123456789");
//		String str1= cust1.getPan();
//		assertEquals("0123456789", str1);
		view1.screen1();
		String str = view1.getCurrentScreen();
		assertEquals("screen1",str);
		
		
	}
	
	@Test
	public void testScreen2()
	{

		view1.screen2();
		String str = view1.getCurrentScreen();
		assertEquals("screen2",str);
	}
	
	@Test
	public void testScreen3()
	{

		view1.screen3();
		String str = view1.getCurrentScreen();
		assertEquals("screen3",str);
	}
	
	@Test
	public void testScreen4()
	{

		view1.screen4();
		String str = view1.getCurrentScreen();
		assertEquals("screen4",str);
	}
	
	
	@Test
	public void testScreen5()
	{
		view1.screen5();
		String str = view1.getCurrentScreen();
		assertEquals("screen5",str);
		
	}
	
	@Test
	public void testScreen6()
	{
		view1.screen5();
		String str = view1.getCurrentScreen();
		assertEquals("screen5",str);
	}
	
	@Test
	public void testScreen7()
	{
		view1.screen7();
		String str = view1.getCurrentScreen();
		assertEquals("screen7",str);
	}
	
	@Test
	public void testScreen8()
	{
		view1.screen8();
		String str = view1.getCurrentScreen();
		assertEquals("screen8",str);
	}
	
	@Test
	public void testScreen9()
	{
		view1.screen9();
		String str = view1.getCurrentScreen();
		assertEquals("screen9",str);
	}
	
	@Test
	public void testScreen10()
	{
		view1.screen10();
		String str = view1.getCurrentScreen();
		assertEquals("screen10",str);
	}
	
	@Test
	public void testScreen11()
	{
		view1.screen11();
		String str = view1.getCurrentScreen();
		assertEquals("screen11",str);
	}
	
	@Test
	public void testScreen12()
	{
		view1.screen12();
		String str = view1.getCurrentScreen();
		assertEquals("screen12",str);
	}
	
	@Test
	public void testScreen13()
	{
		view1.screen13();
		String str = view1.getCurrentScreen();
		assertEquals("screen13",str);
	}
	
	@Test
	public void testScreen14()
	{
		view1.screen14();
		String str = view1.getCurrentScreen();
		assertEquals("screen14",str);
	}
	
	@Test
	public void testScreen15()
	{
		view1.screen15();
		String str = view1.getCurrentScreen();
		assertEquals("screen15",str);
	}
//	@Test
//	public void button1()
//	{
//		view1.screen1();
//		view1.getTextInput().setText("0123456789");
//		cust1.getPan();
//	}
}
