package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T25_A28_LocatingElementbyXPath_RelativePath_TagAndMultipleAttribute_Andoperator {


	@Test
	public void byxpath_relative_tagandmultattribute_andoperator(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@name='FirstName' and @value='Mickey']"));
		inputbox.clear();
		inputbox.sendKeys("Kaveri");
		
		WebElement passbox = driver.findElement(By.xpath("//input[@name='LastName' and @value='Mouse']"));
		passbox.clear();
		passbox.sendKeys("Dhage");		
		
	}


}
