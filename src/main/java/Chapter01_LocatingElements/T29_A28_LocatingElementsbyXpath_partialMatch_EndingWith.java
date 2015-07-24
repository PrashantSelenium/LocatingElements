package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T29_A28_LocatingElementsbyXpath_partialMatch_EndingWith {

	//not working
	@Test
	public void byid_endingwith(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//input[ends-with(@value,'key')]")));
		WebElement inputbox = driver.findElement(By.xpath("//input[ends-with(@value,'key')]"));
		inputbox.clear();
		inputbox.sendKeys("Kaveri");
		
		WebElement passbox = driver.findElement(By.xpath("//input[ends-with(@value,'use')]"));
		passbox.clear();
		passbox.sendKeys("Dhage");		
		
	}

}
