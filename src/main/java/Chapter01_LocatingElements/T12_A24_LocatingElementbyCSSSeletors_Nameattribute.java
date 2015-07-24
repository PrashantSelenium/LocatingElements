package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T12_A24_LocatingElementbyCSSSeletors_Nameattribute {
	
	@Test
	public static void cssselectorname(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement enterbox = driver.findElement(By.cssSelector("input[name=Email]"));
		enterbox.sendKeys("dhage.prashant");
		
		
	}

}
