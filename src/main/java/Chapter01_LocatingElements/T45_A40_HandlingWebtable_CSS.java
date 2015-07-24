package Chapter01_LocatingElements;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

//Did not work
public class T45_A40_HandlingWebtable_CSS {
	@Test
	public static void webtableCSS(){
		
		//WebDriver driver = new FirefoxDriver();
		FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
		FirefoxDriver driver = new FirefoxDriver(binary,null);
		//System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
		//ChromeDriver driver =  new ChromeDriver();
				
		driver.get("C:\\Users\\shree\\Desktop\\HTML\\WebTable3.HTML");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Uncheck admin checkbox
		WebElement adminCheckBox = driver.findElement(By.cssSelector("td:contains('Nash')"));
		System.out.println(adminCheckBox.getText());
		
	}

}
