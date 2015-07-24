package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T42_A32_LocatingElementsbyExactText_Xpath_WebTable {
	//Does not work
	@Test
	public void descendant(){
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement td = driver.findElement(By.xpath("//td[='John')]"));
		System.out.println(td.getText());
		
					
	}


}
