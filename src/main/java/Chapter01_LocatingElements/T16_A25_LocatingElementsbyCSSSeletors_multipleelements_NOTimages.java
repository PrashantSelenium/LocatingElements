package Chapter01_LocatingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T16_A25_LocatingElementsbyCSSSeletors_multipleelements_NOTimages {
	
	@Test
	public void imagesnot(){
		 //InternetExplorerDriver driver;
		//System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("file:///C:/Users/shree/Desktop/HTML/Images.html");
		
        List<WebElement> alt = driver.findElements(By.cssSelector("img[alt]"));
        System.out.println("image with alt attribute" + alt.size());
        
        List<WebElement> noalt = driver.findElements(By.cssSelector("img:not([alt])"));
        System.out.println("image with no alt attribute" + noalt.size());
		
		
	}

}
