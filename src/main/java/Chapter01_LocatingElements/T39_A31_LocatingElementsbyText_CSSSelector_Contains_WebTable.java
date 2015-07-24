package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T39_A31_LocatingElementsbyText_CSSSelector_Contains_WebTable {
	/*CSS selectors provide the contains() pseudo-class which can be used to see if an element
	contains the specified text. For example, a test wants to locate the cell of a table using its
	contents in the following way:
	WebElement cell =
	driver.findElement(By.cssSelector("td:contains('Item 1')"));
	The contains()pseudo-class accepts the text to be searched as a parameter. It then checks
	all the <td> elements in DOM for the specified text.Selects all siblings	before the current	node.
	The contains() pseudo-class may not work with browsers that don't natively
    support CSS selectors. Also, it has been deprecated from CSS3 specification.
	*/
	
	//DOES NOT WORK
	@Test
	public void descendant(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		//ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement td = driver.findElement(By.cssSelector("td:contains('Doe')"));
		System.out.println(td.getText());
		
					
	}


}
