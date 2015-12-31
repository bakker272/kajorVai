package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

public class Testing {
	
	@Test
	public void setup() throws InterruptedException{
		int a=21;
		int b=2;
		Assert.assertEquals(a, b);
		
		System.out.println("Completed");
	}
	
	
	@AfterTest
	public void result() throws Exception{
		System.out.println("ready");
		
		
		System.out.println("sent");
		
	}
	
	@AfterSuite
	public void start() throws InterruptedException{
		
		EmailableReportSent.mailing();
		
		
	}

	
}
