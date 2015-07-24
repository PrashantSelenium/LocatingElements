package Chapter01_LocatingElements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T37_A30_LocatingElementsbyXpath_WebTable_preceding {
	//preceding 
	//Selects all nodes	that appear before 	the current node 	in the document,	except ancestors,attribute nodes, and
	@Test
	public void descendant(){
		//System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement trow = driver.findElement(By.xpath("//td[text()='Doe']/preceding::tr"));
		System.out.println(trow.getText());
		
					
	}


}
