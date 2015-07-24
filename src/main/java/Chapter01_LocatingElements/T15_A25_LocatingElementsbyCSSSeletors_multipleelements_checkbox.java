package Chapter01_LocatingElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T15_A25_LocatingElementsbyCSSSeletors_multipleelements_checkbox {
	
	@Test
	public static void multipleattribute(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_checkbox");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		
		WebElement box = driver.findElement(By.tagName("form"));
		List<WebElement> checkboxes = box.findElements(By.cssSelector("input[name]"));
		System.out.println("Number of checkboxes are"+checkboxes.size());
		
		Iterator<WebElement> iterate = checkboxes.iterator();
		while(iterate.hasNext()){
			WebElement ckbox = (WebElement) iterate.next();
			ckbox.click();
			
		}
		
		
	}


}
