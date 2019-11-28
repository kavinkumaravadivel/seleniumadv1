package LibraryFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver startbrowser(String browser,String url) {
		// TODO Auto-generated method stub
		if(browser=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(browser=="firefox")
		{
			System.setProperty("webdriver.geko.driver", "C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
