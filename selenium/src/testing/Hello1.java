package testing;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Hello1 implements Helo{

	
	public static void main(String[] args)
	{
		File file = new File("C:\\Users\\Humaira.Jarjees\\Downloads\\IEDriverServer_x64_2.43.0.\\IEDriverServer.exe");
	       System.setProperty("webdriver.ie.driver", file.getAbsolutePath() );  
		
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://yahoo.com");
		
		
		
		
		
		
		
	}
	@Override
	public void method1() {
		System.out.println("hello");
		
	}

}
