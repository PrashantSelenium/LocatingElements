package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T11_A24_LocatingElementbyCSSSeletors_IDattribute2 {
	
	@Test
	public static void cssselectorid2(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement enterbox = driver.findElement(By.cssSelector("#Email"));
		enterbox.sendKeys("dhage.prashant");
		
		
	}

}
