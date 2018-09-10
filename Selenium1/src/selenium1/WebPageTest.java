package selenium1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTest {
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stine\\eclipse-workspace\\Selenium1\\driver\\chromedriver.exe");
		
		WebDriver Stine = new ChromeDriver();
	}

}
