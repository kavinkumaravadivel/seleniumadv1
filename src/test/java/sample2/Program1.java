package sample2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\REST Webservice\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demoaut.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]")));
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	Select select = new Select(driver.findElement(By.name("passCount")));
	select.selectByValue("3");
	WebElement from=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
	from.sendKeys("London");
	/*List <WebElement> list=sel.getOptions();
		for(WebElement e:list)
		{			
			String city=e.getText();
			if(city.equals("Paris"))			
			{
				Assert.assertEquals(city, "Paris");
			}
				sel.selectByValue(city);
				break;
		}*/
	
	}

}
