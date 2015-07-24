package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T33_A30_LocatingElementsbyXpath_WebTable_Ancestor {
	//Selects all ancestors
	//(parent, grandparent,
		//	and so on) of the
			//current node.
	@Test
	public void byattributevalue(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
				
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_border_attribute");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.switchTo().frame(1);
		
		WebElement table = driver.findElement(By.xpath("//td[text()='Eve']/ancestor::table"));
		String tblattribute = table.getAttribute("style");
		System.out.println(tblattribute);
				
	}

}
