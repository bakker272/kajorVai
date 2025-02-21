package com.yahoo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.yahoo.xls.Xls_Reader;

public class TestBase {
	
	public static WebDriver driver=null;
	public static Xls_Reader xls=null;
	public static Properties OR=null;
	
	public  static void testBaseStart() throws IOException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		OR=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\yahoo\\src\\com\\yahoo\\config\\OR.properties");
		
		OR.load(fs);
	}
	public  static void input(String xpathkey, String text)
	{
		
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).sendKeys(text);
		
	}
	
	
	public static void click(String xpathkey)
	{
		
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).click();
	}
	
	public static void openBrowser(String url)
	{
		
		driver.get(OR.getProperty(url));
		
	}
	
	

}
