import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumHighlights {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver=new FirefoxDriver();
		driver.get("http://google.com");
		//WebElement highligt=driver.findElement(By.xpath("//*[@id='gbqfba']"));
		//elementHighlight(highligt);
		driver.findElement(By.name("q")).sendKeys("hello");
		

	}
	



public static void elementHighlight(WebElement element) throws InterruptedException {
		for (int i = 0; i < 2; i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "color: red; border: 3px solid red;");
			Thread.sleep(3000);
			js.executeScript(
					"arguments[0].setAttribute('style', arguments[1]);",
					element, "");
		}
	
}
}
