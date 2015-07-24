package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T31_A29_LocatingElementsbyXpath_attributevaluesonly {
	
	@Test
	public void byattributevalue(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@*='Mickey']"));
		inputbox.clear();
		inputbox.sendKeys("Kaveri");
		
		WebElement passbox = driver.findElement(By.xpath("//input[@*='Mouse']"));
		passbox.clear();
		passbox.sendKeys("Dhage");	
		
	}

}
