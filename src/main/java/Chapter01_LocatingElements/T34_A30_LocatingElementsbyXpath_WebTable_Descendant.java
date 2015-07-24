package Chapter01_LocatingElements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T34_A30_LocatingElementsbyXpath_WebTable_Descendant {
	//Selects all	descendants
	//(children,grandchildren, and so on) of the current node.
	@Test
	public void descendant(){
		//System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement tableinput = driver.findElement(By.xpath("//table/descendant::td/input"));
		System.out.println("1st Input tag is--> "+tableinput.getAttribute("value"));
		
		System.out.println("******************************************");
		
		List<WebElement> tableinpts = driver.findElements(By.xpath("//table/descendant::td/input"));
		System.out.println("Number of Input tags in table are --"+tableinpts.size());
		
		System.out.println("******************************************");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amar");
		names.add("Akbar");
		names.add("Anthony");
		
		Iterator it = tableinpts.iterator();
		String[] name = {"Amar","Akbar","Anthony"};
		
		
		int i=0;
		while(it.hasNext()){
			it.next();
			String text = tableinpts.get(i).getAttribute("value");
			System.out.println("Input Tag "+(i+1)+" is -->" +text);
			tableinpts.get(i).clear();
			tableinpts.get(i).sendKeys(name[i]);
			text = tableinpts.get(i).getAttribute("value");
			System.out.println("Input Tag "+(i+1)+" after change is -->" +text);
			i++;
			
		}
						
	}


}
