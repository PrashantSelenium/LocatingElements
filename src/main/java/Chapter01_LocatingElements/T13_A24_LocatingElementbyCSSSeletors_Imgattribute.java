package Chapter01_LocatingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class T13_A24_LocatingElementbyCSSSeletors_Imgattribute {

	@Test
	public static void cssselectorimg(){
		System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		WebElement imgbox = driver.findElement(By.cssSelector("img[alt=Google]"));
		System.out.println(imgbox.getAttribute("alt"));
		
		
	}

}
