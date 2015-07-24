package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T03_A18_LocatingElementbyClass {
	@Test
	public void byclass(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement langchooser = driver.findElement(By.className("lang-chooser"));
		langchooser.sendKeys(Keys.DOWN);
		langchooser.sendKeys(Keys.ENTER);
		
	}

}
