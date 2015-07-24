package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T17_A25_LocatingElementsbyCSSSeletors_partialMatch_StartingWith {
	@Test
	public void byid_Startingwith(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement emailid = driver.findElement(By.cssSelector("input[id^='Ema']"));
		emailid.sendKeys("dhage.prashant@gmail.com");
		
	}



}
