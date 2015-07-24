package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T38_A30_LocatingElementsbyXpath_WebTable_precedingsibling {
	//precedingsibling
	//Selects all siblings	before the current	node.
	@Test
	public void descendant(){
		//System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement trow = driver.findElement(By.xpath("//td[text()='Doe']/preceding-sibling::td"));
		System.out.println(trow.getText());
		
					
	}


}
