package Chapter01_LocatingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T44_A37_HandlingWebtable {
	
	@Test
	public static void webtable(){
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable2.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement webtable = driver.findElement(By.id("webtable"));
		
		List<WebElement> noRows = webtable.findElements(By.tagName("tr"));
		System.out.println("Number of rows in the table are --> " + noRows.size());
		
		Assert.assertEquals(noRows.size(), 5);
		
		//Print data from each row
		for(WebElement row: noRows){
			List<WebElement> noColumns = row.findElements(By.tagName("td"));
			for(WebElement cols:noColumns){
				System.out.print(cols.getText() + "\t");
			}
			System.out.println();		
		}
		
		
	}

}
