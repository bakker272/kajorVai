package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		// walmart example
		/*
		driver.get("http://walmart.com");
		driver.findElement(By.xpath("//*[@id='searchbox']/span/div/div[1]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='searchbox']/span/div/div[2]/span[3]")).click();
		*/
		
		
		//ebay example
		
		  driver.get("http://ebay.com");
	        new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@name='_sacat']"))).build().perform();
	        driver.findElement(By.xpath("//*[@name='_sacat']")).click();
	        System.out.println(driver.findElement(By.xpath("//*[@name='_sacat']")).getText());
		
		
		// barnes and nobel
		/*
		driver.get("http://barnesandnobel.com");
		//driver.findElement(By.xpath("//*[@id='gh-cat']")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//*[@id='quick-search-1-category']")).sendKeys("Books");
	*/
	
	}

}
