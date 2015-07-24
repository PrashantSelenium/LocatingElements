package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T10_A24_LocatingElementbyCSSSeletors_IDattribute1 {
		
	@Test
	public static void cssselectorid1(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement enterbox = driver.findElement(By.cssSelector("input#Email"));
		enterbox.sendKeys("Selenium");
		
		
	}

}
