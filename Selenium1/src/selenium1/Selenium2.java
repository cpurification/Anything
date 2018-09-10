package selenium1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stine\\Downloads\\Selenium Jar Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("uh-signin")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("cpurification");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("code")).sendKeys("ABCD");
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();	
	}
}
