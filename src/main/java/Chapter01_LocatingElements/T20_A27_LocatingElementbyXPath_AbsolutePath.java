package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T20_A27_LocatingElementbyXPath_AbsolutePath {
		
	@Test
	public void byxpath_absolute(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement emailid = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/form/input[14]"));
		emailid.sendKeys("dhage.prashant@gmail.com");
		
	}



}
