import java.awt.Dimension;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
public class calcTest  {

		
		@Test
		public void Action() throws InterruptedException
			{
		// TODO Auto-generated method stub
		WebDriver driver = null;
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sod73.asu.edu/~jbalasoo/fall2014/cse464/hw5/modified/math1.php");
		
		
		
		driver.findElement(By.name("num1")).sendKeys("10");
		Thread.sleep(500);
		driver.findElement(By.name("num2")).sendKeys("5");
		Thread.sleep(500);
		WebElement b1 = driver.findElement(By.cssSelector("input[value='ADD']"));
		b1.click();
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("result")).clear();
		Thread.sleep(500);
		driver.findElement(By.name("num1")).sendKeys("30");
		Thread.sleep(500);
		driver.findElement(By.name("num2")).sendKeys("5");
		Thread.sleep(500);
		WebElement b2 = driver.findElement(By.cssSelector("input[value='SUB']"));
		b2.click();
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	
		
		
		driver.findElement(By.name("result")).clear();
		Thread.sleep(500);
		driver.findElement(By.name("num1")).sendKeys("10");
		Thread.sleep(500);
		driver.findElement(By.name("num2")).sendKeys("7");
		Thread.sleep(500);
		WebElement b3 = driver.findElement(By.cssSelector("input[value='MUL']"));
		b3.click();
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("result")).clear();
		Thread.sleep(500);
		driver.findElement(By.name("num1")).sendKeys("25");
		Thread.sleep(500);
		driver.findElement(By.name("num2")).sendKeys("5");
		Thread.sleep(500);
		WebElement b4 = driver.findElement(By.cssSelector("input[value='DIV']"));
		b4.click();
		Thread.sleep(500);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(500);
		driver.close();
		
		}
}
