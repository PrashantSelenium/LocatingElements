package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T09_A23_LocatingElementbyCSSSeletors_Classattribute2 {
	
	@Test
	public static void cssselectorcalss1(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		WebElement enterbox = driver.findElement(By.cssSelector(".gbqfif"));
		enterbox.sendKeys("Selenium");
		
		
	}

}
