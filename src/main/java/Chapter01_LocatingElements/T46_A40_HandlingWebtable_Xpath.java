package Chapter01_LocatingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class T46_A40_HandlingWebtable_Xpath {
	@Test
	public static void webtableXpath(){
		
		System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable3.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement robot = driver.findElement(By.xpath("//td[contains(text(),'Nash')]/following-sibling::td/descendant::div/label[contains(text(),'Admin')]/following-sibling::input"));
		System.out.println("Before clicking checkbox --> "+robot.getAttribute("checked"));
		robot.click();
		System.out.println("After clicking checkbox --> "+robot.getAttribute("checked"));
	}

}
