package Chapter01_LocatingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class T47_M12_AnyBrowser {

	public static void main(String[] args) {
		String browser = "Mozilla"; //Read from properties file
		WebDriver driver = null;
		
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM DRIVERS\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", "F:\\SELENIUM DRIVERS\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

}
