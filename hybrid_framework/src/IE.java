import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Humaira.Jarjees/Downloads/selenium code/POM/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.yahoomail.com");

	}

}
