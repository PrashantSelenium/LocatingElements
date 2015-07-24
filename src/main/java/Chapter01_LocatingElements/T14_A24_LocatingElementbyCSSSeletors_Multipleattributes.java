package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T14_A24_LocatingElementbyCSSSeletors_Multipleattributes {
	
	@Test
	public static void multipleattribute(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement enterbox = driver.findElement(By.cssSelector("input[type=email][name=Email]"));
		enterbox.sendKeys("dhage.prashant");
		
	}


}
