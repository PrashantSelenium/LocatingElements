package Chapter01_LocatingElements;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T43_A35_LocatingElementsbyJquerySelectors {
	
	@Test
	public static void jqueryselector(){
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("http://dl.dropboxusercontent.com/u/55228056/Locators.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		//Expected list of selected check boxes
		List<String> checked = Arrays.asList(new String[]{"user128_admin","user220_browser"});
             Iterator it = checked.iterator();
             while(it.hasNext()){
            	 System.out.println(it.next());
             }
		
		//create an instance of javascriptexecutor from driver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Locate all the Checkbox which are checked by calling jQuery
		//find() method.
		//find() method returns elements in array
		List<WebElement> elements = (List<WebElement>)js.executeScript("return jQuery.find(':checked')");
		Iterator it1 = elements.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		//verify two checkboxes are selected
		Assert.assertEquals(elements.size(), 2);
		
		//verify correct checkboxes are selected
		for(WebElement element: elements)
		{
			Assert.assertTrue(checked.contains(element.getAttribute("id")));
			element.click();
		}
			
		
		//driver.close();
		
		
	}

}
