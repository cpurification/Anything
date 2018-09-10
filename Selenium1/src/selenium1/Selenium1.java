package selenium1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

		@Test
		public void Login() throws InterruptedException{
		 
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stine\\Downloads\\Selenium Jar Files\\chromedriver.exe"); // Object command for locating chrome driver
		 
		    WebDriver driver = new ChromeDriver();
		   //driver object reference access all the built in function in selenium.
		  
		    driver.manage().window().maximize(); // maximizes window
		 
		    driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true"); 
		    
		    //My practice codes Start /*
		    driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		    driver.findElement(By.cssSelector("#user_pass")).sendKeys("demo123");
		    driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		    //driver.findElement(By.className("wp-menu-name")).click();
		    //driver.findElement(By.tagName(tagName))
		    
		    //My Practice Code End */
		    
		    //driver.findElement(By.id("user_login")).sendKeys("admin");
		    
		    ////driver.findElement(By.id("user_pass")).sendKeys("demo123");
		    
		    //driver.findElement(By.id("wp-submit")).click();
		 
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@class='wp-menu-image dashicons-before dashicons-admin-post']")).click();
//		    
//		    //driver.findElement(By.xpath("#menu-posts")).click();
//		    driver.close();
//		    driver.quit();
}
}