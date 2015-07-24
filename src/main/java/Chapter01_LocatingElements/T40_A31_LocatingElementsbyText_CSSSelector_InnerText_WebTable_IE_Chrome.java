package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T40_A31_LocatingElementsbyText_CSSSelector_InnerText_WebTable_IE_Chrome {
	/*As an alternative for contains() pseudo-class, you can use the innerText attribute
	*/
	
	//DOES NOT WORK
	@Test
	public void descendant(){
		//System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement td = driver.findElement(By.cssSelector("td[innerText='John']"));
		System.out.println(td.getText());
	
							
	}

}
