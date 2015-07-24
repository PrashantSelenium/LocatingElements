package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T07_A22_LocatingElementbyCSSSeletors_AbsolutePath {

	@Test
	public void cssabsolutepath(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://google.com");
		
		//WebElement email =driver.findElement(By.cssSelector("html body div div div div div div div div form fieldset div div div table tbody tr td div input"));
		WebElement email =driver.findElement(By.cssSelector("html > body > div > div > div > div > div > div > div > div > form > fieldset > div > div > div > table > tbody > tr > td > div > input"));
		email.clear();
		email.sendKeys("dhage.prashant@gmail.com");
	}
}
